package JavaPackage;

import org.testng.annotations.Test;

public class GetterAndSetter {
	
	private String message;
	
	@Test
	public void getMessage() {
		System.out.println("Message is : " + message);
	}
	
	@Test
	public String setMessage(String message) {
		this.message = message;
		return message;
	}
	
	@Test
	public void mainmethod() {
		
		GetterAndSetter getterandsetter = new GetterAndSetter();
		getterandsetter.setMessage("Hello");
		getterandsetter.getMessage();
		
	}

}
