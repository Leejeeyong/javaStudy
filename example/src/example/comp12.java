package example;

import java.util.Scanner;

public class comp12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]=new int[5];
		int comp1[]=new int[5];
		int comp2[]=new int[5];
		int c;
		int p;
		
		p=0;
		c=1;
		
		do{
			p=p+1;
			a[p-1]=s.nextInt();
			comp1[p-1]=1-a[p-1];
		}while(p<5);
		
		while(true){
			comp2[p-1]=comp1[p-1]+c;
			comp2[p-1]=comp2[p-1]%2;
			c=comp1[p-1]*c;
			p=p-1;
			
			if(p==0){
				break;
			}
		}
		
		
		for(int i=0;i<5;i++){
			System.out.print(comp1[i]);
		}
		System.out.println();
		for(int i=0;i<5;i++){
			System.out.print(comp2[i]);
		}
	}

}
