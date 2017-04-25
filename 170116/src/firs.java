
public class firs {

	public static void main(String[] args) {
		int a[][]=new int[5][5];
		int p,q;
		
		
		p=1;
		
		while(true){
			if(p>=6){
				break;
			}
			
			q=1;
			
			while(true){
				
				if(q<=p){
					a[p-1][q-1]=q;
					q=q+1;
				}
				else{
					p=p+1;
					break;
				}
				
			}
		}
		
		
		
		for(int i=0;i<5;i++){
			System.out.println();;
			for(int j=0;j<5;j++){
				System.out.printf("%3d",a[i][j]);
			}
		}
	}

}
