package ui;

import model.Stripe;
import threads.StripeThread;

public class Main {
	public static final String ANSI_YELLOW_BACKGROUND = "43m";
	public static final String ANSI_BLUE_BACKGROUND = "44m";
	public static final String ANSI_RED_BACKGROUND = "41m";
	public static void main(String[] args) throws InterruptedException {
		
		Stripe yellowStripe = new Stripe(0, 11, 100, ANSI_YELLOW_BACKGROUND);
		Stripe blueStripe = new Stripe(11, 5, 100, ANSI_BLUE_BACKGROUND);
		Stripe redStripe = new Stripe(16, 5, 100, ANSI_RED_BACKGROUND);
		
		StripeThread yellowStripeThread = new StripeThread(yellowStripe, 5);
		StripeThread blueStripeThread = new StripeThread(blueStripe, 20);
		StripeThread redStripeThread = new StripeThread(redStripe, 25);
		
		yellowStripeThread.start();
		blueStripeThread.start();
		redStripeThread.start();
		
		yellowStripeThread.join();
		blueStripeThread.join();
		redStripeThread.join();
		
	}
	

}
