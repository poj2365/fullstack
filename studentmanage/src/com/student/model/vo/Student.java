package com.student.model.vo;

public class Student {// 3/13
	private static int studentIndex = 0;
	private int studentNo;
	private String studentName;
	private int grade;
	private int classroom;
	private String address;
	private String phoneNum;
	private char gender;
	private double height;
	private double weight;
	
	{
		studentNo=++studentIndex;
	}
	public Student() {}
	
	public Student(int no) { //선생님 풀이 생성자를 하나 추가하여 studentno 값을 받음
		this.studentNo=no;
		studentIndex--;
	}
	
	public Student(String name,int grade,int classroom,String address,String phoneNum ,char gender,double height,double weight) {
		this.studentName=name;
		this.grade=grade;
		this.classroom=classroom;
		this.address=address;
		this.phoneNum=phoneNum;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String infoStudent() {
		return "\n학생번호 : "+studentNo+"\n학생 이름 : "+studentName+"\n학년 : "+grade+"\n반 : "+classroom+"\n주소 : "+address
				+"\n전화번호 : "+phoneNum+"\n성별 : "+gender
				+"\n키 : "+height+"\n몸무게 : "+weight;
	}

}
