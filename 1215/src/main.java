
public class main {

	public static void main(String[] args) {
		
		int a[]={85,90,70,65,96,88,95,35,40,77};
		float aver=0,n=10;
		int j=1,k=2;
		
		
		int min=a[0],max=a[0],hap=a[0];
		
		do{
			if(a[k-1]<min){
				min=a[k-1];
			}
			else if(a[k-1]>max){
				max=a[k-1];
			}
			
			hap=hap+a[k-1];
			k=k+1;
		}while(k<=10);
		
		aver=(float)(hap-max-min)/(float)8;
		
		System.out.println(aver);
	}

}
