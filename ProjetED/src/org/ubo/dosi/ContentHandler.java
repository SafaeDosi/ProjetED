package org.ubo.dosi;

public interface ContentHandler {

	void defaultLine(String content);
	int getCompteur();
	void commentLine(String comment);
	int getCompteurComment();

}
