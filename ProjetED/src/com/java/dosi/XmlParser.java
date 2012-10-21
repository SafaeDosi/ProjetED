package com.java.dosi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlParser {
	
	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	private Document doc;
	private Element nroot;
	int nbparcours;
	
	/**
	 * 
	 * @param path path of XML file
	 * @throws Exception
	 */
		 public XmlParser(String path) {
			 //Chargement du document
			 try{
				 factory = DocumentBuilderFactory.newInstance();
				 builder = factory.newDocumentBuilder() ;
				doc = builder.parse(new File(path));
				this.nroot = doc.getDocumentElement();
			 }
			 catch(Exception e){
				e.printStackTrace();
			 }
		 }
		 
		 
		 /**
             * retourne une liste contenant les id des balise
             **/
	 public List getParcoursName(){
		 // Parcour du document          
			
		 NodeList listeparcours = this.nroot.getElementsByTagName("parcours");
		List<String> lparcoursid = new ArrayList<String>();
		this.nbparcours=listeparcours.getLength();
			for(int i=0; i<this.nbparcours; i++){
				Element e = (Element)listeparcours.item(i);
				//System.out.println(e.getAttribute("name")+"\t"+e.getAttribute("id"));
				lparcoursid.add(e.getAttribute("id"));
				
			}				
		 return lparcoursid;
		 	}
	 /**
	  * cette methode retourne le nombre de parcours
	  * 
	  * @return int
	  */
	 
	 private int getNbparcours(){
		 return this.nbparcours;
	 }

}
