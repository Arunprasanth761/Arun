package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("45 inches");
	}

	public static void main(String[] args) {
		Desktop bj=new Desktop();
		bj.computerModel();
		bj.desktopSize();

	}

}
