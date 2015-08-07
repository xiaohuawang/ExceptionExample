package a;

public class aixia {
  
    
	public static test getit()
	{
		
		Course c=new Course();
		
		double abc[]=new double[100];	
		/*
		test a=new test();
		
		Course m=new Course();
		
		for(int i=0;i<20;i++)
		{
			String k="java";
		  m=a.getCourse(k);	
		
		  abc[i]= m.getCredit();
		}
		*/
		
		c.setCredit(358.0);
		
		for(int i=0;i<5;i++)
		{
			abc[i]=c.getCredit();
		}
		
		
		c.setCredit(22.5);
		
		return c;
	}
	
}
