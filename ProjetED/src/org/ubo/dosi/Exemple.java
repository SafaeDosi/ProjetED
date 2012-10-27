package org.ubo.dosi;

import java.io.File;
import java.util.Vector;



public class Exemple {

	public Exemple() {
		//exp01();
		exp02();
		
	}

	
	public void exp01(){
		

		ContentHandler contentHandler =  new ContentHandlerImplementation();

		File file = new File("resources/fich.txt");

		FileParser.parse(file,contentHandler);

	}
	void exp02(){
		File file = new File("resources/confComment.yml");
		Object commentaire = SerializeUtilitaire.deserialze(file);
		System.out.println(commentaire);

	}

	public static void main(String[] args) {
		new Exemple();

	}

}
