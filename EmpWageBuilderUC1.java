package Empwage;

public class EmpWageBuilderUC1
{
	public static void main(String[] args)
	{
		int isEmpPresent = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == isEmpPresent)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Emloyee is Absent");
        }
    }
}
