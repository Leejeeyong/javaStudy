package exer1;

public class aaasssddd {

	public static void main(String[] args) {
		int tmp[]=new int [15];
		int p,q,k;
		int mok,nam,cnt;
		int a[][]=new int[5][5];
		int flag=0;
		
		tmp[0]=2;
		tmp[1]=3;
		
		cnt=2;
		
		for(p=5;p<=1000;p=p+2){
			for(q=2;q<=cnt;q++){
				flag=0;
				mok=p/tmp[q-1];
				nam=p%tmp[q-1];
				if(nam==0){
					break;
				}
				else{
					flag=1;
				}
			}
			if(flag==1){
				cnt=cnt+1;
				tmp[cnt-1]=p;
				//System.out.println(p);
			}
			
			if(cnt==15){
				break;
			}
		}
		
		
		cnt=1;
		
		for(p=1;p<=5;p++){
			k=6-p;
			for(q=k;q<=5;q++){
				a[p-1][q-1]=tmp[cnt-1];
				cnt=cnt+1;
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		

	}

}
