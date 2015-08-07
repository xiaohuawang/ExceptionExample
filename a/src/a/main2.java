package a;

public class main2 {

	public static void main(String[] args)
	{
	
		 String[][] mm = new String[5][25];
		 
		 Input c=new Input();
		  mm= c.inputt();
		 
		for(int i=0;i<mm.length;i++)
		{
			for(int j=0;j<mm[i].length;j++)
			{
				
				System.out.println(mm[i][j]);
			}
		}	
		
	
	}
	
}
