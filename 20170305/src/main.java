
public class main {

	public static void main(String[] args) {
		int n,temp,p,fare,sum;
		
		int c[]={8,31,670,40,62,29,77,123,88,375};
		
		n=10;
		sum=0;
		p=1;
		
		while(true){
			temp=c[p-1];
			fare=0;
			
			if(temp>=10){
				fare=500;
				if(temp>=30){
					temp=temp-30;
					while(temp>=1){
						fare=fare+500;
						temp=temp-10;
					}
				}
			}
			
			if(fare>30000){
				fare=30000;
			}
			System.out.println(c[p-1]+"ºÐ "+fare+"¿ø");
			sum=sum+fare;
			p=p+1;
			
			if(p>n){
				break;
			}
		}
		
		System.out.println("ÃÑÇÕ"+sum+"¿ø");
	}

}
