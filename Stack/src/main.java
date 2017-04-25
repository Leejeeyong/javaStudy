import java.util.Scanner;

public class main {
	static final int MAX = 10;
	int stack[]=new int[MAX];
	int top;
	
	public static void main(String[] args) {
		int i,j;
		main m = new main();
		Scanner s = new Scanner(System.in);
		
		m.reset_Stack();
		
		while(true){
			System.out.println();
			System.out.println("1.PUSH \n2.POP \n3.PRINT STACK \n4.RESET \n0.EXIT");
			i=s.nextInt();
			if(i==1){
				System.out.println("Input data : ");
				j=s.nextInt();
				m.Push(j);
			}
			else if(i==2){
				m.Pop();
			}
			else if(i==3){
				m.Print();
			}
			else if(i==4){
				m.reset_Stack();
			}
			else if(i==0){
				break;
			}
			else{
				System.out.println("Error");
			}
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	public void reset_Stack(){
		top=-1;
	}
	public int Pop(){
		if(top<0){
			System.out.println();
			System.out.println("Stack underflow!!");
		}
		else{
			System.out.println("Complete!!");
		}
		
		return stack[top--];
	}
	public int Push(int a){
		if(top>=MAX-1){
			System.out.println();
			System.out.println("Stack overflow!!");
			return -1;
		}
		else{
				System.out.println("Complete");
		}
		
		stack[++top]=a;
		return a;
	}
	public void Print(){
		int i;
		System.out.print("Print Stack : ");
		for(i=top;i>=0;i--){
			System.out.print(stack[i]+" ");
		}
		
	}

}
