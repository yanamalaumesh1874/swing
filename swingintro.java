import javax.swing.*;  
public class swing1 
{
public static void main(String args[])
{
	JFrame f=new JFrame();
	JButton b=new JButton("click");
	b.setBounds(100,100,100,50);
	f.add(b);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
}
