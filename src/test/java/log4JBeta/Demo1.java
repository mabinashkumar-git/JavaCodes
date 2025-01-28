package log4JBeta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import log4JAlpha.Demo;

public class Demo1 {

	
	/* Here LogManager is an API and getLogger is a method in it which stores the class path in it as "Classname.class.getName()" .
	 * A object "log" is created */
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(4>0) {
			log.info("Correct implmentation");
		}
		else {
			log.error("Incorrect implmentation");
		}
		

	}

}
