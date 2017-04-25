package check01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main extends JFrame{
	Container cpm;
	int appleprice=1500,pearprice=3000,cherryprice=5000;
	int applenum=0,pearnum=0,cherrynum=0;
	int sumprice=0;
	JPanel p1=new JPanel(null);
	JPanel p2=new JPanel(null);
	JPanel p3=new JPanel(null);
	JTextField t1 = new JTextField(applenum+"");
	JTextField t2 = new JTextField(pearnum+"");
	JTextField t3 = new JTextField(cherrynum+"");
	ImageIcon [] image = { 
			new ImageIcon("images/apple.jpg"), 
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")};
	JLabel l1=new JLabel("사과(개당)");
	JLabel l2=new JLabel("배(개당)");
	JLabel l3=new JLabel("체리(1kg)");
	JLabel l1p=new JLabel(appleprice+"원");
	JLabel l2p=new JLabel(pearprice+"원");
	JLabel l3p=new JLabel(cherryprice+"원");
	JLabel l4=new JLabel("현재가격은 "+sumprice+"원");
	JLabel imageLabel1 = new JLabel();
	JLabel imageLabel2 = new JLabel();
	JLabel imageLabel3 = new JLabel();
	JButton up1 = new JButton("+");
	JButton down1 = new JButton("-");
	JButton up2 = new JButton("+");
	JButton down2 = new JButton("-");
	JButton up3 = new JButton("+");
	JButton down3 = new JButton("-");
	
	
	
	
	main(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cpm = getContentPane();
		cpm.setLayout(null);
		imageLabel1.setIcon(image[0]);
		imageLabel2.setIcon(image[1]);
		imageLabel3.setIcon(image[2]);
		
		//p1.add(l1);
		//p1.add(imageLabel1);
		//p1.add(t1);
		
		//p2.add(l2);
		//p2.add(imageLabel2);
		//p2.add(t2);
		
		//p3.add(l3);
		//p3.add(imageLabel3);
		//p3.add(t3);
		
		
		/*cpm.add(p1,BorderLayout.WEST);
		cpm.add(p2,BorderLayout.CENTER);
		cpm.add(p3,BorderLayout.EAST);
		cpm.add(l4,BorderLayout.SOUTH);*/
		
		
		cpm.add(l1);
		cpm.add(l2);
		cpm.add(l3);
		cpm.add(l1p);
		cpm.add(l2p);
		cpm.add(l3p);
		cpm.add(imageLabel1);
		cpm.add(imageLabel2);
		cpm.add(imageLabel3);
		cpm.add(t1);
		cpm.add(t2);
		cpm.add(t3);
		cpm.add(up1);
		cpm.add(down1);
		cpm.add(up2);
		cpm.add(down2);
		cpm.add(up3);
		cpm.add(down3);
		cpm.add(l4);
		
		l1.setLocation(15, 0);
		l1.setSize(100, 50);
		l2.setLocation(115, 0);
		l2.setSize(100, 50);
		l3.setLocation(215, 0);
		l3.setSize(100, 50);

		imageLabel1.setLocation(10, 30);
		imageLabel1.setSize(100, 100);
		imageLabel2.setLocation(90, 30);
		imageLabel2.setSize(100, 100);
		imageLabel3.setLocation(210, 30);
		imageLabel3.setSize(100, 100);
		
		l1p.setLocation(25, 110);
		l1p.setSize(100, 50);
		l2p.setLocation(125, 110);
		l2p.setSize(100, 50);
		l3p.setLocation(225, 110);
		l3p.setSize(100, 50);
		
		t1.setLocation(30, 150);
		t1.setSize(25, 25);
		t2.setLocation(130, 150);
		t2.setSize(25, 25);
		t3.setLocation(230, 150);
		t3.setSize(25, 25);
		
		up1.setLocation(2, 180);
		up1.setSize(41,20);
		down1.setLocation(43, 180);
		down1.setSize(41,20);
		up2.setLocation(102, 180);
		up2.setSize(41,20);
		down2.setLocation(143, 180);
		down2.setSize(41,20);
		up3.setLocation(202, 180);
		up3.setSize(41,20);
		down3.setLocation(243, 180);
		down3.setSize(41,20);
		
		up1.addActionListener(new buttonplus());
		down1.addActionListener(new buttondown());
		up2.addActionListener(new buttonplus());
		down2.addActionListener(new buttondown());
		up3.addActionListener(new buttonplus());
		down3.addActionListener(new buttondown());
		
		
		l4.setLocation(2, 250);
		l4.setSize(200, 41);
		
		
		setResizable(false);
		setSize(300,320);
		setVisible(true);
	}
	
	class buttonplus implements ActionListener{
		int res;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==up1){
				res=Integer.parseInt(t1.getText())+1;
				applenum=res;
				t1.setText(res+"");
				sumprice=sumprice+appleprice;
			}
			else if(e.getSource()==up2){
				res=Integer.parseInt(t2.getText())+1;
				t2.setText(res+"");
				sumprice=sumprice+pearprice;
			}
			else{
				res=Integer.parseInt(t3.getText())+1;
				t3.setText(res+"");
				sumprice=sumprice+cherryprice;
			}
			
			
			l4.setText("현재가격은 "+sumprice+"원");
		}
		
	}
	class buttondown implements ActionListener{
		int res;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==down1){
				if(Integer.parseInt(t1.getText())==0){
					JOptionPane.showMessageDialog(null, "안 내려감");
				}
				else{
					res=Integer.parseInt(t1.getText())-1;
					t1.setText(res+"");
					sumprice=sumprice-appleprice;
				}
			}
			else if(e.getSource()==down2){
				if(Integer.parseInt(t2.getText())==0){
					JOptionPane.showMessageDialog(null, "안 내려감");
				}
				else{
					res=Integer.parseInt(t2.getText())-1;
					t2.setText(res+"");
					sumprice=sumprice-pearprice;
				}
			}
			else{
				if(Integer.parseInt(t3.getText())==0){
					JOptionPane.showMessageDialog(null, "안 내려감");
				}
				else{
					res=Integer.parseInt(t3.getText())-1;
					t3.setText(res+"");
					sumprice=sumprice-cherryprice;
				}
			}
			
			
			l4.setText("현재가격은 "+sumprice+"원");
		}
		
	}
	
	
	public static void main(String[] args) {
		new main();
	}

}
