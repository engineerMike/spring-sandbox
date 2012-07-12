package mk.async.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mk.async.service.MailService;

@Service
public class RegularService {

	@Autowired
	private MailService mailService;
	
	public void registerUser(String userName) {
		System.out.println("Register: " + userName);

		System.out.println("Before mailService.sendMail()");
		mailService.sendMail(userName);
		System.out.println("After mailService.sendMail()");
		
		System.out.println("Before mailService.sendMailFuture()");
		Future<Boolean> futureResult = mailService.sendMailFuture(userName);
		System.out.println("After mailService.sendMailFuture()");
		try {
			Boolean result = futureResult.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}