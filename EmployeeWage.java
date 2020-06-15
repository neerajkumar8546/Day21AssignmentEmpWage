public class EmployeeWage
{
	public static void main(String[] args)
	{
		int is_FULL_TIME=1;
		int emp_RATE_PER_HOUR=20;
		
		int empHrs=0;
		int empWage=0;

		double check=Math.floor(Math.random()*10)%2;
		if(check==is_FULL_TIME)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*emp_RATE_PER_HOUR;
		System.out.println("Employee Wage = "+empWage);
	}
}
