package org.ubo.dosi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileParser {
	
	
	private ContentHandler contentHandler;

	public FileParser() {

	}


	public FileParser(ContentHandler contentHandler) {

		this.contentHandler = contentHandler;
	}
 
	

	public static void parse(File file,ContentHandler contentHandler){


	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "" ;
		while( (line =br.readLine()) != null){
			contentHandler.defaultLine(line);
		}
		}catch (Exception e) {
			System.out.println("Erreur"+e.getMessage());
		}

		System.out.println("ce fichier :"+file.getName()+" contient "+
		contentHandler.getCompteur()+" ligne(s) dont "+
				contentHandler.getCompteurComment()+" et du commentaires");
	}

	public void setContentHandler(ContentHandler contentHandler) {
		this.contentHandler = contentHandler;
	}

}
