package exer1;

public class ee {

	public static void main(String[] args) {
		int eng[]={30,50,71,25,43,86,70};
		int temp;
		int a,b;
		
		
		a=1;
		for(;;){
			b=a+1;
			for(;;){
				if(eng[a-1]<eng[b-1]){
					temp=eng[a-1];
					eng[a-1]=eng[b-1];
					eng[b-1]=temp;
				}
				
				b=b+1;
				if(b>7){
					break;
				}
			}
			a=a+1;
			
			if(a>6){
				break;
			}
		}
		
		
		for(int i=0;i<7;i++){
			System.out.print(eng[i]+" ");
		}
		
	}

}
