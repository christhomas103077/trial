import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 
public class TrafficLight extends JFrame implements ActionListener{ 
JButton b1,b2,b3; 
JFrame frame; 
Signal green= new Signal(Color.green); 
Signal yellow=new Signal(Color.yellow); 
Signal red=new Signal(Color.red); 
TrafficLight(){ 
setLayout(null); 
frame=new JFrame("Traffic Light"); 
getContentPane().setLayout(new FlowLayout()); 
setSize(400,350); 
b1=new JButton("Red"); 
b2=new JButton("Yellow"); 
b3=new JButton("Green"); 
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b1.setBounds(45,50,100,20); 
b2.setBounds(45,75,100,20); 
b3.setBounds(45,100,100,20); 
add(b1); 
add(b2); 
add(b3); 
green.turnOn(false); 
yellow.turnOn(false); 
red.turnOn(false); 
JPanel p=new JPanel(new GridLayout(3,1)); 
p.add(red); 
p.add(yellow); 
p.add(green);getContentPane().add(p); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setVisible(true); 
} 
public void actionPerformed(ActionEvent e) { 
if(e.getSource()==b1) { 
red.turnOn(true); 
yellow.turnOn(false); 
green.turnOn(false); 
} 
else if(e.getSource()==b2) { 
red.turnOn(false); 
yellow.turnOn(true); 
green.turnOn(false); 
} 
else if(e.getSource()==b3) { 
red.turnOn(false); 
yellow.turnOn(false); 
green.turnOn(true); 
} 
} 
public static void main(String[] args) { 
new TrafficLight(); 
} 
} 
class Signal extends JPanel{ 
Color on; 
int radius=40; 
int border=10; 
boolean change; 
Signal(Color color){ 
on=color; 
change=true; 
} 
public void turnOn(boolean x) { 
change=x; 
repaint(); 
}public Dimension getPreferredSize() { 
int size =(radius + border)*2; 
return new Dimension(size,size); 
} 
public void paintComponent(Graphics g) { 
g.setColor(Color.black); 
g.fillRect(0, 0, getWidth(), getHeight()); 
if(change) { 
g.setColor(on); 
} 
else { 
g.setColor(on.darker().darker().darker()); 
} 
g.fillOval(border, border,2*radius, 2*radius); 
} 
}
