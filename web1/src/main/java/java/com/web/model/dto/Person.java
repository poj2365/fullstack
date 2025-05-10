package com.web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
	private String name;
	private int age;
	private double height;
	private String color;
	private String[] animals;
	private String lunch;
	private String info;
	
}
