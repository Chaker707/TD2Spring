package tn.enig.dao;

import java.util.List;

import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;

public interface ILocation {
	public void addClient(Client c);
	public void addVoiture(Voiture v);
	public void addContrat(Contrat c);
	public Client getClient(int id);
	public Voiture getVoiture(int id);
	public List<Voiture> getAllVoituresNonLouees();
	public List<Contrat> getAllContrats();
	public List<Client> getAllClient();
}
