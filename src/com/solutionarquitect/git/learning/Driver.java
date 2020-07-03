package com.solutionarquitect.git.learning;
import org.apache.commons.lang3.time.StopWatch;

/**
 * 
 */

/**
 * @author Jose Lara
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Running...");
		
		StopWatch myStopWatch = new StopWatch();
		myStopWatch.start();
		
		performLenghtyProcess();	
		
		myStopWatch.stop();
		
		System.out.println("Finished!");
		System.out.println("Time Processing was: " + myStopWatch.getTime());
	}
	
	private static void performLenghtyProcess() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
