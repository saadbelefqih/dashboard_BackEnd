package ma.dashboard.telecompteur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.dashboard.telecompteur.dto.ConsomDetailsDTO;
import ma.dashboard.telecompteur.repository.ConsomDetailsRepository;

@Service
public class ConsomDetailsService {
	
	@Autowired
	private  ConsomDetailsRepository consomDetailsRepository;


	
	public List<ConsomDetailsDTO> getData() {
		System.out.printf("############### SAAD ####################");
		List<ConsomDetailsDTO> consomDetailsDTOs=consomDetailsRepository.getConsomDetails();
		consomDetailsDTOs.forEach(c->{
			System.out.printf(
							c.toString()
					);
			});
		return consomDetailsRepository.getConsomDetails();
	}

}
