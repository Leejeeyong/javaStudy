package exer1;

import java.util.Random;

public class Player {
	Random r=new Random();
	String cl;
	String name;
	int HP;//체력
	int STR;//힘
	int STRp;//힘강화수치
	int DEF;//방어력
	int DEFp;//방어력강화수치
	int check;
	
	public Player(int n,String name){//직업선택
		if(n==1){//창병
			this.name=name;
			cl="창병";
			HP=100;
			STR=20;
			STRp=5;
			DEF=10;
			DEFp=2;
		}
		else if(n==2){//방패병
			this.name=name;
			cl="방패병";
			HP=100;
			STR=10;
			STRp=3;
			DEF=20;
			DEFp=6;
		}
	}
	
	public void printStatus(){//정보 출력 베소드5
		System.out.println("====================");
		System.out.println(name+" 플레이어");
		System.out.println("직업 : "+cl);
		System.out.println("HP : "+HP);
		System.out.println("공격력 : "+STR);
		System.out.println("방어력 : "+DEF);
		System.out.println("====================");
	}
	
	public void Plus(int n){//공격력 또는 방어력 강화 메소드
		int res;
		if(n==1){//힘강화
			res=r.nextInt(3)+STRp-1;
			STR=STR+res;
			System.out.println("공격력"+res+"만큼 강화 성공");
		}
		else if(n==2){//방어력 강화
			res=r.nextInt(3)+DEFp-1;
			DEF=DEF+res;
			System.out.println("방어력"+res+"만큼 강화 성공");
		}
	}
	
	public void Attack(Player p){//공격하는 메소드
		int res=(r.nextInt(3)+STR-1)-(r.nextInt(3)+p.DEF-1);
		if(STR-p.DEF<=1){//나의 공격력과 대상의 방어력의 차이가 1이하일때는 1의 데미지만 준다
			p.HP=p.HP-1;
			if(p.HP<=0){//공격결과 hp가 0이하이면 0으로
				p.HP=0;
			}
		}
		else{//기본적인 공격
			p.HP=p.HP-res;
			if(p.HP<=0){
				p.HP=0;
			}
		}
		check=checkLife(p);
	}
	
	public int checkLife(Player p){
		if(p.HP==0){
			System.out.println(p.name+"의 패배");
			return 1;
		}
		return 0;
	}

}
