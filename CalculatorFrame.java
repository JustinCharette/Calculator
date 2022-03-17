import javax.swing.JPanel;
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel;
import java.awt.Color;   
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


public class CalculatorFrame extends JFrame implements ActionListener{
   

// buttons as instance variables as they will be needed in the action event listner method outside the constructor

JButton button1; JButton button2; JButton button3; JButton button4; JButton button5; JButton button6;
JButton button7; JButton button8; JButton button9; JButton button0;JButton equalsButton; JButton plusButton;
JButton minusButton; JButton devideButton; JButton multiplyButton; JButton squareRootButton; JButton squareButton;
JButton exponentXButton; JButton openBrackButton; JButton closeBrackButton; JButton posToNegButton; JButton piButton;
JButton eraseButton; JButton dotButton; JButton sinButton;JButton cosButton; JButton tanButton; JButton deleteButton;
JButton percentageButton; JButton absoluteButton;

JTextField textField;





   public CalculatorFrame() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{


    UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");


    /*
    * this is the basic frame setup methods , getting it to close on exit , setting its size , naming the frame and making it not resizable
    */
    JFrame calculatorFrame = new JFrame();
    calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    calculatorFrame.setResizable(false); 
    calculatorFrame.setSize(500,500);
    calculatorFrame.setTitle("Calculator"); 
    calculatorFrame.setLayout(null); // important or else the pannels take all available room regardless of set bounds method
    calculatorFrame.getContentPane().setBackground(new Color(64,64,64));

   





    // the creation of panels to seperate the frame into seperate parts as the buttons in each section will have their own layout and to make it nicer

    JPanel numberPanel = new JPanel(); // this pannel will be used to hold the number 0-9 buttons and the . button and the positive to ngative button
   // numberPanel.setBackground(Color.red);
    numberPanel.setBounds(0,250,270,210);
    numberPanel.setLayout(new GridLayout(4,3,5,5));
    numberPanel.setBackground(new Color(64,64,64));

    // creating buttons used in this frame
    button1 = new JButton(); button2 = new JButton(); button3 = new JButton(); button4 = new JButton(); button5 = new JButton(); button6 = new JButton();
    button7 = new JButton(); button8 = new JButton(); button9 = new JButton(); button0 = new JButton(); dotButton = new JButton();posToNegButton = new JButton();
    
    
    
    button1.addActionListener(this); 
    button1.setText("1"); 
    button1.setFocusable(false); // makes the white background not visable around the text
    button1.setBackground(new Color(192,192,192));

     button2.addActionListener(this); 
	 button2.setText("2"); 
	 button2.setFocusable(false); // makes the white background not visable around the text
     button2.setBackground(new Color(192,192,192));
     
     button3.addActionListener(this); 
	 button3.setText("3"); 
	 button3.setFocusable(false); // makes the white background not visable around the text
     button3.setBackground(new Color(192,192,192));

     button4.addActionListener(this); 
	 button4.setText("4"); 
	 button4.setFocusable(false); // makes the white background not visable around the text
     button4.setBackground(new Color(192,192,192));

     button5.addActionListener(this); 
	 button5.setText("5"); 
	 button5.setFocusable(false); // makes the white background not visable around the text
     button5.setBackground(new Color(192,192,192));

     button6.addActionListener(this); 
	 button6.setText("6"); 
	 button6.setFocusable(false); // makes the white background not visable around the text
     button6.setBackground(new Color(192,192,192));

     button7.addActionListener(this); 
	 button7.setText("7"); 
	 button7.setFocusable(false); // makes the white background not visable around the text
     button7.setBackground(new Color(192,192,192));

     button8.addActionListener(this); 
	 button8.setText("8"); 
     button8.setFocusable(false);
     button8.setBackground(new Color(192,192,192));

     button9.addActionListener(this); 
	 button9.setText("9"); 
	 button9.setFocusable(false); // makes the white background not visable around the text
     button9.setBackground(new Color(192,192,192));

     button0.addActionListener(this); 
	 button0.setText("0"); 
	 button0.setFocusable(false); // makes the white background not visable around the text
     button0.setBackground(new Color(192,192,192));

     dotButton.addActionListener(this); 
	 dotButton.setText("."); 
	 dotButton.setFocusable(false); // makes the white background not visable around the text
     dotButton.setBackground(new Color(192,192,192));
     
     posToNegButton.addActionListener(this); 
     posToNegButton.setText("(+/-)"); 
     posToNegButton.setFocusable(false);
     posToNegButton.setBackground(new Color(192,192,192));

     numberPanel.add(button1);numberPanel.add(button2);numberPanel.add(button3);numberPanel.add(button4);numberPanel.add(button5);numberPanel.add(button6);numberPanel.add(button7);numberPanel.add(button8);numberPanel.add(button9);numberPanel.add(button0);
     numberPanel.add(dotButton); numberPanel.add(posToNegButton);// adds the buttons to the panel 




    JPanel operationsPannel = new JPanel();  // this panel will contain the operations button therefore +-*/ and =
   // operationsPannel.setBackground(Color.blue);
    operationsPannel.setBounds(275,250,225,215);
    operationsPannel.setLayout(null); // setting layout to null to manually set the bounds for this pannel 
    operationsPannel.setBackground(new Color(64,64,64));

    plusButton=new JButton();minusButton=new JButton();multiplyButton=new JButton(); devideButton = new JButton();equalsButton = new JButton();

    devideButton.addActionListener(this); 
    devideButton.setText("/"); 
    devideButton.setFocusable(false); // makes the white background not visable around the text
    devideButton.setBounds(5, 0, 100, 50);
    devideButton.setBackground(new Color(249,131,14));

    multiplyButton.addActionListener(this); 
    multiplyButton.setText("*"); 
    multiplyButton.setFocusable(false); // makes the white background not visable around the text
    multiplyButton.setBounds(110, 0, 100, 50);
    multiplyButton.setBackground(new Color(249,131,14));

    plusButton.addActionListener(this); 
    plusButton.setText("+"); 
    plusButton.setFocusable(false); // makes the white background not visable around the text
    plusButton.setBounds(5, 55, 100, 50);
    plusButton.setBackground(new Color(249,131,14));

    minusButton.addActionListener(this); 
    minusButton.setText("-"); 
    minusButton.setFocusable(false); // makes the white background not visable around the text
    minusButton.setBounds(110, 55, 100, 50);
    minusButton.setBackground(new Color(249,131,14));

    equalsButton.addActionListener(this); 
    equalsButton.setText("="); 
    equalsButton.setFocusable(false); // makes the white background not visable around the text
    equalsButton.setBounds(5, 110, 100,50);
    equalsButton.setBackground(new Color(249,131,14));

    
    equalsButton.addActionListener(this); 
    equalsButton.setText("="); 
    equalsButton.setFocusable(false); // makes the white background not visable around the text
    equalsButton.setBounds(5, 110, 100,50);
    equalsButton.setBackground(new Color(249,131,14));

    operationsPannel.add(devideButton); operationsPannel.add(minusButton); operationsPannel.add(plusButton); operationsPannel.add(multiplyButton); operationsPannel.add(equalsButton);




    JPanel displayArea = new JPanel();      // this panel will be used to hold the diplay area for the calculator 
    //displayArea.setBackground(Color.green);
    displayArea.setBounds(0,25,500,50);
    textField = new JTextField();
    textField.setPreferredSize(new Dimension(500,50));
    displayArea.add(textField);






    JPanel buttonsPannel = new JPanel(); // this pannel will be used to house the rest of the buttons on the calculator 
    
    buttonsPannel.setBounds(0, 100,500,150);
    buttonsPannel.setLayout(new GridLayout(3,5,5,5));
    buttonsPannel.setBackground(new Color(64,64,64));



    squareButton = new JButton(); squareRootButton = new JButton();  exponentXButton = new JButton(); openBrackButton = new JButton(); closeBrackButton = new JButton(); 
    piButton = new JButton(); eraseButton = new JButton(); sinButton = new JButton(); cosButton = new JButton();tanButton=new JButton(); deleteButton = new JButton(); percentageButton = new JButton(); absoluteButton = new JButton();

    squareButton.addActionListener(this); 
    squareButton.setText("X²"); 
    squareButton.setFocusable(false); // makes the white background not visable around the text
    squareButton.setBackground(new Color(104,152,183));

    squareRootButton.addActionListener(this); 
    squareRootButton.setText("√"); 
    squareRootButton.setFocusable(false); // makes the white background not visable around the text
    squareRootButton.setBackground(new Color(104,152,183));

    exponentXButton.addActionListener(this); 
    exponentXButton.setText("N^X"); 
    exponentXButton.setFocusable(false); // makes the white background not visable around the text
    exponentXButton.setBackground(new Color(104,152,183));

    openBrackButton.addActionListener(this); 
    openBrackButton.setText("("); 
    openBrackButton.setFocusable(false); // makes the white background not visable around the text
    openBrackButton.setBackground(new Color(104,152,183));

    closeBrackButton.addActionListener(this); 
    closeBrackButton.setText(")"); 
    closeBrackButton.setFocusable(false); // makes the white background not visable around the text
    closeBrackButton.setBackground(new Color(104,152,183));


    piButton.addActionListener(this); 
    piButton.setText("π"); 
    piButton.setFocusable(false); // makes the white background not visable around the text
    piButton.setBackground(new Color(104,152,183));

    eraseButton.addActionListener(this); 
    eraseButton.setText("AC"); 
    eraseButton.setFocusable(false); // makes the white background not visable around the text
    eraseButton.setBackground(new Color(104,152,183));

    sinButton .addActionListener(this); 
    sinButton .setText("Sin"); 
    sinButton .setFocusable(false); // makes the white background not visable around the text
    sinButton.setBackground(new Color(104,152,183));

    cosButton.addActionListener(this); 
    cosButton.setText("Cos"); 
    cosButton.setFocusable(false); // makes the white background not visable around the text
    cosButton.setBackground(new Color(104,152,183));

    tanButton.addActionListener(this); 
    tanButton.setText("Tan"); 
    tanButton.setFocusable(false); // makes the white background not visable around the text
    tanButton.setBackground(new Color(104,152,183));

    deleteButton.addActionListener(this); 
    deleteButton.setText("Del ->"); 
    deleteButton.setFocusable(false); // makes the white background not visable around the text
    deleteButton.setBackground(new Color(104,152,183));

    percentageButton.addActionListener(this); 
    percentageButton.setText("%"); 
    percentageButton.setFocusable(false); // makes the white background not visable around the text
    percentageButton.setBackground(new Color(104,152,183));

    
    absoluteButton.addActionListener(this); 
    absoluteButton.setText("Absolute"); 
    absoluteButton.setFocusable(false); // makes the white background not visable around the text
    absoluteButton.setBackground(new Color(104,152,183));
    
    buttonsPannel.add(squareButton);buttonsPannel.add(squareRootButton);buttonsPannel.add(percentageButton);buttonsPannel.add(piButton);buttonsPannel.add(exponentXButton);buttonsPannel.add(sinButton);buttonsPannel.add(cosButton);buttonsPannel.add(tanButton);
    buttonsPannel.add(deleteButton);buttonsPannel.add(eraseButton);buttonsPannel.add(openBrackButton);buttonsPannel.add(closeBrackButton); buttonsPannel.add(absoluteButton);




    calculatorFrame.add(numberPanel);
    calculatorFrame.add(operationsPannel);
    calculatorFrame.add(displayArea);
    calculatorFrame.add(buttonsPannel);
    calculatorFrame.setVisible(true);

   }
   
   




    public void actionPerformed(ActionEvent e) {

        //number panel
        if(e.getSource()== dotButton){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()== button0){
            textField.setText(textField.getText().concat("0"));
        }
        if(e.getSource()== button1){
            textField.setText(textField.getText().concat("1"));
        }
        if(e.getSource()== button2){
            textField.setText(textField.getText().concat("2"));
        }
        if(e.getSource()== button3){
            textField.setText(textField.getText().concat("3"));
        }
        if(e.getSource()== button4){
            textField.setText(textField.getText().concat("4"));
        }
        if(e.getSource()== button5){
            textField.setText(textField.getText().concat("5"));
        }
        if(e.getSource()== button6){
            textField.setText(textField.getText().concat("6"));
        }
        if(e.getSource()== button7){
            textField.setText(textField.getText().concat("7"));
        }
        if(e.getSource()== button8){
            textField.setText(textField.getText().concat("8"));
        }
        if(e.getSource()== button9){
            textField.setText(textField.getText().concat("9"));
        }
        if(e.getSource()== posToNegButton){
            textField.setText(textField.getText().concat("-"));
        }
          //operation panel
        if(e.getSource()== plusButton){
            textField.setText(textField.getText().concat("+"));
        }
        if(e.getSource()== minusButton){
            textField.setText(textField.getText().concat("-"));
        }
        if(e.getSource()== multiplyButton){
            textField.setText(textField.getText().concat("*"));
        }
        if(e.getSource()== devideButton){
            textField.setText(textField.getText().concat("/"));
        }
        if(e.getSource()==  equalsButton){
            textField.setText(textField.getText().concat("="));
        }
        //buttons panel
        if(e.getSource()==  absoluteButton){
            textField.setText(textField.getText().concat("| |"));
        }
        if(e.getSource()==  percentageButton){
            textField.setText(textField.getText().concat("%"));
        }
        if(e.getSource()==  tanButton){
            textField.setText(textField.getText().concat("tan()"));
        }
        if(e.getSource()==  cosButton){
            textField.setText(textField.getText().concat("cos()"));
        }
        if(e.getSource()==  sinButton){
            textField.setText(textField.getText().concat("sin()"));
        }
        if(e.getSource()==  piButton){
            textField.setText(textField.getText().concat("π"));
        }
        if(e.getSource()==  openBrackButton){
            textField.setText(textField.getText().concat("("));
        }
        if(e.getSource()==  closeBrackButton){
            textField.setText(textField.getText().concat(")"));
        }
        if(e.getSource()==  squareButton){
            textField.setText(textField.getText().concat("²"));
        }
        if(e.getSource()==  squareRootButton){
            textField.setText(textField.getText().concat("√"));
        }
        if(e.getSource()==  exponentXButton){
            textField.setText(textField.getText().concat("")); 
        }
     }
        
           
          
        
}// end of class 
