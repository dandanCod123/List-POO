package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employ;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		List<Employ> list = new ArrayList<>();
		
		System.out.println("HOW MANY EMPLOYEE?");
		int n = sc.nextInt();
		
		for(int i=0 ; i<n;i++) {
			System.out.println();
			System.out.println("EMployee #"+ (i+1)+":");
			System.out.print("ID: ");
			sc.nextLine();
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary");
			double salary = sc.nextDouble();
			
		    Employ emp = new Employ(id,name,salary);
		    list.add(emp);
		}
		
		System.out.println("ENTER THE EMPLOYEE SALARY INCREASE:");
		int idsalary =  sc.nextInt();
		Integer pos = position(list , idsalary);
		if(pos == null) {
			System.out.println("tjis id does not exist: ");
		}else {
			System.out.println("enter the percentage: ");
		    double percent = sc.nextDouble();
		    list.get(pos).increaseSalary(percent);
		    
		}
		
		System.out.println();
		System.out.println("list of employees: ");
		for(Employ emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}

	public static Integer position(List<Employ> list, int id) {
		for(int i =0; i< list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
	      return null;
	}
	
}
