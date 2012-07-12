package mk.async.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mk.async.service.MailService;

@Service
public class RegularService {

	@Autowired
	private MailService mailService;
	
	public void registerUser(String userName) {
		System.out.println("Register: " + userName);
		
		mailService.sendMail(userName);

		System.out.println("Registered. Mail will be send.");
	}

}