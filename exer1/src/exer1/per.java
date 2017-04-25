package exer1;

public class per {

	public static void main(String[] args) {
		int tn,n,sum,k,j,r;
		
		tn=0;
		n=2;
		
		while(true){
			if(n>500){
				break;
			}
			
			sum=0;
			
			k=n/2;
			
			for(j=1;j<=k;j++){
				r=n-(n/j)*j;
				if(r==0){
					sum=sum+j;
				}
			}
			
			if(sum==n){
				System.out.println(n);
				tn=tn+1;
			}
			n=n+1;
		}
		
		System.out.println();
		System.out.println(tn);

	}

}
