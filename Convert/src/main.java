import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main extends JFrame{
	JPanel contentPane = new JPanel();
	String[] list1 = {"길이","무게"};
	String[] list21 = {"m","inch","yard"};
	String[] list22 = {"g","oz"};
	JComboBox  jcb1 = new JComboBox (list1);
	JComboBox  jcb21 = new JComboBox (list21);
	JComboBox  jcb22 = new JComboBox (list21);
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JLabel l1 = new JLabel(); 
	
	main(){
		setTitle("단위 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3,3));
		jcb1.addActionListener(new list1Listener());
		
		contentPane.add(jcb1);
		contentPane.add(new JLabel());
		contentPane.add(jcb21);
		contentPane.add(jcb22);
		contentPane.add(text1);
		contentPane.add(text2);
		
		
		
		
		setSize(300,150);
		setVisible(true);
	}
	
	public class list1Listener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox jb = (JComboBox)e.getSource();
			
			if(jb.getSelectedIndex()==1){
				jcb21.removeAllItems();
				jcb22.removeAllItems();
				for(int i=0;i<list22.length;i++){
					jcb21.addItem(list22[i]);
					jcb22.addItem(list22[i]);
				}
			}
			else{
				jcb21.removeAllItems();
				jcb21.removeAllItems();
				for(int i=0;i<list21.length;i++){
					jcb21.addItem(list21[i]);
					jcb22.addItem(list21[i]);
				}
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}

}
