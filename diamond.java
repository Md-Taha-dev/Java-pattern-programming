package taha;
import java.util.Scanner;
public class patterns {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
		for(int k=0;k<=(i+i);k++) {
			System.out.print("*");
		}
		    System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
		for(int k=0;k<2*(n-i)-1;k++) {
			System.out.print("*");
		}	
			System.out.println();
		}
	}
}
