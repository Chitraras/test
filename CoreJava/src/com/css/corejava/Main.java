package com.css.corejava;
import java.util.Arrays;
public class Main {
	public static void main (String[] args) {
		Trainee[] trainees=new Trainee[3];
		trainees[0]=new Trainee(123, "raj",123 ,"gmail","Male",21);
		trainees[1]=new Trainee(124, "priya", 124,"gmail","FeMale",20);
		trainees[2]=new Trainee(125, "lokesh",125 ,"gmail","Male",21);
		Batch batch=new Batch();
		System.out.println(Arrays.toString(batch.getTrainees(21)));
		System.out.println(Arrays.toString(batch.getTrainees("Male")));
	}

}
