package com.nish;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFiles {
	public static void main(String[] args) {

		Path path = Paths.get("files/sonnet-ISO.txt");
		boolean exists = Files.exists(path);
		System.out.println("Exist-->" + exists);
		// if special character is there use ISO_8859_1
		try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);) {

			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println("line->" + line);
				line = bufferedReader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
