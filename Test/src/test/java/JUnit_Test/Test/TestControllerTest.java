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
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestControllerTest {
	
    @Spy 
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
		int length=testController.getNameSize("Dipak");
		boolean validOrNot=testController.validOrNot(length);
		
		System.out.println("Length -->"+length+"    Validity is --->"+validOrNot);
		
		assertEquals(true,validOrNot);
		
	}
	
	@Test
	@DisplayName(value="NullCheck")
	void nullcheck() {
		
		System.out.println("Name is --> "+testController.getName("Dipak"));
		
		assertNotNull(testController.getName("Dipak"),() -> "Name should not be null");
	}
	
	
	@Test
	@DisplayName(value="CheckEmpty")
	void emptyCheck() {
		
		System.out.println("Name is --> "+testController.getName("Dipak"));
		
		assertNotEquals("",testController.getName("Dipak"));
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
