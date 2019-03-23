COMP 222: Introduction to Data Structures and Algorithms
Spring 2019
Program 2 – Spell Checker
Date Released: 03/21/2019	 
Assignment: For this program, we are building a word tree for a spell checker. Our program consists of three classes: SpellingNode, SpellingTree, and SpellChecker.
SpellingNode class:
The SpellingNode class represents one node in the SpellingTree.  Each SpellingNode contains a letter, an array of its children, and a Boolean representing if this letter is the end of a word. The SpellingNode class has the following member variables, constructor and methods.
Member Variables:
-	char value: this is the letter stored at this node. Each SpellingNode except the root needs to store a letter. The root node stores a space character.
-	SpellingNode [] children:  this is the array of children nodes. Each SpellingNode contains an array of 26 children. Some of the children nodes are null when there is no word with this combination of letters.  
-	boolean correctWord: is true when this letter indicates the end of a word. 
Constructor:
-	public SpellingNode (char value): creates a new SpellingNode with the letter specified as its value. It should create the children array but not initialize the children.  The correctWord member variable is initialized to false.
Methods: 
-	public void setCorrect() : this is a setter method for the correctWord member variable.
-	public boolean getCorrect(): this is a getter method for the correctWord member variable.
-	public boolean addChild(char val): this method adds a child to this SpellingNode with the value (letter) specified. If the child already exists, this method should return false. If the child does not exist, it should create a new SpellingNode, add it to the children array, and return true. 
-	public SpellingNode getChildAt(char val): this should return the SpellingNode object stored for the val letter. 






SpellingTree class
The SpellingTree class should implement a tree of SpellingNodes. SpellingTree class has the following structure:
Member Variables: 
-	SpellingNode root: this is a reference to the root of the tree. 
Constructors: 
-	public SpellingTree(): this should create a tree with a root node that has the value of a single space      (' ') 
Methods: 
-	public boolean addWord(String word): this method should add the specified word to the tree.
-	public boolean checkWord(String word): this method should check if the specified word exists in the tree.
-	public void printWords(String subWord, SpellingNode c): this is a recursive method that is used to print all the words in this tree in alphabetical order.
Example: Consider the following SpellingTree that contains the words: A, ARE, ART, I, IN, THE, THEY, WAY
 
Note that in the above figure the nodes whose correctWord member variable is set have double lines. If the printWords method is called on the root, here is the output:
 A
 ARE
 ART
 I
 IN
 THE
 THEY
 WAY



SpellChecker class:
The SpellChecker class should run the whole program so it should have a main method according to the specifications below. In addition, it should have the following static variable and methods. 
Static variables: 
-	SpellingTree mytree: the tree of correct words.
Methods: 
-	main method: the main method should have the following steps:
o	Initialize mytree to an empty SpellingTree. 
o	Call the readWords method with the name of a dictionary file to add words to the tree. You are expected to create your own file of words to test the program with.
o	Print the words stored in the tree using the printWords method in the SpellingTree class.
o	Call and print the results of calling the checkWords method to check the contents of a file. You are expected to create your own file to test your program.
o	Exit the program
You need to submit as part of your program both the dictionary file and the testing file.
-	public static int checkWords(String filename): this method should read the file specified in the filename and spell check its contents. It should print each misspelled word and return the number of misspelled words in the file. This method should ignore any punctuation. 
-	public static void readWords(String filename): this method should read the file specified in the filename string and add the words in the file to the SpellingTree. You may assume this file contains space separated words. 

Instructions: This program is split into two tasks: 
Implement the three classes: SpellingNode, SpellingTree and SpellChecker You may add other variables and methods to these classes if needed. The deliverables are:
-	SpellingNode.java
-	SpellingTree.java
-	SpellChecker.java
-	Dictionary file
-	Testing file
Make sure you comment each of the classes stating any assumptions you made during the implementation. 





Program policies:
•	A program that does not compile or run will not be graded.
•	Extensions will not be granted for technology-related issues.  Leave yourself enough time to complete the assignment, submit the assignment using mygcc, and contact the instructor if you run into problems.
•	This program should be completed by each student. It is not a group project. 
•	Please refer to the syllabus for the academic integrity policy that applies to this course. 

Rubric:	 The points for this program are awarded according to the following:

SpellingNode class
-	Member variables…………………………………………………………………….. 5 points
-	Constructor …………………………………………………………………….. 5 points
Methods:
-	setCorrect() and getCorrect()…………………………………………………………….. 5 points
-	addChild(char val) …………………………………………………………………….. 10 points
-	getChildAt(char val) …………………………………………………………………….. 5 points	30 pts
SpellingTree class
Member variables…………………………………………………………………….. 2.5 points
Constructor…………………………………………………………………….. 2.5 points
Methods:
-	addWord(String word)   ……………………………………………………….. 10 points
-	checkWord(String word) ……………………………………………………….. 10 points
-	printWords(String subWord, SpellingNode c)………………………………….. 20 points	45 pts
SpellChecker class
Methods: 
-	main method…………………………………………………………………….. 5 points
-	readWords(String filename):………………………………………………………….. 10 points
-	checkWords(String filename): ……………………………………………………….. 10 points	25 pts


Submission:	
Assignments must be submitted electronically via my.gcc. Be sure to upload your files correctly the first time. Acceptable document formats include java files.  

