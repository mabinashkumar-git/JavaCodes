package javaBasics;

public class BasicClass implements Basicinterface {

	@Override
	public void coVaxin() {
		// TODO Auto-generated method stub
		System.out.println("2nd dose within 30 days");
	}

	@Override
	public void covishield() {
		// TODO Auto-generated method stub
		System.out.println("2nd dose within 30 days to 86 days");
	}
	
	public void sputnik() {
		System.out.println("Only 1st dose");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Creating "basicclass" as object of "BasicClass" and implementing in "BasicClass" */
		BasicClass basicclass = new BasicClass();
		basicclass.sputnik();
		
		/* Creating "basicclasses" as object of "BasicClass" and implementing in "Basicinterface" */
		Basicinterface basicclasses = new BasicClass();
		basicclasses.coVaxin();       //Overriding
		basicclasses.covishield();    //Overriding
		
		
	}
	
}
