package com.java.dosi;

import java.io.File;
import java.util.List;

public class Exemple {

	public void ex1(){
		String path="resources/test.txt";
		File f=new File(path);
		FileParser fp=new FileParser();
		ImpHandler ih=new ImpHandler();
		ih.defaultLine(path);
		fp.parse(f, ih);
	}
	public void ex2(){
		String path="resources/master.xml";
		XmlParseur xp=new XmlParseur(path);
		List lp=xp.getParcoursName();
		for (int i = 0; i < lp.size(); i++) {
			System.out.println(lp);
		}
	}

	public static void main(String[] args) {

		Exemple exe= new Exemple();
		//exe.ex1();
		exe.ex2();
		


	}

}
