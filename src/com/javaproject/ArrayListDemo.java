package com.javaproject;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		arrayList.add("Ram");
		arrayList.add("Shyam");
		arrayList.add("Dhiraj");
		
		for(String s : arrayList) {
			System.out.println(s);
		}
	}
}
