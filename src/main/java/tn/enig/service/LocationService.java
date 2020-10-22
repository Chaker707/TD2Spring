package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.ILocation;
import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;

@Service
public class LocationService implements ILocationService {
	
	@Autowired
	ILocation dao;
	
	public void setDao(ILocation dao) {
		this.dao = dao;
	}

	public void addClient(Client c) {
		dao.addClient(c);
		
	}

	public void addVoiture(Voiture v) {
		dao.addVoiture(v);
		
	}

	public void addContrat(Contrat c) {
		dao.addContrat(c);
		
	}

	public Client getClient(int id) {
		// TODO Auto-generated method stub
		return dao.getClient(id);
	}

	public Voiture getVoiture(int id) {
		// TODO Auto-generated method stub
		return dao.getVoiture(id);
	}

	public List<Voiture> getAllVoituresNonLouees() {
		// TODO Auto-generated method stub
		return dao.getAllVoituresNonLouees();
	}

	public List<Contrat> getAllContrats() {
		// TODO Auto-generated method stub
		return dao.getAllContrats();
	}

	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return dao.getAllClient();
	}

}
