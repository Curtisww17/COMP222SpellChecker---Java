import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellChecker {
	
	static SpellingTree myTree;
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		myTree = new SpellingTree();
		readWords("words.txt");
		myTree.printWords("", myTree.root);
		System.out.println("There were " + checkWords("test.txt") + " errors in the file.");
	}
	
	/**
	 * This method reads the file specified in the fileName and spellchecks its contents. It prints each misspelled word.
	 * Ignores punctuation.
	 * @param fileName the file path of the file to be spellchecked.
	 * @return the number of misspelled words in the file given
	 */
	public static int checkWords(String fileName) {
		int count = 0;
		File file = new File(fileName);
		Scanner scan;
		String currentWord;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		}
		System.out.println("\nWords spelled incorrectly:");
		while (scan.hasNext()) {
			currentWord = scan.next().replaceAll("[^a-zA-Z ]", "").toUpperCase(); //Disregards punctuation and changes to uppercase
			if (!myTree.checkWord(currentWord)) {
				count++;
				System.out.println(currentWord);
			}
				
		}
		scan.close();
		return count;
	}
	
	/**
	 * This method reads the file specified and adds the words in the file and adds them to the SpellingTree.
	 * The words in the file are separated by spaces.
	 * @param fileName the file path of the file that contains the words
	 */
	public static void readWords(String fileName) {
		File file = new File(fileName);
		Scanner scan;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		while (scan.hasNext()) {
			myTree.addWord(scan.next().replaceAll("[^a-zA-Z ]", "").toUpperCase()); //Disregards punctuation and changes to uppercase
		}
		
		scan.close();
	}
}
