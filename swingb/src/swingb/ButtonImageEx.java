package swingb;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
	ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
	ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
	JButton btn = new JButton("call~~", normalIcon);
	event event = new event();
	mevent mevent = new mevent();
	
	
	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout()); 
		
		
		btn.addMouseListener(mevent);
		
		contentPane.add(btn);

		setSize(250,200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ButtonImageEx();
	}
	
	class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	class mevent implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			btn.setIcon(rolloverIcon);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			btn.setIcon(normalIcon);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			btn.setIcon(pressedIcon);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			btn.setIcon(rolloverIcon);
		}

		
	}
} 

