import java.util.*;
public class Star{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of n : ");
   int n=sc.nextInt();
   for(int i=n;i>=0;i--){
      for(int j=1;j<=i;j++){
	    System.out.print(i);
		}
		System.out.println(" ");
	}	
	}
}	
