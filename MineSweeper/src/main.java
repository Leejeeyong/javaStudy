import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main extends JFrame {
	JButton a[][]=new JButton[5][5];
	JLabel la[][]=new JLabel[5][5];
	JPanel pa = new backPanel();
	Container con = new Container();
	ActionEvent action = new ActionEvent();
	
	public main(){
		pa.setLayout(new BorderLayout());
		pa.add(new frontPanel(), BorderLayout.CENTER);
		
		con.setLayout(new GridLayout(5,5));
		
		con.add(new backPanel());
		
		setSize(500,500);
		setContentPane(con);
		setContentPane(pa);
		setVisible(true);
	}

	public static void main(String[] args) {
		new main();
	}
	
	
	class backPanel extends JPanel{
		backPanel(){
			setLayout(new GridLayout(5,5));
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					add(la[i][j]=new JLabel("b"));
				}
			}
		}
	}
	
	class frontPanel extends JPanel{
		frontPanel(){
			setLayout(new GridLayout(5,5));
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					add(a[i][j]=new JButton("a"));
					
					a[i][j].addActionListener(action);
				}
			}
		}
	}
	
	
	class ActionEvent implements ActionListener{

		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			JButton a = (JButton)e.getSource();
			
			a.setVisible(false);
			
		}
		
	}

}
