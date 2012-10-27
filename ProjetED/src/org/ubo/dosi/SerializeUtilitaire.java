package org.ubo.dosi;

import java.io.File;
import java.util.Vector;

import org.ho.yaml.Yaml;

public class SerializeUtilitaire {
	
	
	public static void serialize(Vector<Commentaire> commentaires,File file){
		try{
			
		Yaml.dumpStream(commentaires.listIterator(),file,true);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}


	public static Object deserialze(File file){
		try{

		return Yaml.load(file);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

}
