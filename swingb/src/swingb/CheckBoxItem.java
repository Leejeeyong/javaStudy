package swingb;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBoxItem extends JFrame {
	Container contentPane;
	int res=0;
	
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	JLabel L1=new JLabel("사과 1200원  배 2000원 체리 4000원");
	JLabel L2=new JLabel("현재가격은" +res+"원");
	
	JCheckBox apple = new JCheckBox("사과");
	JCheckBox pear = new JCheckBox("배");
	JCheckBox cherry = new JCheckBox("체리", cherryIcon);
	
	CheckBoxItem() {
		setTitle("체크박스 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		cherry.setBorderPainted(true);
		apple.setBorderPainted(true);
		pear.setBorderPainted(true);

		contentPane.add(L1);
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		contentPane.add(L2);

		apple.addItemListener(new EventLister());
		pear.addItemListener(new EventLister());
		cherry.addItemListener(new EventLister());
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String [] args) {
		new CheckBoxItem();
	}
	
	public class EventLister implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected=1;
			
			if(e.getStateChange() == ItemEvent.SELECTED){
				selected = 1;
			}
			else{
				selected = -1;
			}
			
			if(e.getItem()==apple){
				res=res+selected*1200;
				L2.setText("현재가격은" +res+"원");
			}
			else if(e.getItem()==pear){
				res=res+selected*2000;
				L2.setText("현재가격은" +res+"원");
			}
			else{
				cherry.setSelectedIcon(selectedCherryIcon);
				res=res+selected*4000;
				L2.setText("현재가격은" +res+"원");
			}
			
			
			
		}
		
	}
}

