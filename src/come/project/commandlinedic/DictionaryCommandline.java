package come.project.commandlinedic;

public class DictionaryCommandline {
	
	public DictionaryCommandline(){
	
	}
	public static void showAllWords() {
		System.out.println("Commandline Dictionary\n");
		for(Word i :Dictionary.words) {
			System.out.println(i.getWord_target() +" \t " +i.getWord_explain()+"\n");
		}
	}
	
	public static void dictionaryBasic() {
		DictionaryManagement.insertFromCommandline();
		showAllWords();
	}
}
