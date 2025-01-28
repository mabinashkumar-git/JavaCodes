package log4JAlpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.*;

public class Demo {
	
	
	/* Here LogManager is an API and getLogger is a method in it which stores the class path in it as "Classname.class.getName()" .
	 * A object "log" is created */
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.error("Incorrect implmentation");
		if(5>0) {
			log.debug("Checking if no is greater or not");
			log.info("Correct implmentation");
		}
		else {
			log.fatal("No is missing");
			log.error("Incorrect implmentation 1");
		}
	}

}
