package mk.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Async
	public void sendMail(String userName) {
		
		System.out.println("I Will be formatting html mail and sending it");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Asynchronous method call of send email — Complete");
	}

}
