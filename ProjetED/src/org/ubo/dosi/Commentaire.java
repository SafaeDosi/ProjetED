package org.ubo.dosi;

import java.io.Serializable;
import java.util.HashMap;

public class Commentaire extends HashMap implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String debutLineText;
	private String debutLineXml;
	private String debutLineLinux;


	public Commentaire() {	
	}


	public Commentaire(String debutLineText, String debutLineXml,
			String debutLineLinux) {
		super();
		this.debutLineText = debutLineText;
		this.debutLineXml = debutLineXml;
		this.debutLineLinux = debutLineLinux;
	}


	public String getDebutLineText() {
		return debutLineText;
	}


	public void setDebutLineText(String debutLineText) {
		this.debutLineText = debutLineText;
	}


	public String getDebutLineXml() {
		return debutLineXml;
	}


	public void setDebutLineXml(String debutLineXml) {
		this.debutLineXml = debutLineXml;
	}


	public String getDebutLineLinux() {
		return debutLineLinux;
	}


	public void setDebutLineLinux(String debutLineLinux) {
		this.debutLineLinux = debutLineLinux;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Commentaire [debutLineText=" + debutLineText
				+ ", debutLineXml=" + debutLineXml + ", debutLineLinux="
				+ debutLineLinux + "]";
	}




}
