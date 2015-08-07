package a;

public class Course {

	
	    private String code;
	    private String grade;
	    private double credit;
	   // protected static int count = 0;

	    public Course() {}

	    public void setCode(String code)
	    {
	        this.code = code;
	    }

	    public String getCode()
	    {
	        return code;
	    }
	    public void setGrade(String grade)
	    {
	        this.grade = grade;
	    }

	    public String getGrade()
	    {
	        return grade;
	    }

	    public void setCredit(double b)
	    {
	        this.credit = b;
	    }

	    public double getCredit()
	    {
	        return credit;
	    }
	    
	    /*
	    public String getFormattedPrice()
	    {
	        NumberFormat currency = 
	            NumberFormat.getCurrencyInstance();
	        return currency.format(price);
	    }
        */
	    
	    @Override
	    public String toString()
	    {
	        return "Code:        " + code + "\n" +
	               "Grade: " + grade+  "\n" +
	               "Credit:       " + credit + "\n";
	    }

	   // public static int getCount()
	    //{
	      //  return count;
	    //}
	
	
	
}
