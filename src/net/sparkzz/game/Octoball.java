package net.sparkzz.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Brendon Butler on 12/20/2015.
 */
public class Octoball {

	private BufferedReader reader;
	private Random random;
	private List<String> answers = new ArrayList<>();

	public Octoball() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		random = new Random();

		answers.add("It is certain");
		answers.add("Yes");
		answers.add("No");
		answers.add("Ask again later");
		answers.add("Very doubtful");
	}

	public void prompt() throws IOException {
		System.out.printf("%nWhat is your question?%n> ");
		String input = reader.readLine();

		if (input.equalsIgnoreCase("quit")) {
			Game.stop();
			return;
		}

		int i = random.nextInt(5);

		System.out.println(answers.get(i));
	}
}