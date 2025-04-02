package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		for(int i=0;i<animal.length;i++) {
			int a = (int)(Math.random() * 2);
			if(a==0) {
				animal[i]= new Dog("바둑이","불독",22);
			}else if(a==1){
				animal[i]= new Cat("초코","페르시안","어딘가","흰색");
			}
		}
		
		for(int i=0;i<animal.length;i++) {
				animal[i].speak();
			}
	}
}
