package example;

public class num1 {

	public static void main(String[] args) {
		int i,j,m,n;
		
		i=1;
		do{
		i=i+1;
		j=1;
		
			while(true){
				j=j+1;
				m=(int)i/j;
				n=i%j;
				if(n==0){
					break;
				}
			}
			
			if(i==j){
				System.out.println(i);
			}
			
			
		}while(i<100);
	}

}
