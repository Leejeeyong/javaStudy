package exer1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int c,flag=1,turn=1,sel;
		
		System.out.println("ù ��° �÷��̾��� �̸�");
		name=s.next();
		System.out.println("������ �����Ͻÿ�-1.â��, 2.���к�");
		c=s.nextInt();
		Player p1=new Player(c,name);
		
		System.out.println("�� ��° �÷��̾��� �̸�");
		name=s.next();
		System.out.println("������ �����Ͻÿ�-1.â��, 2.���к�");
		c=s.nextInt();
		Player p2=new Player(c,name);
		
		
		while(true){
			p1.printStatus();
			p2.printStatus();
			if(flag==1){
				System.out.println(p1.name+"�� "+turn+" ��° ��");
				System.out.println("1.���ݷ� ��ȭ 2.���� ��ȭ 3.����");
				sel=s.nextInt();
				if(sel==1){//���ݷ°�ȭ
					p1.Plus(1);
					flag=2;
				}
				else if(sel==2){//���°�ȭ
					p1.Plus(2);
					flag=2;
				}
				else if(sel==3){//����
					p1.Attack(p2);
					flag=2;
				}
				else{
					System.out.println("�߸� �Է� �ٽ�......");
				}
				
				if(p1.check==1){break;}
			}
			else if(flag==2){
				System.out.println(p2.name+"�� "+turn+" ��° ��");
				System.out.println("1.���ݷ� ��ȭ 2.���� ��ȭ 3.����");
				sel=s.nextInt();
				if(sel==1){//���ݷ°�ȭ
					p2.Plus(1);
					flag=1;
					turn=turn+1;
				}
				else if(sel==2){//���°�ȭ
					p2.Plus(2);
					flag=1;
					turn=turn+1;
				}
				else if(sel==3){//����
					p2.Attack(p1);
					flag=1;
					turn=turn+1;
				}
				else{
					System.out.println("�߸� �Է� �ٽ�......");
				}
				
				if(p2.check==1){break;}
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
