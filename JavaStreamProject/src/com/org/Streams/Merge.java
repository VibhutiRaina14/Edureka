package com.org.Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Merge {
	public static void main(String[] args) {
		try(Stream<String> s=Files.lines(Paths.get("/home/labuser/eclipse-workspace/JavaStreamProject/text.txt")))
		{
			s.forEach(System.out::println);
		}
		catch(Exception e)
		{
			System.out.println();
		}
}
}
