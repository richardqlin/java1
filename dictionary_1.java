package com.util;
import java.util.*;

public class dictionary_1{

	public static void main(String[] args){

		Dictionary<Integer, String> d = new Hasttable<Integer, String>();
		d.put(1,"Passion");
		d.put(2,"Motion");
		d.put(3,"Caution");

		Enumeration<Integer> key=d.keys();

		while (key.hasMoreElements()){
			System.out.println(key.nextElement());
		}
		Enumeration<String> element=d.element();
		while (element.hasMoreElements()){
			System.out.println(element.nextElement());
		}
	}
}