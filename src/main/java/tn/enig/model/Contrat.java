package tn.enig.model;

public class Contrat {
	
	private int id;
	private Client clt;
	private Voiture vt;
	private String debut;
	private String fin;
	
	public Contrat(int id, Client clt, Voiture vt, String debut, String fin) {
		super();
		this.id = id;
		this.clt = clt;
		this.vt = vt;
		this.debut = debut;
		this.fin = fin;
	}
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Client getClt() {
		return clt;
	}
	public void setClt(Client clt) {
		this.clt = clt;
	}
	public Voiture getVt() {
		return vt;
	}
	public void setVt(Voiture vt) {
		this.vt = vt;
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	
	
	
	
}
