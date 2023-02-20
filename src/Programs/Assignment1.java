package Programs;
import java.util.Scanner;
public class Assignment1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of jobs");
			int[] arr=new int[sc.nextInt()];
		    int[] brr=new int[arr.length];
			int[] crr=new int[arr.length];
			System.out.println("Enter job start time, end time, and earnings");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
				brr[i]=sc.nextInt();
				crr[i]=sc.nextInt();
			}
			int x=0;
			int Profit=0;
			for (int i = 0; i < crr.length; i++) {
				Profit=Profit+crr[i];
			}
			if(Profit>=900){
				x=2;
				Profit=400;
			}
			else if(Profit<900)
			{
				x=1;
				Profit=100;
			}
			System.out.println("The number of tasks and earnings available for others\nTask: "+x+"\nearnings: "+Profit);
		
	}

}
