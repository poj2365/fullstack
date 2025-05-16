package com.web.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class AESEncryptor {
	
	// 대칭키 암호화 -> AES
	// 한개의 키로 암호화 복호화 처리할 수 있는 방법
	// 1. 암호화 key를 생성
	// 2. 암호화, 복호화 메소드를 선언
	// Cipher 클래스를 이용해서 암호화, 복호화를 처리함
	// byte[] 로 처리 -> Base64Encoder, Base64Decoder 이용해서 처리
	private static SecretKey key; // 암호화 키
	private String path; // key를 저장하는 파일 위치
	
	public AESEncryptor() {
		this.path = AESEncryptor.class.getResource("/").getPath();
		this.path = this.path.substring(0,this.path.indexOf("target"));
		System.out.println(this.path);
		File keyFile = new File(this.path+"bslove.bs");
		if(!keyFile.exists()) {
			// 생성
			generateKey();
		}else {
			// 가져오기
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(keyFile))) {
				this.key = (SecretKey)ois.readObject();
			}catch(ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private void generateKey() {
		//key 생성하기
		SecureRandom rnd = new SecureRandom();
		KeyGenerator keygen = null;
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.path+"bslove.bs"))) {
			keygen = KeyGenerator.getInstance("AES");
			keygen.init(128,rnd);
			key = keygen.generateKey();
			oos.writeObject(key);
		}catch(NoSuchAlgorithmException | IOException e ) {
			e.printStackTrace();
		}		
	
	}
	
	public static String encryptData(String oriVal) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(cipher.ENCRYPT_MODE, key);
		
		byte[] oriValArr = oriVal.getBytes();
		byte[] encArr = cipher.doFinal(oriValArr);
		
		return Base64.getEncoder().encodeToString(encArr);
	}
	
	public static String decryptData(String encVal) throws Exception{
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(cipher.DECRYPT_MODE, key);
		byte[] encValArr = encVal.getBytes(Charset.forName("utf-8"));
		byte[] decodeArr = Base64.getDecoder().decode(encValArr);
		byte[] oriValArr = cipher.doFinal(decodeArr);
		
		return new String(oriValArr);
	}
	
	
	
	
	
}
