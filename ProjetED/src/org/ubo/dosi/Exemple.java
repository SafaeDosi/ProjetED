package org.ubo.dosi;

import java.io.File;
import java.util.List;

public class Exemple {

	public void ex1(){
		String path="resources/test.txt";
		File f=new File(path);
		ContentHandler conth=new ImpHandler();
		FileParser fp=new FileParser();
		fp.parse(f, conth);
		
	}
	public void ex2(){
		XmlParser xm=new XmlParser("resources/master.xml");
		List l=xm.getParcoursName();
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l);
		}
	}
	public static void main(String[] args) {
		Exemple ex =new Exemple();
		ex.ex1();
		//ex.ex2();

	}

}
