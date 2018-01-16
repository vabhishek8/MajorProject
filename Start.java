import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Start extends JFrame implements ActionListener
{
	JLabel a,a1,a2,a3;
	JLabel j1;
	JTextField tf;
	JLabel j11;
	JPasswordField jp;
	JButton jb,jb1;
	JPanel jpa;
	Container c;
	public void login1()
	{
		jpa=new JPanel();
		jpa.setLayout(null);
		String msg;
		Container c=this.getContentPane();
		ImageIcon i1=new ImageIcon("cute.JPEG");
		JLabel a=new JLabel("",i1,JLabel.CENTER);
		a.setBounds(400,25,100,300);
		Font f=new Font("Dialog",Font.PLAIN,12);
		msg="Dialog";
		setFont(f);
		 a1=new JLabel("BHARAT DYNAMICS LIMITED");
		 a1.setBounds(550,10,400,100);
		 a2=new JLabel("Quality Management System");
		 a2.setBounds(550,100,200,60);
		 a3=new JLabel("User Login");
		 a3.setBounds(600,180,100,30);
		 j1=new JLabel("Enter UserName");
		 j1.setForeground(Color.blue);
		 j1.setBounds(500,220,100,30);
		 tf=new JTextField(10);
		 tf.setBounds(620,220,150,0);
		 j11=new JLabel("Enter Password");
		 j11.setForeground(Color.blue);
		 j11.setBounds(500,300,100,30);
		 jp=new JPasswordField(10);
		 jp.setBounds(620,300,150,40);
		 jb=new JButton("OK");
		 jb.setForeground(Color.black);
		 jb.setBounds(450,450,70,40);
		 jb.addActionListener(this);
		 jb1=new JButton("EXIT");
		 jb1.setForeground(Color.black);
		 jb1.setBounds(750,450,70,40);
		 jb1.addActionListener(this);
		 jpa.add(a);
		 jpa.add(a1);
		 jpa.add(a2);
		 jpa.add(a3);
		 jpa.add(j1);
		 jpa.add(tf);
		 jpa.add(j11);
		 jpa.add(jp);
		jpa.add(jb);
		 jpa.add(jb);
		 jpa.setBackground(Color.yellow);
         c.add(jpa);
	}
	public void actionPerformer(ActionEvent ae)
	{
		 if(tf.getText().equals(jp.getText()))
		 {
			 if(ae.getSource()==jb);
			 {
				 this.dispose();
				 ready w=new ready();
				 w.setVisible(true);
				 w.setSize(1400,800);
				 w.welcome();
			 }
			 if(ae.getSource()==jb1)
			 {
				 System.exit(0);
			 }
		 }
	}
	public static void main(String args[])
	{
		Start l=new Start();
		l.setVisible(true);
		l.setSize(1400,800);
		l.login1();
	}

	
			
			 
		 
	}


