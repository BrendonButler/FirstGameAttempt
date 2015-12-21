package net.sparkzz.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Brendon Butler on 12/20/2015.
 */
public class Octoball {

	BufferedReader reader;

	public Octoball() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public void prompt() throws IOException {
		System.out.printf("%nWhat is your question?%n> ");
		String input = reader.readLine();

		System.out.printf("Your input: %s%n%n", input);

		if (input.equalsIgnoreCase("quit"))
			Game.stop();
	}
}