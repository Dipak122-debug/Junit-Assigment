package JUnit_Test.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	public String getName(String name) {
		return name;
	}

	public int getNameSize(String name) {
		
		return testService.getNameSize(name);
	}
	
	public boolean validOrNot(int n) {
		if(n>=4) {
			return true;
		}
		
		return false;
	}
}
