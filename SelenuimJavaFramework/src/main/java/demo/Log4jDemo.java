package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger =LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
	
		System.out.println("\n  Hello world....\n");
	
		logger.trace("this is trace messge");
		logger.info("'this is informtion message ");
		logger.error("'this is an error message ");
		logger.warn("'this is a warning message ");
		logger.fatal("'this is a fatal message ");

	System.out.println("\n  Complted");
	
	}

}
