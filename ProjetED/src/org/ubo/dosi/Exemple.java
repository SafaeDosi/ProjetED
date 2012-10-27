package org.ubo.dosi;

import java.io.File;
import java.util.Vector;

public class Exemple {

	public Exemple() {
		exp01();
		
	}

	
	public void exp01(){
		

		ContentHandler contentHandler =  new ContentHandlerImplementation();

		File file = new File("resources/fich.txt");

		FileParser.parse(file,contentHandler);

	}


	public static void main(String[] args) {
		new Exemple();

	}

}
