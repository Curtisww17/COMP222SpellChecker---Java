
public class SpellingTree {
	
	public SpellingNode root;
	
	/**
	 * Constructor that creates the tree and initializes the root of the tree.
	 */
	public SpellingTree() {
		root = new SpellingNode(' ');
	}
	
	/**
	 * This method adds the specified word to the tree
	 * @param word the word that will be added
	 * @return false if the word was already in the tree
	 */
	public boolean addWord(String word) {
		if (checkWord(word))
			return false;
		char[] chars = word.toCharArray();
		SpellingNode currentNode = root;
		for (int i = 0; i < chars.length; i++) {
			if (checkChar(chars[i],currentNode))
				currentNode = currentNode.getChildAt(chars[i]);
			else {
				currentNode.addChild(chars[i]);
				currentNode = currentNode.getChildAt((chars[i]));
			}
		}
		currentNode.setCorrect();
		return true;
	}
	
	/**
	 * This method checks if the specified word is in the tree
	 * @param word the word that the tree is checked for
	 * @return true if the word is in the tree
	 */
	public boolean checkWord(String word) {
		SpellingNode currentNode = root;
		char[]  chars = word.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (checkChar(chars[i], currentNode))
				currentNode = currentNode.getChildAt(chars[i]);
			else return false;
		}
		if (currentNode.getCorrect())
			return true;
		else return false;
	}
	
	/**
	 * This is a recursive method that is used to print all the words in this subtree
	 * @param subWord the word before the given Node
	 * @param c this is the current relative root of the subtree
	 */
	public void printWords(String subWord, SpellingNode c) {
		String word = subWord + Character.toString(c.value);
		if (c.getCorrect())
			System.out.println(word);
		for (int i = 0; i < 26; i++) {
			char currentChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i);
			if (c.getChildAt(currentChar) != null)
				printWords(word,c.getChildAt(currentChar));
		}
	}
	
	/**
	 * 
	 * @param val the character checking for
	 * @param c the Node of which we check its children
	 * @return true if val is in the children of c
	 */
	private boolean checkChar(char val, SpellingNode c) {
		if (c.getChildAt(val) != null)
			return true;
		else return false;
	}
}
