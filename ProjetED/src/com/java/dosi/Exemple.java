package com.java.dosi;

import java.io.File;

public class Exemple {


	public static void main(String[] args) {
		String path="resources/test.txt";
		File f=new File(path);
		FileParser fp=new FileParser();
		ImpHandler ih=new ImpHandler();
		ih.defaultLine(path);
		fp.parse(f, ih);

	}

}
