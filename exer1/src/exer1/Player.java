package exer1;

import java.util.Random;

public class Player {
	Random r=new Random();
	String cl;
	String name;
	int HP;//ü��
	int STR;//��
	int STRp;//����ȭ��ġ
	int DEF;//����
	int DEFp;//���°�ȭ��ġ
	int check;
	
	public Player(int n,String name){//��������
		if(n==1){//â��
			this.name=name;
			cl="â��";
			HP=100;
			STR=20;
			STRp=5;
			DEF=10;
			DEFp=2;
		}
		else if(n==2){//���к�
			this.name=name;
			cl="���к�";
			HP=100;
			STR=10;
			STRp=3;
			DEF=20;
			DEFp=6;
		}
	}
	
	public void printStatus(){//���� ��� ���ҵ�5
		System.out.println("====================");
		System.out.println(name+" �÷��̾�");
		System.out.println("���� : "+cl);
		System.out.println("HP : "+HP);
		System.out.println("���ݷ� : "+STR);
		System.out.println("���� : "+DEF);
		System.out.println("====================");
	}
	
	public void Plus(int n){//���ݷ� �Ǵ� ���� ��ȭ �޼ҵ�
		int res;
		if(n==1){//����ȭ
			res=r.nextInt(3)+STRp-1;
			STR=STR+res;
			System.out.println("���ݷ�"+res+"��ŭ ��ȭ ����");
		}
		else if(n==2){//���� ��ȭ
			res=r.nextInt(3)+DEFp-1;
			DEF=DEF+res;
			System.out.println("����"+res+"��ŭ ��ȭ ����");
		}
	}
	
	public void Attack(Player p){//�����ϴ� �޼ҵ�
		int res=(r.nextInt(3)+STR-1)-(r.nextInt(3)+p.DEF-1);
		if(STR-p.DEF<=1){//���� ���ݷ°� ����� ������ ���̰� 1�����϶��� 1�� �������� �ش�
			p.HP=p.HP-1;
			if(p.HP<=0){//���ݰ�� hp�� 0�����̸� 0����
				p.HP=0;
			}
		}
		else{//�⺻���� ����
			p.HP=p.HP-res;
			if(p.HP<=0){
				p.HP=0;
			}
		}
		check=checkLife(p);
	}
	
	public int checkLife(Player p){
		if(p.HP==0){
			System.out.println(p.name+"�� �й�");
			return 1;
		}
		return 0;
	}

}
