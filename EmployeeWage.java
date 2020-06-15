public class EmployeeWage{
	public static final int is_Part_Time=1;
	public static final int is_Full_Time=2;
	public static final int emp_Rate_Per_Hrs=20;
	public static final int num_Of_Working_Days=20;
	public static final int max_Hrs_In_Month=100;
	
	public static void calculateEmpWage()
	{
		
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0,totalEmpWage=0;
		
		while (totalEmpHrs<=max_Hrs_In_Month && totalWorkingDays<num_Of_Working_Days)
		{
			
			totalWorkingDays++;
			int check=(int)Math.floor(Math.random()*10)%3;
			switch(check)
			{
				
				case is_Full_Time:
					empHrs=8;
					break;
				case is_Part_Time:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			System.out.println("Day "+ totalWorkingDays + "Emp. Hrs. "+empHrs);
			
		}
		totalEmpWage=totalEmpHrs*emp_Rate_Per_Hrs;
		System.out.println("Total EmpWage = " +totalEmpWage);
		
	}
	
	public static void main(String[] args)
	{
		
		calculateEmpWage();
		
	}
	
}
