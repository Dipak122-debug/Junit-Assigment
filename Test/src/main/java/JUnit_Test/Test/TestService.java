package JUnit_Test.Test;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	
	public int getNameSize(String name) {
		return name.length();
	}

	

}
