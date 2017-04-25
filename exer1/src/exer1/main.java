package exer1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int c,flag=1,turn=1,sel;
		
		System.out.println("첫 번째 플레이어의 이름");
		name=s.next();
		System.out.println("직업을 선택하시오-1.창병, 2.방패병");
		c=s.nextInt();
		Player p1=new Player(c,name);
		
		System.out.println("두 번째 플레이어의 이름");
		name=s.next();
		System.out.println("직업을 선택하시오-1.창병, 2.방패병");
		c=s.nextInt();
		Player p2=new Player(c,name);
		
		
		while(true){
			p1.printStatus();
			p2.printStatus();
			if(flag==1){
				System.out.println(p1.name+"의 "+turn+" 번째 턴");
				System.out.println("1.공격력 강화 2.방어력 강화 3.공격");
				sel=s.nextInt();
				if(sel==1){//공격력강화
					p1.Plus(1);
					flag=2;
				}
				else if(sel==2){//방어력강화
					p1.Plus(2);
					flag=2;
				}
				else if(sel==3){//공격
					p1.Attack(p2);
					flag=2;
				}
				else{
					System.out.println("잘못 입력 다시......");
				}
				
				if(p1.check==1){break;}
			}
			else if(flag==2){
				System.out.println(p2.name+"의 "+turn+" 번째 턴");
				System.out.println("1.공격력 강화 2.방어력 강화 3.공격");
				sel=s.nextInt();
				if(sel==1){//공격력강화
					p2.Plus(1);
					flag=1;
					turn=turn+1;
				}
				else if(sel==2){//방어력강화
					p2.Plus(2);
					flag=1;
					turn=turn+1;
				}
				else if(sel==3){//공격
					p2.Attack(p1);
					flag=1;
					turn=turn+1;
				}
				else{
					System.out.println("잘못 입력 다시......");
				}
				
				if(p2.check==1){break;}
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
