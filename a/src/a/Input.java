package a;
import java.util.Scanner;
public class Input {
	
	String d[][]=new String[4][20];
	
	
   String[][] inputt()
   {
	 int i=0;
	   Course a=new Course();
	
	   System.out.println("Welcome to the transcript application")  ;
	  
	   Scanner sc=new Scanner(System.in);
	System.out.println("continue:yes or no");
	String aaaa=sc.nextLine();
	while(true)// aaaa is import
	{
		//Scanner sm=new Scanner(System.in);
	    System.out.println("input Course");
	    Scanner so=new Scanner(System.in);
	    String aa=so.nextLine();
	   a.setCode(aa);
	    d[0][i]=a.getCode();
	   
	    System.out.println("input credit");
	    Double bb=sc.nextDouble();
	     a.setCredit(bb);
		d[1][i]= a.getGrade();
		System.out.println("continue:yes or no");
		Scanner sl=new Scanner(System.in);
		String aaa=sl.nextLine();
	   
		if(aaa.equals("n"))
			break;
	 
		i++;
	
	
	}  
   
	return  d;
   
   }
	
	
	
}
