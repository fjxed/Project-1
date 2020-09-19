package come.project.commandlinedic;

import java.util.ArrayList;

public class Dictionary {
	public static ArrayList<Word> words = new ArrayList<Word>();
	public static void main(String args[]) {
		DictionaryCommandline dcm =new DictionaryCommandline();
		dcm.dictionaryBasic();
		
	}
}
