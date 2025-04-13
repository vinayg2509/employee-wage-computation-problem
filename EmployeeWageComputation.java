package employeewagecomputation;

import java.util.Random;
import java.util.Scanner;

class EmployeeWageComputation 
{

	public static void main(String[] args) 
	{
		// Displaying a welcome message
		System.out.println("Welcome to Employee Wage Computation Problem!!");

		Scanner sc = new Scanner(System.in);

		// Input employee name
		System.out.print("Enter an employee name: ");
		String name = sc.nextLine();

		// Generate random attendance (0 - Absent, 1 - Present)
		Random random = new Random();
		int attendance = random.nextInt(2); // generates 0 or 1

		// Display attendance result
		if (attendance == 0) 
		{
			System.out.println("Employee " + name + " is absent.");
		} 
		else 
		{
			System.out.println("Employee " + name + " is present.");
		}

		sc.close();


	}

}
