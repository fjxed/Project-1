package come.project.commandlinedic;


import java.util.Scanner;

public class DictionaryManagement {

	public static void insertFromCommandline() {
		System.out.println("Nhap so:\n");
		int n;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = 0; i < n; i++) {
			String wTarget = input.next();
			String wExplain = input.next();
			Word w = new Word(wTarget,wExplain);
			Dictionary.words.add(w);
		}
	}

}
