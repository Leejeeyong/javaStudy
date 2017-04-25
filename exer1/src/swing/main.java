package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class main extends JFrame{
	JButton btn1 = new JButton("1��");
	JButton btn2 = new JButton("2");
	JLabel la=new JLabel();
	JTextArea ta = new JTextArea();
	
	public main(){
		setLayout(new GridLayout(2,2));
		
		add(ta);
		add(btn1);
		add(la);
		add(btn2);
		
		Message action1 =new Message();
		Calc action2 =new Calc();
		
		btn1.addActionListener(action1);
		btn2.addActionListener(action2);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new main();

	}
	
	class Message implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			
			
			
			JOptionPane.showMessageDialog(null,btn.getText()+"�⺻ �˸�â�Դϴ�.");
		}
		
	}

	class Calc implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			String data = ta.getText();
			int a = Integer.parseInt(data);
			
			int res=a/1200;
			
			la.setText(res+"�޷��Դϴ�.");
		}
		
	}

}

