package ma.dashboard.telecompteur.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import ma.dashboard.telecompteur.dto.ConsomDetailsDTO;

@Repository
public class ConsomDetailsRepository  {
	
	/*
	 * 
	 * class ConsomDetailsRepository implements CustomNativeRepository
	 * 
	 * 
	@Query(value ="//JOIN QUERY HERE//", nativeQuery = true)
	List<YourInterface> showDetails();
	
	@Query(value = "SELECT userID, nom,prenom,genre,cIN,num_abonnement,idcompteur,marque,code FROM vue_consom_details",nativeQuery = true)
	List<ConsomDetailsDTO> getConsomDetails();
	*/
	
	
	private final EntityManager em;

	public ConsomDetailsRepository(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<ConsomDetailsDTO> getConsomDetails(){
		List<ConsomDetailsDTO> consomDetailsDTOs= new ArrayList<ConsomDetailsDTO>();
		List<Object[]> results = em.createNativeQuery("SELECT * FROM vue_consom_details").getResultList();
		ConsomDetailsDTO consoDTO = new ConsomDetailsDTO();
		
		results.stream().forEach((record) -> {
			
			consoDTO.setDateMiseEnOeuvre((Date) record[9]);
			consoDTO.setNom((String) record[1]);
			consoDTO.setPrenom((String) record[2]);
			
			consomDetailsDTOs.add(consoDTO);
	});
		
		
		return consomDetailsDTOs;
	}
	
	
	
}
