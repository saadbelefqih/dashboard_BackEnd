package ma.dashboard.telecompteur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ma.dashboard.telecompteur.dto.ConsomDetailsDTO;
import ma.dashboard.telecompteur.service.ConsomDetailsService;



@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("/details")
public class ConsomDetailsController {
	@Autowired
	private ConsomDetailsService consomDetailsService;

	public ConsomDetailsController(ConsomDetailsService consomDetailsService) {
		super();
		this.consomDetailsService = consomDetailsService;
	}
	
	
	/*
	 * 	  	@GetMapping("/all")
	    public ResponseEntity<List<Compteur>> getAllCompteurs () {
	        List<Compteur> compteurs = compteurService.getAllCompteurs();
	        return new ResponseEntity<>(compteurs, HttpStatus.OK);
	    }
	 */
	
	@GetMapping("/")
	public ResponseEntity<List<ConsomDetailsDTO>> getAll(){
		return new ResponseEntity<>(consomDetailsService.getData(), HttpStatus.OK);
	}
	
}
