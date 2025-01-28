package JavaPackage;

import org.testng.annotations.Test;

public class SplitText {
	
	@Test
	public void splitText() {
		
		String Text = "Abi - Nash";
		String splitText[] = Text.split("-");
		System.out.println(splitText[0].trim());
		
	}

}
