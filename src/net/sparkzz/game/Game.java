package net.sparkzz.game;

import java.io.IOException;

/**
 * Created by Brendon Butler on 12/20/2015.
 */
public class Game {

	private static boolean running;
	private static Octoball ball;

	public static void main(String[] args) {
		System.out.println("Mysterious Octoball"); // must avoid copyright at all costs!

		running = true;
		ball = new Octoball();

		run();

		System.out.println("Thank you for playing!");
	}

	private static void run() {
		while (running) {
			try {
				ball.prompt();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	protected static void stop() {
		running = false;
	}
}