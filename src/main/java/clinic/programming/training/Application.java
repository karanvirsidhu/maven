package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words) {
		String[] allWords = StringUtils.split(words, ' ');
		return (allWords == null) ? 0 : allWords.length;
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	int count = app.countWords("I live in Canada");
	System.out.println("Total number of words: "+count);
    }
}