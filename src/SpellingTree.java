
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
		return false;
	}
	
	/**
	 * This method checks if the specified word is in the tree
	 * @param word the word that the tree is checked for
	 * @return true if the word is in the tree
	 */
	public boolean checkWord(String word) {
		return false;
	}
	
	/**
	 * This is a recursive method that is used to print all the words in this subtree
	 * @param subWord the word before the given Node
	 * @param c this is the current relative root of the subtree
	 */
	public void printWords(String subWord, SpellingNode c) {
		
	}
}
