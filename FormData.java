import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class FormData extends JFrame implements ActionListener{ 
JFrame f; 
JTextField tf1, tf2, tf3; 
JLabel l1, l2, l3; 
JButton b; 
FormData(){ 
setlayout(null); 
f=new JFrame ("Form"); 
l1=new JLabel1("Roll No:"); 
l2=new Label("Name:"); 
l3=new JLabel("CGPA:"); 
tf1=new JTextField(3); 
tf2=new JTextField(25); 
tf3=new JTextField(2); 
b=new JButton("Save"); 
b.addActionListener(this); 
l1. setBounds(10,40,60,25); 
l2. setBounds (10,70,60,25); 
l3. setBounds(10,100,60,25); 
tf1.setBounds(90,40,120, 25); 
tf2.setBounds(90,70,120,25); 
tf3.setBounds(90,100,120,25); 
b.setBounds (55,135,70,20); 
add (l1); add (l2); 
add (l3); 
add(tf1); 
add (tf2); 
add (tf3); 
add(b); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setSize(250, 200); 
setVisible(true);f.pack(); }
public void actionPerformed (ActionEvent e){ 
String s1=tf1.getText(); 
String s2=tf2.getText(); 
String s3=tf3.getText(); 
try{ Class.forName("oracle.jdbc.driver.OracleDriver"); 
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orc”,”exa m1,”welcome”); 
Statement st=con.createStatement(); 
int i=st.executeUpdate("insert into Form(rollno, name, cgpa) values(‘ 
“+s1+” ‘,’ “+s2+ JOptionPane. showMessageDialog(null, "Data is inserted 
successfully"); }
catch(Exception ex) { 
System.out.println(ex); } }
public static void main(String[] args){ 
new FormData(); } }
