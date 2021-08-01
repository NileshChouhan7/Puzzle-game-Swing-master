/* save     ----  Puzzle.java
   compile  ----- javac Puzzle.java
   run      ----- java Puzzle
*/
import javax.swing.*;
import java.awt.event.*;
public class Puzzle extends JFrame implements ActionListener
{
	
	String name;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,next;

	Puzzle(){
		super("Puzzle Game");
		name=JOptionPane.showInputDialog(this,"Enter Name");
		btn1=new JButton("1");  
		btn1.setBounds(10,30,100,100);
		add(btn1);
		 
		btn2=new JButton("2");  
		btn3=new JButton("3");  
		btn4=new JButton("4");  
		btn5=new JButton("5");  
		btn6=new JButton("6");  
		btn7=new JButton("7");  
		btn8=new JButton(" ");  
		btn9=new JButton("8");  
        next=new JButton("next");
		
		btn2.setBounds(120,30,100,100);  
		btn3.setBounds(230,30,100,100);  
		btn4.setBounds(10,140,100,100);  
		btn5.setBounds(120,140,100,100);  
		btn6.setBounds(230,140,100,100);  
		btn7.setBounds(10,250,100,100);  
		btn8.setBounds(120,250,100,100);  
		btn9.setBounds(230,250,100,100);  
		next.setBounds(100,370,150,50);
		add(btn2); add(btn3); add(btn4);
		add(btn5); add(btn6); add(btn7);
		add(btn8); add(btn9); add(next);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		next.addActionListener(this);
		
		setLayout(null); 
		setVisible(true);
		
		setSize(360,480);		
		setLocation(100,100); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end of constructor
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			String s=btn1.getText();
			if(btn2.getText()==" "){
				btn1.setText(" ");
				btn2.setText(s);
			}
			else if(btn4.getText()==" "){
				btn4.setText(s);
				btn1.setText(" ");
			}
		}
		
		if(e.getSource()==btn2){
		  	String s=btn2.getText();  
			if(btn1.getText()==" "){ 
				btn1.setText(s); btn2.setText(" ");
			}  
			else if(btn3.getText()==" "){ 
				btn3.setText(s); btn2.setText(" ");
			}  
			else if(btn5.getText()==" "){ 
				btn5.setText(s); btn2.setText(" ");
			}  
		}
		
		if(e.getSource()==btn3){
			String s=btn3.getText();  
			if(btn2.getText().equals(" ")){
				btn2.setText(s); btn3.setText(" ");
			}  
			else if(btn6.getText()==" "){
				btn6.setText(s); btn3.setText(" ");
			}  
		}
		
		if(e.getSource()==btn4){
			String s=btn4.getText();  
			if(btn1.getText()==" "){ 
				btn1.setText(s); btn4.setText(" ");
			}  
			else if(btn7.getText()==" "){ 
				btn7.setText(s); btn4.setText(" ");
			}  
			else if(btn5.getText()==" "){ 
				btn5.setText(s); btn4.setText(" ");
			} 
			else if(btn8.getText()==" "){
				JOptionPane.showMessageDialog(this,"Invalid Move","Worning",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		if(e.getSource()==btn5){
			String s=btn5.getText();  
			if(btn2.getText()==" "){ 
				btn2.setText(s); btn5.setText(" ");
			}  
			else if(btn4.getText()==" "){ 
				btn4.setText(s); btn5.setText(" ");
			}  
			else if(btn6.getText()==" "){ 
				btn6.setText(s); btn5.setText(" ");
			}  
			else if(btn8.getText()==" "){ 
				btn8.setText(s); btn5.setText(" ");
			}  
		}
		
		if(e.getSource()==btn6){
			String s=btn6.getText();  
			if(btn9.getText()==" "){ 
				btn9.setText(s); btn6.setText(" ");
			}  
			else if(btn3.getText()==" "){ 
				btn3.setText(s); btn6.setText(" ");
			}  
			else if(btn5.getText()==" "){ 
				btn5.setText(s); btn6.setText(" ");
			}  
		}
		
		if(e.getSource()==btn7){
			String s=btn7.getText();  
			if(btn4.getText()==" "){ 
				btn4.setText(s); btn7.setText(" ");
			}  
			else if(btn8.getText()==" "){ 
				btn8.setText(s); btn7.setText(" ");
			}  
		}
		
		if(e.getSource()==btn8){
			String s=btn8.getText();  
			if(btn7.getText()==" "){ 
				btn7.setText(s); btn8.setText(" ");
			}  
			else if(btn9.getText()==" "){ 
				btn9.setText(s); btn8.setText(" ");
			}  
			else if(btn5.getText()==" "){ 
				btn5.setText(s); btn8.setText(" ");
			}
		}
		
		if(e.getSource()==btn9){
			String s=btn9.getText();  
			if(btn6.getText()==" "){ 
				btn6.setText(s); btn9.setText(" ");
			}   
			else if(btn8.getText()==" "){ 
				btn8.setText(s); btn9.setText(" ");
			}
			if(btn1.getText()=="1" && btn2.getText().equals("2")&&btn3.getText()  
				.equals("3")&&btn4.getText().equals("4")
			     &&btn5.getText().equals("5")  
				&&btn6.getText().equals("6")&&btn7.getText().equals("7")
				&&btn8.getText()  
				.equals("8")&&btn9.getText().equals(" ")){
				JOptionPane.showMessageDialog(this,name+" You Won The Game");
			}
		}
		
		if(e.getSource()==next){
			String s1=btn1.getText();
			btn1.setText(btn5.getText());
			btn5.setText(s1);
			String s2=btn4.getText();
			btn4.setText(btn9.getText());
			btn9.setText(s2);
			String s3=btn2.getText();
			btn2.setText(btn7.getText());
			btn7.setText(s3);
			String s4=btn3.getText();
			btn3.setText(btn4.getText());
			btn4.setText(s4);
		}
	}
	
	public static void main(String []args)
	{
		new Puzzle();
	}
}



