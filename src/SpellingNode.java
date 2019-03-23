
public class SpellingNode {
	
	public char value;
	private SpellingNode[] children;
	private boolean correctWord;
	
	
	/**
	 * Creates a new Spelling Node
	 * @param val the character that the Node represents
	 */
	public SpellingNode(char val) {
		value = val;
		children = new SpellingNode[26];
		correctWord = false;
	}
	
	/**
	 * This is a setter method for the correctWord member variable.
	 */
	public void setCorrect() {
		
	}
	
	/**
	 * This is a getter method for the correctWord member variable.
	 * @return
	 */
	public boolean getCorrect() {
		return false;
	}
	
	/**
	 * This method adds a child to this Node
	 * @param val the character that is being added as a child
	 * @return false if the child already exists
	 */
	public boolean addChild(char val) {
		return false;
	}
	
	/**
	 * 
	 * @param val
	 * @return the Node associated with the character given
	 */
	public SpellingNode getChildAt(char val) {
		return null;
	}
	
}
