package javaPackage;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Dategeneration {
	
	
	//Constructor
	private Dategeneration(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		String currentdate = formater.format(date);
		System.out.println("currentdate :" + currentdate);
		System.out.println("Day, Date and Time -:" + date.toString());
		
		
	}

}
