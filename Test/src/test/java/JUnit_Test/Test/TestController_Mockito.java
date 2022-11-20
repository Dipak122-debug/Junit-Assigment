package JUnit_Test.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestController_Mockito {
	
	@Mock 
    private TestService testService;
	 
	
	@InjectMocks
	private TestController testController;
	
	@BeforeAll
	public static void beforeClassFunction() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeFunction() {
		System.out.println("Before Each");
	}
	
	
	@Test
	@DisplayName(value="checkValidity")
	void validName() {
		
		Mockito.when(testService.getNameSize("Dipak")).thenReturn(5);
		int size=testController.getNameSize("Dipak");
		
		System.out.println("Size of Name--> "+size);
		
		assertEquals(5,size);
		
	}
	
	@AfterEach
	public void afterFunction() {
		System.out.println("after Each");
	}
	
	@AfterAll
	public static void afterClassFunction() {
		System.out.println("after All");
	}
	
	

}
