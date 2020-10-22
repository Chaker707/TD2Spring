package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import tn.enig.model.Client;
import tn.enig.model.Contrat;
import tn.enig.model.Voiture;
import tn.enig.service.ILocationService;

@Controller
public class AppLocation {

	@Autowired
	ILocationService service;
	
	public void setService(ILocationService service) {
		this.service = service;
	}
	
	@GetMapping("/home")
	public String get1(Model m) {
		List<Voiture> liste= service.getAllVoituresNonLouees();
		m.addAttribute("liste",liste);
		return "home";		
	}	
	
	@GetMapping("/addClient")
	public String get2(Model m) {
		Client c= new Client();
		m.addAttribute("cl",c);
		return "FormAjoutClient";
	}
	
	@PostMapping("/saveClient")
	public String get3(Model m, @ModelAttribute("cl") Client c) {
		service.addClient(c);
		return "redirect:/home";
	}
	
	@GetMapping("/Contrats")
	public String get4(Model m) {
		List<Contrat> liste= service.getAllContrats();
		m.addAttribute("liste",liste);
		return "ListeContrats";
	}
	
	@GetMapping("/addContrat")
	public String get5(Model m) {
		Contrat c= new Contrat();
		List<Voiture> vts= service.getAllVoituresNonLouees();
		List<Client> clts=service.getAllClient();
		m.addAttribute("vts",vts);
		m.addAttribute("clts",clts);
		m.addAttribute("c",c);
		return "FormAjoutContrat";
	}
	
	@PostMapping("/saveContrat")
	public String get3(Model m, @ModelAttribute("c") Contrat c) {
		service.addContrat(c);
		return "redirect:/Contrats";
	}
	
	
}
