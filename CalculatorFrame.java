import javax.swing.JPanel;
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Font;

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
int equalscounter =0; 
int operationsCounter =0;
JButton button1;
JButton button2; 
JButton button3; 
JButton button4;
JButton button5; 
JButton button6;
JButton button7; 
JButton button8; 
JButton button9; 
JButton button0;
JButton equalsButton; 
JButton plusButton;
JButton minusButton; 
JButton devideButton; 
JButton multiplyButton; 
JButton squareRootButton; 
JButton squareButton;
JButton exponentXButton; 
JButton openBrackButton; 
JButton closeBrackButton; 
JButton posToNegButton; 
JButton piButton;
JButton eraseButton; 
JButton dotButton; 
JButton sinButton;
JButton cosButton; 
JButton tanButton; 
JButton deleteButton;
JButton percentageButton; 
JButton absoluteButton;
JTextField textField;
double number1=0;
double number2=0;
double result=0;
char operator;



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
    button1 = new JButton();
    button2 = new JButton(); 
    button3 = new JButton();
    button4 = new JButton();
    button5 = new JButton();
    button6 = new JButton();
    button7 = new JButton(); 
    button8 = new JButton(); 
    button9 = new JButton(); 
    button0 = new JButton(); 
    dotButton = new JButton();
    posToNegButton = new JButton();
    plusButton=new JButton();
    minusButton=new JButton();
    multiplyButton=new JButton(); 
    devideButton = new JButton();
    equalsButton = new JButton();
    squareButton = new JButton(); 
    squareRootButton = new JButton(); 
    exponentXButton = new JButton(); 
    piButton = new JButton();
    eraseButton = new JButton(); 
    sinButton = new JButton(); 
    cosButton = new JButton();
    tanButton=new JButton(); 
    deleteButton = new JButton(); 
    percentageButton = new JButton(); 
    absoluteButton = new JButton();
    
    ArrayList <JButton> buttons = new ArrayList<JButton>();
    /*
       buttons stored into arrayList to run the mothods in less lines of code 
       position 0 to 11 represent the number pannel
       12 to 16 is the operations pannel 
       17 to 29 is the buttons pannel
    */

    buttons.add(button1);
    buttons.add(button2);
    buttons.add(button3);
    buttons.add(button4);
    buttons.add(button5);
    buttons.add(button6);
    buttons.add(button7);
    buttons.add(button8);
    buttons.add(button9);
    buttons.add(button0);
    buttons.add(dotButton);
    buttons.add(posToNegButton);
    buttons.add(devideButton);
    buttons.add(multiplyButton);
    buttons.add(plusButton);
    buttons.add(minusButton);
    buttons.add(equalsButton);
    buttons.add(squareButton);
    buttons.add(squareRootButton);
    buttons.add(percentageButton);
    buttons.add(piButton);
    buttons.add(exponentXButton);
    buttons.add(sinButton);
    buttons.add(cosButton);
    buttons.add(tanButton);
    buttons.add(deleteButton);
    buttons.add(eraseButton);
    buttons.add(absoluteButton);
    
    for(int i =0; i<buttons.size();i++) {
        buttons.get(i).addActionListener(this);
        buttons.get(i).setFocusable(false);
    }

    for (int i = 0; i <=11;i++) {
        buttons.get(i).setBackground(new Color(192,192,192));
    }
    for (int i =12; i <=16;i++) {
       buttons.get(i).setBackground(new Color(249,131,14));
    }
    
    for(int i =17; i <= 27;i++) {
        buttons.get(i).setBackground(new Color(104,152,183));
    }

    button1.setText("1"); 
    button2.setText("2");  
    button3.setText("3"); 
    button4.setText("4"); 
    button5.setText("5");  
    button6.setText("6"); 
    button7.setText("7"); 
    button8.setText("8"); 
    button9.setText("9");  
    button0.setText("0"); 
    dotButton.setText("."); 
    posToNegButton.setText("(+/-)"); 

     numberPanel.add(button1);
     numberPanel.add(button2);
     numberPanel.add(button3);
     numberPanel.add(button4);
     numberPanel.add(button5);
     numberPanel.add(button6);
     numberPanel.add(button7);
     numberPanel.add(button8);
     numberPanel.add(button9);
     numberPanel.add(button0);
     numberPanel.add(dotButton); 
     numberPanel.add(posToNegButton);// adds the buttons to the panel 

    JPanel operationsPannel = new JPanel();  // this panel will contain the operations button therefore +-*/ and =
    operationsPannel.setBounds(275,250,225,215);
    operationsPannel.setLayout(null); // setting layout to null to manually set the bounds for this pannel 
    operationsPannel.setBackground(new Color(64,64,64));

    devideButton.setText("/"); 
    devideButton.setBounds(5, 0, 100, 50);
    multiplyButton.setText("*"); 
    multiplyButton.setBounds(110, 0, 100, 50);
    plusButton.setText("+"); 
    plusButton.setBounds(5, 55, 100, 50);
    minusButton.setText("-"); 
    minusButton.setBounds(110, 55, 100, 50);
    equalsButton.setText("="); 
    equalsButton.setBounds(5, 110, 100,50);
    equalsButton.setText("="); 
    equalsButton.setBounds(5, 110, 100,50);
    
    operationsPannel.add(devideButton);
    operationsPannel.add(minusButton); 
    operationsPannel.add(plusButton); 
    operationsPannel.add(multiplyButton); 
    operationsPannel.add(equalsButton);

    JPanel displayArea = new JPanel();      // this panel will be used to hold the diplay area for the calculator 
    displayArea.setBounds(0,25,500,50);
    textField = new JTextField();
    textField.setPreferredSize(new Dimension(500,50));
    textField.setFont(new Font("Varela Round",Font.BOLD, 35));
    displayArea.add(textField);

    JPanel buttonsPannel = new JPanel(); // this pannel will be used to house the rest of the buttons on the calculator 
    buttonsPannel.setBounds(0, 100,500,150);
    buttonsPannel.setLayout(new GridLayout(3,5,5,5));
    buttonsPannel.setBackground(new Color(64,64,64));

    
    squareButton.setText("X²"); 
    squareRootButton.setText("√"); 
    exponentXButton.setText("N^X");   
    piButton.setText("π");  
    eraseButton.setText("AC"); 
    sinButton .setText("Sin"); 
    cosButton.setText("Cos"); 
    tanButton.setText("Tan"); 
    deleteButton.setText("Del ->"); 
    percentageButton.setText("%"); 
    absoluteButton.setText("Absolute"); 
   
    
    buttonsPannel.add(squareButton);
    buttonsPannel.add(squareRootButton);
    buttonsPannel.add(percentageButton);
    buttonsPannel.add(piButton);
    buttonsPannel.add(exponentXButton);
    buttonsPannel.add(sinButton);
    buttonsPannel.add(cosButton);
    buttonsPannel.add(tanButton);
    buttonsPannel.add(deleteButton);
    buttonsPannel.add(eraseButton);
    buttonsPannel.add(absoluteButton);

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
        else if(e.getSource()== button0){
            textField.setText(textField.getText().concat("0"));
        }
        else if(e.getSource()== button1){
            textField.setText(textField.getText().concat("1"));
        }
        else if(e.getSource()== button2){
            textField.setText(textField.getText().concat("2"));
        }
        else if(e.getSource()== button3){
            textField.setText(textField.getText().concat("3"));
        }
        else if(e.getSource()== button4){
            textField.setText(textField.getText().concat("4"));
        }
        else if(e.getSource()== button5){
            textField.setText(textField.getText().concat("5"));
        }
        else if(e.getSource()== button6){
            textField.setText(textField.getText().concat("6"));
        }
        else if(e.getSource()== button7){
            textField.setText(textField.getText().concat("7"));
        }
        else if(e.getSource()== button8){
            textField.setText(textField.getText().concat("8"));
        }
        else if(e.getSource()== button9){
            textField.setText(textField.getText().concat("9"));
        }
        else if(e.getSource()== posToNegButton){
            number1 = Double.parseDouble(textField.getText());
            number1 = number1 * -1;
            textField.setText(String.valueOf(number1));
        }
          //operation panel
        else if(e.getSource()== plusButton){
            equalscounter --;
            operationsCounter++;
           
            if (operationsCounter ==2) {
             operator = '+';
             number2=Double.parseDouble(textField.getText());
             number1 = number1 + number2;
            textField.setText("");
            
            }
           
            else {
            operator = '+';
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            
            }
            operationsCounter = 1;
        }
        else if(e.getSource()== minusButton){
            operationsCounter++;
            equalscounter--;
            if (operationsCounter ==2) {
                operator = '-';
                number2=Double.parseDouble(textField.getText());
                number1 = number1 - number2;
               textField.setText("");
               
               }
               else {
            operator = '-';
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
           
               }
               operationsCounter = 1;
        }
        else if(e.getSource()== multiplyButton){
            equalscounter --;
            operationsCounter++;
            if (operationsCounter ==2) {
                operator = '*';
                number2=Double.parseDouble(textField.getText());
                number1 = number1 * number2;
               textField.setText("");
               
               }
               else {
            operator = '*';
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
               }
               operationsCounter = 1;
        }
        else if(e.getSource()== devideButton){
            equalscounter --;
            operationsCounter++;
            if (operationsCounter ==2) {
                operator = '/';
                number2=Double.parseDouble(textField.getText());
                number1 = number1 / number2;
               textField.setText("");
               
               }
               else {
            operator = '/';
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
               }
               operationsCounter = 1;
        }
        else if(e.getSource()==  equalsButton){
            equalscounter ++;  
            operationsCounter = 0; 
               if (equalscounter ==2 ) {
                   number2 = number2;
                   
               }
              
               else  {
                number2=Double.parseDouble(textField.getText());
               }
               equalscounter = 1;
        
			switch(operator) {
			case'+':
				result=number1+number2;
				break;
			case'-':
				result=number1-number2;
				break;
			case'*':
				result=number1*number2;
				break;
			case'/':
				result=number1/number2;
				break;
            case '^':
                result = Math.pow(number1, number2);
			}
             if(Math.ceil(result)/Math.floor(result)==1){
                int intResult= (int) result;
                textField.setText(String.valueOf(intResult));
			    number1=intResult;
            }
            else{
                textField.setText(String.valueOf(result));
                number1=result;}
			
		}
        
        //buttons panel
        else if(e.getSource()==  absoluteButton){
            number2 = Double.parseDouble(textField.getText());
            String a = "Absolute ( " +number2+ " )";
            textField.setText(a);
            number2= Math.abs(number2);
            if(Math.ceil(number2)/Math.floor(number2)==1){
            textField.setText(String.valueOf((int) number2));
            }
            else{
            textField.setText(String.valueOf(number2));
            }
        }

        else if(e.getSource()==  eraseButton){
            textField.setText("");
            number1=0;
            number2=0;
        

        }
        else if(e.getSource()== deleteButton) {
            textField.setText(""+textField.getText().substring(0, textField.getText ().length() - 1));
            
        }
        else if(e.getSource()==  percentageButton){
            number2 = Double.parseDouble(textField.getText());
            number2 = number2 /100;
            number2 = number2*number1;
            if(Math.ceil(number2)/Math.floor(number2)==1){
                textField.setText(String.valueOf((int) number2));
                }
                else{
                textField.setText(String.valueOf(number2));
                }
        }

        else if(e.getSource()==  exponentXButton){
            operator = '^';
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
        }


        else if(e.getSource()==  tanButton){
            double num = Double.parseDouble(textField.getText());
            num = Math.tan(num);
            if(Math.ceil(num)/Math.floor(num)==1){
                textField.setText(String.valueOf((int) num));
                }
                else{
                textField.setText(String.valueOf(num));
                }

        }
        else if(e.getSource()==  cosButton){
            double num = Double.parseDouble(textField.getText());
            num = Math.cos(num);
            if(Math.ceil(num)/Math.floor(num)==1){
                textField.setText(String.valueOf((int) num));
                }
                else{
                textField.setText(String.valueOf(num));
                }
        }
        else if(e.getSource()==  sinButton){
            double num = Double.parseDouble(textField.getText());
            num = Math.sin(num);
            if(Math.ceil(num)/Math.floor(num)==1){
                textField.setText(String.valueOf((int) num));
                }
                else{
                textField.setText(String.valueOf(num));
                }
        }
        else if(e.getSource()==  piButton){
            textField.setText(String.valueOf(Math.PI));
        }
        
        else if(e.getSource()==  squareButton){
            
            double num = Double.parseDouble(textField.getText());
            num = num * num;
            if(Math.ceil(num)/Math.floor(num)==1){
                textField.setText(String.valueOf((int) num));
                }
                else{
                textField.setText(String.valueOf(num));
                }
        }
        else if(e.getSource()==  squareRootButton){
            double num = Double.parseDouble(textField.getText());
            num = Math.sqrt(num);
            if(Math.ceil(num)/Math.floor(num)==1){
                textField.setText(String.valueOf((int) num));
                }
                else{
                textField.setText(String.valueOf(num));
                }
        }
        
     }
        
           
          
        
}// end of class 


