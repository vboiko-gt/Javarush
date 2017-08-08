
/*
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
	public static TestString testString = new TestString();

	public static void main(String[] args) {

		PrintStream				consoleStream = System.out;

		ByteArrayOutputStream	outputStream = new ByteArrayOutputStream();
		PrintStream				stream = new PrintStream(outputStream);

		System.setOut(stream);
		testString.printSomething();
		String result = outputStream.toString();
		System.setOut(consoleStream);

		result = result.toUpperCase();
		System.out.println(result);
	}

	public static class TestString {
		public void printSomething() {
			System.out.println("it's a text for testing");
		}
	}
}
