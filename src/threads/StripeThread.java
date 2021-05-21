package threads;

import model.Stripe;

public class StripeThread extends Thread{
	private Stripe stripe;
	private int sleep;
	public StripeThread(Stripe s, int sl) {
		stripe = s;
		sleep = sl;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < stripe.getWidth(); i++) {
				System.out.print(stripe.paintTopColumn(i));
				for(int j = 1; j < stripe.getHeight(); j++) {
					System.out.print(stripe.paint(i,j + stripe.getHome()));
					Thread.sleep(sleep);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
