package udlr;

import java.util.*;

public class arrmulti {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n[]=new String[3];
		int e[]=new int[3];
		int m[]=new int[3];
		int sum[]=new int[3];
		int r,i,j,k;
		
		i=1;
		
		do{
			System.out.println("이름 영어점수 수학점수 입력");
			n[i-1]=s.next();
			e[i-1]=s.nextInt();
			m[i-1]=s.nextInt();
			sum[i-1]=e[i-1]+m[i-1];
			i=i+1;
		}while(i<=3);
		
		for(j=1;j<=3;j++){
			r=1;
			for(k=1;k<=3;k++){
				if(sum[j-1]<sum[k-1]){
					r=r+1;
				}
			}
			System.out.println(n[j-1]+" "+e[j-1]+" "+m[j-1]+" "+r);
		}
	}

}

























