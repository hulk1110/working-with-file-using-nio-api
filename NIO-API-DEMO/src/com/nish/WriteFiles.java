package com.nish;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFiles {
	public static void main(String[] args) {

		Path path = Paths.get("files/debug.txt");
		boolean exists = Files.exists(path);
		System.out.println("Exist-->" + exists);
		// if special character is there use ISO_8859_1
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
				BufferedWriter bufferedWriter2 = new BufferedWriter(bufferedWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter2);) {

			bufferedWriter.write("writing in debug file.....");
			bufferedWriter2.write("i will write more now");
			printWriter.printf("\ni=%d\n", 12);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
