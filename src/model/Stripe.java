package model;

public class Stripe {
	public final static String ESC   = "\u001b[";
	public int home;
	public int height;
	public int width;
	public String color;
	
	public Stripe(int home, int h, int w, String c) {
		this.home = home;
		this.height = h;
		this.width = w;
		this.color = ESC + c;
	}
	
	public String paintTopColumn(int x) {
		String s = ESC + x + "G" + ESC + home + "d" + color + " ";
		return s;
	}
	public String paint(int x, int y) {
		String s = ESC + x + "G" + ESC + y + "d" + color + " ";
		//ESC + "B"  down
		//ESC + "D"  left
		return s;
	}
	public int getHome() {
		return home;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public String getColor() {
		return color;
	}
	
}
