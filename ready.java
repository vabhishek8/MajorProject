import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;

public class ready extends JFrame implements ActionListener
{
JRadioButton jc,jc1;
ButtonGroup bg;
JButton back,next;
JPanel jpaw;
public void welcome()
{
	jpaw=new JPanel();
	 jpaw.setLayout(null);
	 Container c=this.getContentPane();
	 JLabel jc2=new JLabel("SELECT TYPE OF INSPECTION");
	 jc2.setBounds(550,50,180,30);
	 jc=new JRadioButton("final inspection");
	 jc.setBounds(550,150,180,30);
	 jc.addActionListener(this);
	 jc1=new JRadioButton("stage inspection");
	 jc1.setBounds(550,200,180,30);
	 jc1.addActionListener(this);
	 bg=new ButtonGroup();
	 bg.add(jc);
	 bg.add(jc1);
	   back=new JButton("<<BACK");
			   back.addActionListener(this);
	   back.setBounds(300,450,80,30);
	   next=new JButton("NEXT>>");
	  next.addActionListener(this);
	   next.setBounds(1000,450,80,30);
	   jpaw.add(jc2);
	   jpaw.add(jc);
	   jpaw.add(jc1);
	  jpaw.add(back); 
	   jpaw.add(next);
	   jpaw.setBackground(new Color(20,136,255));
	   this.add(jpaw);
}
   public void actionPerformed(ActionEvent ae)
   {
	   if(ae.getSource()==back)
	   {
		   this.dispose();
		   start l=new start();
		   l.setVisible(true);
		   l.setSize(400,400);
		   l.login1();
	   }
	   if((jc.isSelected())&&(ae.getSource()==next))
{this.dispose();
    TF y=new TF();
    y.setVisible(true);
    y.setSize(1400,800);
    y.lol();
}
	   if((jcl.isSelected())&&(ae.getSource()==next))
	   {this.dispose();
	   
	   TF2 y=new TF2();
	   y.setVisible(true);
	   y.setSize(1400,800);
	   y.lol();
	   } 
		   
    
	   }

	   
}

