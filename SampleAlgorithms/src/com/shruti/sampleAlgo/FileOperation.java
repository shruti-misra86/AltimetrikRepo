package com.shruti.sampleAlgo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileOperation {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("Altimetrik is a good company to work with.",
				"They have clients mostly in the Financial Domain.", "The Pune office leadership is good.");

		try {
			Path filePath = Paths.get("altimetrik.txt");// Paths.get("C:\\Users\\Lenovo\\Desktop\\Altimetrik\\altimetrik.txt")
			Files.write(filePath, lines, StandardCharsets.UTF_8);
			List<String> s = Files.readAllLines(Paths.get("C:\\Users\\Lenovo\\Desktop\\Altimetrik\\test.txt"),
					StandardCharsets.UTF_8);
			String str = Files.lines(Paths.get("C:\\Users\\Lenovo\\Desktop\\Altimetrik\\test.txt")).toString();

			// s.forEach(a -> System.out.print(a + " "));
			int vowels = 0;

			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				// To handle upper case letters
				ch = Character.toLowerCase(ch);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;

			}
			System.out.println("vowel count : " + vowels);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
