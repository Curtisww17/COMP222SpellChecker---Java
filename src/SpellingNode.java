
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
		for (SpellingNode current : children) {
			current = null;
		}
		correctWord = false;
	}
	
	/**
	 * This is a setter method for the correctWord member variable.
	 * Sets it to be true
	 */
	public void setCorrect() {
		correctWord = true;
	}
	
	/**
	 * This is a getter method for the correctWord member variable.
	 * @return
	 */
	public boolean getCorrect() {
		return correctWord;
	}
	
	/**
	 * This method adds a child to this Node
	 * @param val the character that is being added as a child
	 * @return false if the child already exists
	 */
	public boolean addChild(char val) {
		if (getChildAt(val) != null)
			return false;
		children[val - 'A'] = new SpellingNode(val);
		return true;
	}
	
	/**
	 * 
	 * @param val
	 * @return the Node associated with the character given
	 */
	public SpellingNode getChildAt(char val) {
		return children[val - 'A'];
	}
	
}
