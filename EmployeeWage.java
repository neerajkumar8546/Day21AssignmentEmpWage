public class EmployeeWage
{
	public static void main(String[] args)
	{
		final int is_FULL_TIME=1;
		final int is_Part_Time=2;
		final int emp_RATE_PER_HOUR=20;
		final int num_Of_Working_Days=20;
		final int max_Hrs_In_Month=100;
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while (totalEmpHrs<=max_Hrs_In_Month && totalWorkingDays<num_Of_Working_Days)
		{
			totalWorkingDays++;
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
			totalEmpHrs=totalEmpHrs+empHrs;
			System.out.println("Day : "+totalWorkingDays+ " EmpHrs : "+empHrs);

		}
		totalEmpWage=totalEmpHrs*emp_RATE_PER_HOUR;
		System.out.println("Total Employee Wage = "+totalEmpWage);
	}
}
