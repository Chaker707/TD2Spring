package tn.enig.model;

public class Voiture {
	private int id;
	private String marque;
	private String categorie;
	private int dispo;
	public Voiture(int id, String marque, String categorie, int dispo) {
		super();
		this.id = id;
		this.marque = marque;
		this.categorie = categorie;
		this.dispo = dispo;
	}
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getDispo() {
		return dispo;
	}
	public void setDispo(int dispo) {
		this.dispo = dispo;
	}
	
	
}
