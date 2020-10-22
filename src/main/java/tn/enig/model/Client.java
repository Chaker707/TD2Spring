package tn.enig.model;

public class Client {
	private int num;
	private String nom;
	private String adr;
	public Client(int num, String nom, String adr) {
		super();
		this.num = num;
		this.nom = nom;
		this.adr = adr;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	

}
