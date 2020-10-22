package tn.enig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;

@Repository
public class LoactionImpl implements ILocation {
	
	@Autowired
	@Qualifier("dataSource")
	DataSource data;
	
	public void setData(DataSource data) {
		this.data = data;
	}

	public void addClient(Client c) {
		
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("insert into client values(null,?,?)");
			pr.setString(1, c.getNom());
			pr.setString(2, c.getAdr());
			pr.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void addVoiture(Voiture v) {
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("insert into voiture values(null,?,?,?)");
			pr.setString(1, v.getMarque());
			pr.setString(2, v.getCategorie());
			pr.setInt(3, v.getDispo());
			pr.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void addContrat(Contrat c) {
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("insert into contrat values(null,?,?,?,?)");
			pr.setInt(1,c.getClt().getNum());
			pr.setInt(2, c.getVt().getId());
			pr.setString(3, c.getDebut());
			pr.setString(4, c.getFin());
			pr.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public Client getClient(int id) {
		Client clt=null;
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from client where num=?");
			pr.setInt(1,id);
			ResultSet rs=pr.executeQuery();
			if(rs.next()) {
				clt= new Client(rs.getInt("num"), rs.getString("nom"), rs.getString("adr"));
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return clt;
	}

	public Voiture getVoiture(int id) {
		Voiture v=null;
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from voiture where id=?");
			pr.setInt(1,id);
			ResultSet rs=pr.executeQuery();
			if(rs.next()) {
				v= new Voiture(rs.getInt("id"), rs.getString("marque"), rs.getString("categorie")
						, rs.getInt("dispo"));
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return v;
	}

	public List<Voiture> getAllVoituresNonLouees() {
		List<Voiture> liste=null;
		try {
			liste= new ArrayList<Voiture>();
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from voiture where dispo=0");			
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				Voiture v= new Voiture(rs.getInt("id"), rs.getString("marque"), rs.getString("categorie")
						, rs.getInt("dispo"));
				liste.add(v);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return liste;
	}

	public List<Contrat> getAllContrats() {
		List<Contrat> liste=null;
		try {
			liste= new ArrayList<Contrat>();
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from contrat");			
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				Contrat v= new Contrat(rs.getInt("id"), getClient(rs.getInt("id_clt")),
						getVoiture(rs.getInt("id_vt")),rs.getString("debut"),
						rs.getString("fin"));
				liste.add(v);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return liste;
	}

	public List<Client> getAllClient() {
		List<Client> liste=null;
		try {
			liste= new ArrayList<Client>();
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from client");			
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				Client v= new Client(rs.getInt("num"), rs.getString("nom"), rs.getString("adr"));
				liste.add(v);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return liste;
	}

}
