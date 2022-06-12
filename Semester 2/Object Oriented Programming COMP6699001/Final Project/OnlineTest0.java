import java.awt.*;																// importing necessary java libraries that are used
import java.awt.event.*;
import javax.swing.*;

class OnlineTest0 extends JFrame implements ActionListener {					// online test class inherit from jframe to make the window
																				// and implement ActionListener interface for button execution
	JLabel label;																// initialize JLabel constructor
	JRadioButton radioButton[] = new JRadioButton[5];							// initialize JRadioButton constructor for selecting a button from other buttons
	JButton button1;															// initialize JButton constructor as regular button1
	JButton button2;															// initialize JButton constructor as regular button2
	ButtonGroup buttonGroup;													// initialize ButtonGroup constructor to make sure only one button is selected in radio button
	int correctNumbers = 0;														// initialize number of correctNumbers
	int wrongNumbers = 0;														// initialize number of wrongNumbers
	int currentNumber = 0;														// initialize number of currentNumber
	int bookmarkNumber = 1;														// initialize number of bookmarkNumber
	int a = 1;																	// initialize a
	int nowNumber = 0;															// initialize number of nowNumbers
	int bkmrk[] = new int[10];													// initialize array as a container for bookmarked questions

	OnlineTest0(String str) {
		super(str);																// declare window title extending from the jframe

		label = new JLabel();													// initialize new text label
		add(label);																// add text label

		buttonGroup = new ButtonGroup();										// initialize new button group

		for(int i = 0; i < 5; i++) {											// initialize 4 radio buttons to the button group
			radioButton[i] = new JRadioButton();								// initialize radio button in array
			add(radioButton[i]);												// add radio button to window
			buttonGroup.add(radioButton[i]);									// add radio button to button group
		}

		button1 = new JButton("Next");											// initialize "Next" button
		button2 = new JButton("Bookmark");										// initialize "Bookmark" button
		button1.addActionListener(this);										// to execute the button's code whenever a user clicks
		button2.addActionListener(this);
		add(button1);															// add button to the window
		add(button2);
		
		questionsChoices();														// call questionsChoices function

		label.setBounds(60, 40, 450, 20);										// move component between x and y, resize in width and height
		radioButton[0].setBounds(80, 80, 100, 20);
		radioButton[1].setBounds(80, 110, 100, 20);
		radioButton[2].setBounds(80, 140, 100, 20);
		radioButton[3].setBounds(80, 170, 100, 20);
		button1.setBounds(130, 240, 100, 30);
		button2.setBounds(330, 240, 100, 30);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);							// to close as well as exit the program
		setLayout(null);														// set window layout to null to be customizable
		setLocation(250, 100);													// set window location between x and y on the desktop
		setVisible(true);														// to show and hide/minimize the window
		setSize(600, 350);														// set window size
	}

	public void actionPerformed(ActionEvent actionEvent) {						// from actionlistener interface
		if(actionEvent.getSource() == button1) {								// if the "Next" button is pressed

			if(checkAnswer() == true) {											// if check funcion is called and the answer returns true
				correctNumbers = correctNumbers + 1;							// count the amount of correct numbers
			}
			if(checkAnswer() == false) {										// if check funcion is called and the answer returns true
				wrongNumbers = wrongNumbers + 1;								// wrongNumbers add by 1
			}

			currentNumber++;													// add currentNumber - to the next question
			questionsChoices();													// call the questionChoices function

			if(currentNumber == 9) {											// if the user is on the last question
				button1.setEnabled(false);										// disable next button
				button2.setText("Result");										// change "Bookmark" button to show result
			}
		}

		if(actionEvent.getActionCommand().equals("Bookmark")) {					// if "Bookmark" button is pressed
			JButton bk = new JButton("Bookmark" + bookmarkNumber);				// initialize new button "Bookmark1, 2, 3, ..."
			bk.setBounds(480, 20 + 30 * bookmarkNumber, 100, 30);				// set button between x and y, resize in width and height
			add(bk);															// add button
			bk.addActionListener(this);											// execute the button's code

			bkmrk[bookmarkNumber] = currentNumber;								// to go to the question that is bookmarked
			bookmarkNumber++;													// increment bookmarkNumber
			currentNumber++;													// increment currentNumber

			questionsChoices();													// call the questionChoices function

			if(currentNumber == 9) {											// if the user is on the last question
				button2.setText("Result");										// change the button into "Result"
			}

			setVisible(false);
			setVisible(true);
		}

		for(int i = 0, a = 1; i < bookmarkNumber; i++, a++) {					// for every bookmarked question
			if(actionEvent.getActionCommand().equals("Bookmark" + a)) {			// if question is bookmarked
				
				if(checkAnswer() == true) {										// if the answer is correct
					correctNumbers = correctNumbers + 1;						// correctNumbers add by 1
				}
				if(checkAnswer() == false) {									// if check funcion is called and the answer returns true
					wrongNumbers = wrongNumbers + 1;							// wrongNumbers add by 1
				}

				nowNumber = currentNumber;										// onto the next number
				currentNumber = bkmrk[a];										// next number = next bookmarked number

				questionsChoices();												// call the questionsChoices function

				((JButton)actionEvent.getSource()).setEnabled(false);			// disable bookmarked button after pressed
				currentNumber = nowNumber;										// onto the next number
			}
		}
	
		if(actionEvent.getActionCommand().equals("Result")) {					// if "Result" button is pressed
			
			if(checkAnswer() == true) {											// if answered correctly
				correctNumbers = correctNumbers + 1;							// correctNumbers add by 1
			}
			if(checkAnswer() == false) {										// if check funcion is called and the answer returns true
				wrongNumbers = wrongNumbers + 1;								// wrongNumbers add by 1
			}

			currentNumber++;													// increment currentNumber

			JOptionPane.showMessageDialog(this, "Correct answer = " + correctNumbers);	// show window printing correctNumbers
			JOptionPane.showMessageDialog(this, "Wrong answer = " + wrongNumbers);		// show window printing wrongNumbers
			JOptionPane.showMessageDialog(this, "Score = " + correctNumbers + " / " + currentNumber);	// show window printing the score

			System.exit(0);														// exit automatically
		}
	}

	public void questionsChoices() {											// declaring questionsChoices function
		radioButton[4].setSelected(true);										// set radio button to 4 buttons

		if(currentNumber == 0) {												// if currentNumber == 0
			label.setText("1. Which one is not a datatype?");					// set text in label

			radioButton[0].setText("int");										// set text in radio button
			radioButton[1].setText("Float");									// answer
			radioButton[2].setText("boolean");
			radioButton[3].setText("char");	
		}

		if(currentNumber == 1) {
			label.setText("2. Which are not the features of Java?");

			radioButton[0].setText("Polymorphism");
			radioButton[1].setText("Inheritance");
			radioButton[2].setText("Main");										// answer
			radioButton[3].setText("Data Hiding");
		}

		if(currentNumber == 2) {
			label.setText("3. When was Java released?");

			radioButton[0].setText("1975");
			radioButton[1].setText("1985");
			radioButton[2].setText("1995");										// answer
			radioButton[3].setText("2005");
		}

		if(currentNumber == 3) {
			label.setText("4. Which of this class is used by character streams for reading data from buffer?");

			radioButton[0].setText("BufferReader");								// answer
			radioButton[1].setText("InputStreamReader");
			radioButton[2].setText("FileReader");
			radioButton[3].setText("FileInputStream");
		}

		if(currentNumber == 4) {
			label.setText("5. Which one this keywords are used to create a class in java?");

			radioButton[0].setText("struct");
			radioButton[1].setText("class");									// answer
			radioButton[2].setText("int");
			radioButton[3].setText("none of the above");
		}

		if(currentNumber == 5) {
			label.setText("6. Which one among these is not a keyword");

			radioButton[0].setText("class");
			radioButton[1].setText("int");
			radioButton[2].setText("get");										// answer
			radioButton[3].setText("if");
		}

		if(currentNumber == 6) {
			label.setText("7. Execution starts from __________ function");

			radioButton[0].setText("get()");
			radioButton[1].setText("main()");									// answer
			radioButton[2].setText("java()");
			radioButton[3].setText("display()");
		}

		if(currentNumber == 7) {
			label.setText("8. __________ is a collection of elements used to store the same type of data.");

			radioButton[0].setText("Loop");
			radioButton[1].setText("Case");
			radioButton[2].setText("Switch");
			radioButton[3].setText("Array");									// answer
		}

		if(currentNumber == 8) {
			label.setText("9. What is Collection in Java?");
			
			radioButton[0].setText("A group of objects");						// answer
			radioButton[1].setText("A group of interfaces");
			radioButton[2].setText("A group of classes");
			radioButton[3].setText("None of the mentioned");
		}

		if(currentNumber == 9) {
			label.setText("10. Which one among these is not a valid component");

			radioButton[0].setText("JButton");
			radioButton[1].setText("JList");									// answer
			radioButton[2].setText("JButtonGroup");
			radioButton[3].setText("JTextArea");
		}

		label.setBounds(60, 40, 450, 20);										// set label between x and y, resize in width and height

		for(int i = 0, j = 0; i <= 90; i += 30, j++) {							// for every radio button
			radioButton[j].setBounds(80, 80 + i ,200, 20);						// set between x and y, resize in width and height
		}
	}

	public boolean checkAnswer() {												// declaring checkAnswer function
		if(currentNumber == 0) {												// if currentNumber equals
			return(radioButton[1].isSelected());								// return true to correct radio button
		}																		// return false to wrong radio button

		if(currentNumber == 1) {
			return(radioButton[2].isSelected());
		}

		if(currentNumber == 2) {
			return(radioButton[3].isSelected());
		}

		if(currentNumber == 3) {
			return(radioButton[0].isSelected());
		}

		if(currentNumber == 4) {
			return(radioButton[2].isSelected());
		}

		if(currentNumber == 5) {
			return(radioButton[2].isSelected());
		}

		if(currentNumber == 6) {
			return(radioButton[1].isSelected());
		}

		if(currentNumber == 7) {
			return(radioButton[3].isSelected());
		}

		if(currentNumber == 8) {
			return(radioButton[1].isSelected());
		}

		if(currentNumber == 9) {
			return(radioButton[2].isSelected());
		}

		return false;															// return false to wrong radio button
	}

	public static void main(String[] args) {
		new OnlineTest0("Online Test of Java");									// initialize online test with "Online Test of Java" as title
	}
}