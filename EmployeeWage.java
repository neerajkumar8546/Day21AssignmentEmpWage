public class EmployeeWage
{
	public static void main(String[] args)
	{
		final int is_FULL_TIME=1;
		final int is_Part_Time=2;
		final int emp_RATE_PER_HOUR=20;
		final int num_Of_Working_Days=20;
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;

		
		for (int i=0;i<num_Of_Working_Days;i++)
		{
			int check=(int)Math.floor(Math.random()*10)%3;

			switch (check)
      	{
         	case is_FULL_TIME:
            	empHrs=4;
            	break;
         	case is_Part_Time:
            	empHrs=8;
         	   break;
      	   default:
   	         empHrs=0;
	      }
			empWage=empHrs*emp_RATE_PER_HOUR;
			totalEmpWage=totalEmpWage+empWage;
			System.out.println("Employee Wage = "+empWage);

		}

		System.out.println("Total Employee Wage = "+totalEmpWage);
	}
}
