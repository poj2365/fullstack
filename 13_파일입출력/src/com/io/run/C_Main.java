package com.io.run;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.io.controller.B_IOStreamController;
import com.io.controller.C_SubStreamController;
import com.io.model.vo.Animal;
import com.io.model.vo.Snack;

public class C_Main {
	public static void main(String[] args) {
//		new C_SubStreamController().changeStream();
//		new C_SubStreamController().bufferedSave();
//		new C_SubStreamController().bufferedLoad();
//		new C_SubStreamController().dataOutputStream();
//		new C_SubStreamController().dataInputStream();
		Animal[] animal =  new C_SubStreamController().objectOutputStream();
		new C_SubStreamController().objectinputStream(animal);
		
	}
}
