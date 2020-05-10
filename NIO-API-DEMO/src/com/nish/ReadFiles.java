package com.nish;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFiles {
public static void main(String[] args) {
	
	Path path= Paths.get("files/sonnet-UTF8.txt");
	boolean exists = Files.exists(path);
	System.out.println("Exist-->"+exists);
	
	try(BufferedReader bufferedReader= Files.newBufferedReader(path);){
		
		String line = bufferedReader.readLine();
		while (line!=null) {
			System.out.println("line->"+line);
			line = bufferedReader.readLine();
		}
		
	}catch (IOException e) {
		e.printStackTrace();
	}
}
}
