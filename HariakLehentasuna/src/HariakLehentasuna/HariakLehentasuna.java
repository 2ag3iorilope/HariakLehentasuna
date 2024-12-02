package HariakLehentasuna;
/*
 * Prioritate arabera exekutatuko dira hariak
 */

public class HariakLehentasuna extends Thread {
	public HariakLehentasuna(String nombre) {
		super(nombre);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + " -  " + i);
		}
	}

	public static void main(String[] args) {

		HariakLehentasuna hilo1 = new HariakLehentasuna("Hari-Min");
		HariakLehentasuna hilo2 = new HariakLehentasuna("Hari-Norm");
		HariakLehentasuna hilo3 = new HariakLehentasuna("Hari-Max");

		hilo1.setPriority(Thread.MIN_PRIORITY); // Prioritatea
		hilo2.setPriority(Thread.NORM_PRIORITY); // Prioritatea
		hilo3.setPriority(Thread.MAX_PRIORITY); // Prioritatea

		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
