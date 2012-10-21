package org.ubo.dosi;

public interface ContentHandler {

	
	public void defaultLine(String content);
	public void commentLine(String Comment);
	public int getCompteur();
	public int getCompteurComment();
}
