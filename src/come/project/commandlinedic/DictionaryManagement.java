package come.project.commandlinedic;

import java.util.Scanner;

public class DictionaryManagement {
	
	public String insertFromCommandline() {
		Scanner input = new Scanner(System.in);
		String word;

		word = input.nextLine();
		input.close();
		return word;
	}
	
}
