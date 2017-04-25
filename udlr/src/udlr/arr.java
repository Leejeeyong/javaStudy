package udlr;

public class arr {

	public static void main(String[] args) {
		int a[]={34, 89, 23, 43, 56, 93, 91, 77, 29, 54};
		int b[]={34, 89, 23, 43, 56, 93, 91, 77, 29, 54};
		int temp;
		
		for(int i=0;i<9;i++){
			for(int j=i+1;j<10;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(b[i]>b[j]){
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("첫 번째");
		for(int i=0;i<10;i++){
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.println("두 번째");
		for(int i=0;i<10;i++){
			System.out.print(b[i]+",");
		}
	}

}
