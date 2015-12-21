package net.sparkzz.game;

/**
 * Created by Brendon Butler on 12/20/2015.
 */
public class Game {

	private static boolean running = false;

	public static void main(String[] args) {
		System.out.println("Let's get this started!");

		running = true;

		run();
	}

	private static void run() {
		while (running) {
			try {
				System.out.println("Working!");
				Thread.sleep(16);
			} catch (InterruptedException e) {
				System.out.println("There was an issue running the game loop!");
				running = false;
				e.printStackTrace();
			}
		}
		System.out.println("Thank you for playing!");
	}
}