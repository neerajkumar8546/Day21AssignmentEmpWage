public class EmployeeWage
{
	public static void main(String[] args)
	{
		double checkAtt=Math.floor(Math.random()*10)%2;
		if(checkAtt==1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
