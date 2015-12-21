package net.sparkzz.game;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

		try {
			load();
		} catch (FileNotFoundException exception) {
			System.out.println("Problem loading responses from file!");
			exception.printStackTrace();
			Game.stop();
		}
	}

	public void prompt() throws IOException {
		System.out.printf("%nWhat is your question?%n> ");
		String input = reader.readLine();

		if (input.equalsIgnoreCase("quit")) {
			Game.stop();
			return;
		}

		int i = random.nextInt(answers.size());

		System.out.println(answers.get(i));
	}

	private void load() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("res/responses.txt"));

		while (scanner.hasNextLine()) {
			answers.add(scanner.nextLine());
		}
	}
}