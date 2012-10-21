package org.ubo.dosi;

public class ImpHandler implements ContentHandler{
	
	private int compteur ;
	private int compteurComment ;
	
	public ImpHandler(){
		compteur=0;
		compteurComment=0;
	}

	
	public void defaultLine(String content) {
		if(content.startsWith("#")){
			commentLine(content);
		}
		 compteur++ ;
	}
	
	public void commentLine(String Comment) {
		compteurComment ++ ;
		
	}


	public int getCompteur() {
		return compteur;
	}


	public int getCompteurComment() {
		return compteurComment;
	}

}
