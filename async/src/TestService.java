import org.springframework.context.support.ClassPathXmlApplicationContext;
import mk.async.service.RegularService;

/**
 * Based on:
 * http://www.skill-guru.com/blog/2010/01/13/asynchronous-method-invocation-in-spring-3-0/
 * 
 * @author m.kowaliszyn
 *
 */
public class TestService {

	public static void main(String args[]){
	
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
		RegularService regService = (RegularService) appContext.getBean("regularService");
		
		regService.registerUser("Warren");
		
	}

}
