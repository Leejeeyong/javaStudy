package udlr;

import java.awt.event.*;
import javax.swing.*;

public class main extends JFrame implements Runnable, KeyListener{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	final int FLYING_UNIT = 10;
	
	main(){
		setTitle("»óÇÏÁÂ¿ì");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(this);
		la.setLocation(50,50);
		la.setSize(100,20);
		contentPane.add(la);
		this.setResizable(false);
		setSize(300,300);
		setVisible(true);
		contentPane.requestFocus();
	}
	
	public void run() {
		//while(true){
		try{   
			Thread.sleep(10);
		} catch(Exception e) {
			e.printStackTrace(); }
		//}
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
			case KeyEvent.VK_UP: 
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN: 
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT); 
				break;
			case KeyEvent.VK_LEFT: 
				la.setLocation(la.getX()-FLYING_UNIT, la.getY()); 
				break;
			case KeyEvent.VK_RIGHT: 
				la.setLocation(la.getX()+FLYING_UNIT, la.getY()); 
				break;
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread(new main());
		th.start();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
