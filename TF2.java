import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
public class TF2 extends JFrame
implements ActionListener {
JTextField
division,workorder,psl,pi,dwg,bq,des,h,i,z,k,l,m,n,o,p,r,s,t,u,v,w,x,q,y,al,bl,cl,dl,el;
JButton back,open,edit,save;
public void lol() {
	JLabel are=new JLabel("Stage Inspection Details");
	are.setBounds(500,0,200,60);
JLabel divisionp=new JLabel("Enter Division",JLabel.RIGHT);
divisionp.setBounds(200,50,100,30);
JLabel workorderp=new JLabel("WORKORDER",JLabel.RIGHT);
workorderp.setBounds(400,50,100,30);
JLabel pslp=new JLabel("Psl No",JLabel.LEFT);
pslp.setBounds(600,50,100,30);
JLabel pip=new JLabel("Process Issue",JLabel.LEFT);
pip.setBounds(800,50,100,30);
JLabel dwgp=new JLabel("Drawing Number",JLabel.RIGHT);
dwgp.setBounds(200,100,100,30);
JLabel desp=new JLabel("Description",JLabel.RIGHT);
desp.setBounds(400,100,100,30);
JLabel bqp=new JLabel("B Qty.",JLabel.RIGHT);
bqp.setBounds(800,100,100,30);
division=new JTextField(2);
division.setBounds(300,50,100,30);
workorder=new JTextField(2);
workorder.setBounds(500,50,100,30);
psl=new JTextField(2);
psl.setBounds(700,50,100,30);
pi=new JTextField(2);
pi.setBounds(900,50,100,30);
dwg=new JTextField(2);
dwg.setBounds(300,100,100,30);
des=new JTextField(30);
des.setBounds(500,100,300,300);
bq=new JTextField(3);
bq.setBounds(900,100,100,30);
h=new JTextField(3);
h.setBounds(200,200,100,30);
i=new JTextField(3);
i.setBounds(300,200,100,30);
z=new JTextField(3);
z.setBounds(400,200,100,30);
k=new JTextField(3);
k.setBounds(500,200,100,30);
l=new JTextField(3);
l.setBounds(600,200,100,30);
m=new JTextField(3);
m.setBounds(700,200,100,30);
n=new JTextField(3);
n.setBounds(800,200,100,30);
y=new JTextField(3);
y.setBounds(900,200,100,30);
al=new JTextField(3);
al.setBounds(1000,200,100,30);
bl=new JTextField(3);
bl.setBounds(1100,200,100,30);
o=new JTextField(3);
o.setBounds(200,250,100,30);
p=new JTextField(3);
p.setBounds(300,250,100,30);
r=new JTextField(3);
r.setBounds(400,250,100,30);
s=new JTextField(3);
s.setBounds(500,250,100,30);
t=new JTextField(3);
t.setBounds(600,250,100,30);
u=new JTextField(3);
u.setBounds(700,250,100,30);
cl=new JTextField(3);
cl.setBounds(900,250,100,30);
dl=new JTextField(3);
dl.setBounds(1000,250,100,30);
el=new JTextField(3);
el.setBounds(1100,250,100,30);
back=new JButton("<<BACK");
back.addActionListener(this);
back.setBounds(400,450,80,30);
open=new JButton("OPEN");
open.addActionListener(this);
open.setBounds(500,450,80,30);
edit=new JButton("EDIT");
edit.addActionListener(this);
edit.setBounds(600,450,80,30);
save=new JButton("SAVE");
save.addActionListener(this);
save.setBounds(700,450,80,30);
Container contentPane=this.getContentPane();
JPanel j=new JPanel();
j.setLayout(null);
JLabel a=new JLabel("opn no",JLabel.RIGHT);
a.setBounds(200,150,100,30);
JLabel b=new JLabel("rew no",JLabel.RIGHT);
b.setBounds(300,150,100,30);
JLabel c=new JLabel("cc",JLabel.RIGHT);
c.setBounds(400,150,100,30);
JLabel d=new JLabel("qty off",JLabel.RIGHT);
d.setBounds(500,150,100,30);
JLabel e=new JLabel("opn date insp",JLabel.RIGHT);
e.setBounds(600,150,100,30);
JLabel f=new JLabel("off QC",JLabel.RIGHT);
f.setBounds(700,150,100,30);
JLabel g=new JLabel("accept",JLabel.RIGHT);
g.setBounds(800,150,100,30);
JLabel q=new JLabel("reject",JLabel.RIGHT);
q.setBounds(900,150,100,30);
JLabel w=new JLabel("rework",JLabel.RIGHT);
w.setBounds(1000,150,100,30);
JLabel x=new JLabel("status code",JLabel.RIGHT);
x.setBounds(1100,150,100,30);
j.add(are);
j.add(divisionp);
j.add(division);
j.add(workorderp);
j.add(workorder);
j.add(pslp);
j.add(psl);
j.add(pip);
j.add(pi);
j.add(dwgp);
j.add(dwg);
j.add(bqp);
j.add(bq);
j.add(desp);
j.add(des);
j.add(a);
j.add(b);
j.add(c);
j.add(d);
j.add(e);
j.add(f);
j.add(g);
j.add(q);
j.add(w);
j.add(x);
j.add(h);
j.add(i);
j.add(z);
j.add(k);
j.add(l);
j.add(m);
j.add(n);
j.add(y);
j.add(al);
j.add(bl);
j.add(o);
j.add(p);
j.add(r);
j.add(s);
j.add(t);
j.add(u);
j.add(v);
j.add(cl);
j.add(dl);
j.add(el);
j.add(back);
j.add(open);
j.add(edit);
j.add(save);
contentPane.add(j);
division.addActionListener(this);
workorder.addActionListener(this);
psl.addActionListener(this);
pi.addActionListener(this);
dwg.addActionListener(this);
bq.addActionListener(this);
des.addActionListener(this);
back.addActionListener(this);
open.addActionListener(this);
edit.addActionListener(this);
save.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==back)
	{
		this.dispose();
		ready w=new ready();
		w.setVisible(true);
		w.setSize(1400,800);
		w.welcome();
	}
	if(ae.getSource()==open)
	{
	}
	if(ae.getSource()==edit)
	{
	}
	if(ae.getSource()==save) {
	
	}
}	
}

	




