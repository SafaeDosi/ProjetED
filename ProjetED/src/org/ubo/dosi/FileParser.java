package org.ubo.dosi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.ContentHandler;

public class FileParser extends ImpHandler{
	
	
	public void parse(File file, ImpHandler handler ) {
		try {
			BufferedReader buf=new BufferedReader(new FileReader(file));
			try{
			String ligne ;
			while ((ligne=buf.readLine()) != null) {
				System.out.println(ligne);
				handler.defaultLine(ligne);
				
				
			}}
			finally{
				buf.close();
			}
		} catch (Exception e) {
			System.out.println("Erreur :"+e);
		}
		
		
	}

	


}
