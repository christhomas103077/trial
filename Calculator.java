import java.awt.event.*; 
import javax.swing.*; 
public class Calculator extends JFrame implements ActionListener{ 
private static final long serialVersionUID = 1L; 
JTextField tf; 
JButton 
b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSubtract,bMultiply,bDivide,bEq,bClear; 
static int value; 
static String op=""; 
Calculator(){ 
setLayout(null); 
//create text field 
tf=new JTextField(); 
//create buttons 
b1=new JButton("1"); 
b2=new JButton("2"); 
b3=new JButton("3"); 
b4=new JButton("4"); 
b5=new JButton("5"); 
b6=new JButton("6"); 
b7=new JButton("7"); 
b8=new JButton("8"); 
b9=new JButton("9"); 
b0=new JButton("0"); 
bAdd=new JButton("+"); 
bSubtract=new JButton("-"); 
bMultiply=new JButton("*"); 
bDivide=new JButton("/"); 
bEq=new JButton("="); 
bClear=new JButton("C"); 
//add action listeners 
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b4.addActionListener(this); 
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this); 
b0.addActionListener(this);bAdd.addActionListener(this); 
bSubtract.addActionListener(this); 
bMultiply.addActionListener(this); 
bDivide.addActionListener(this); 
bEq.addActionListener(this); 
bClear.addActionListener(this); 
//set bounds for buttons 
tf.setBounds(10,20,170,40); 
b1.setBounds(10,65,50,40); 
b2.setBounds(70,65,50,40); 
b3.setBounds(130,65,50,40); 
b4.setBounds(10,110,50,40); 
b5.setBounds(70,110,50,40); 
b6.setBounds(130,110,50,40); 
b7.setBounds(10,155,50,40); 
b8.setBounds(70,155,50,40); 
b9.setBounds(130,155,50,40); 
bAdd.setBounds(10,200,50,40); 
bSubtract.setBounds(70,200,50,40); 
b0.setBounds(130,200,50,40); 
bMultiply.setBounds(10,245,50,40); 
bDivide.setBounds(70,245,50,40); 
bEq.setBounds(130,245,50,40); 
bClear.setBounds(70,290,50,40); 
//add elements to frame 
add(tf); 
add(b1); 
add(b2); 
add(b3); 
add(b4); 
add(b5); 
add(b6); 
add(b7); 
add(b8); 
add(b9); 
add(b0); 
add(bAdd); 
add(bSubtract); 
add(bMultiply);add(bDivide); 
add(bEq); 
add(bClear); 
setSize(205,380); 
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
public void actionPerformed(ActionEvent e) { 
if(e.getSource()==b1) 
tf.setText(tf.getText()+"1"); 
else if(e.getSource()==b2) 
tf.setText(tf.getText()+"2"); 
else if(e.getSource()==b3) 
tf.setText(tf.getText()+"3"); 
else if(e.getSource()==b4) 
tf.setText(tf.getText()+"4"); 
else if(e.getSource()==b5) 
tf.setText(tf.getText()+"5"); 
else if(e.getSource()==b6) 
tf.setText(tf.getText()+"6"); 
else if(e.getSource()==b7) 
tf.setText(tf.getText()+"7"); 
else if(e.getSource()==b8) 
tf.setText(tf.getText()+"8"); 
else if(e.getSource()==b9) 
tf.setText(tf.getText()+"9"); 
else if(e.getSource()==b0) 
tf.setText(tf.getText()+"0"); 
else if(e.getSource()==bAdd) 
evaluate("+"); 
else if(e.getSource()==bSubtract) 
evaluate("-"); 
else if(e.getSource()==bMultiply) 
evaluate("*"); 
else if(e.getSource()==bDivide) 
evaluate("/"); 
else if(e.getSource()==bEq) 
evaluate("="); 
else if(e.getSource()==bClear) 
tf.setText(""); 
} 
public void evaluate(String s) { 
int flag=0; 
if(op=="") {value=Integer.parseInt(tf.getText()); 
op=s; 
} 
else { 
switch(op) { 
case "+": 
value=value+Integer.parseInt(tf.getText()); 
break; 
case "-": 
value=value-Integer.parseInt(tf.getText()); 
break; 
case "*": 
value=value*Integer.parseInt(tf.getText()); 
break; 
case "/": 
try { 
if(Integer.parseInt(tf.getText())==0) { 
throw new ArithmeticException(); 
} 
else { 
value=value/Integer.parseInt(tf.getText()); 
} 
} 
catch(ArithmeticException e) 
{ 
flag=1; 
System.out.println("Divide by zero not possible"); 
} 
break; 
} 
} 
if(s=="=") { 
if(flag==0) 
tf.setText(Integer.toString(value)); 
else 
tf.setText("ERROR"); 
op=""; 
} 
else { 
tf.setText(""); 
} 
} 
public static void main(String[] args) { 
new Calculator(); 
} }
