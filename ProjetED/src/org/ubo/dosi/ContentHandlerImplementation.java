package org.ubo.dosi;

public class ContentHandlerImplementation implements ContentHandler {

	private int compteur;
	private int compteurComment;	
	public ContentHandlerImplementation() {
		compteur = 0;
		compteurComment = 0;
	}

	
	public void defaultLine(String content) {

		if(content.startsWith("#")){
			commentLine(content);
		}
		compteur ++;

	}

	
	public int getCompteur() {
		return compteur;
	}

	
	public void commentLine(String comment) {
		compteurComment ++;
	}

	
	public int getCompteurComment() {
		return compteurComment;
	}


	





}
