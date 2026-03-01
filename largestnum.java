package largestno;
import java.util.Scanner;
public class largestno {
//This program finds largest of two numbers given in the console  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        for(;;) { 
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		System.out.println("Enter a number : ");
		int b = sc.nextInt();
		if (a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
        System.out.println("Do you want to continue : Y/N");
        char c = Character.toUpperCase(sc.next().charAt(0));
        if (c=='N'){
            System.out.println("Thank you ");
            break ;
        }
        }
		sc.close();
	}

}
