package com.practices;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

interface Company {
	void assignSalaries(int[] salaries);

	void averageSalary();

	void maxSalary();

	void minSalary();
}


class EngineerFirm implements Company {
	
	private int[] income;
	
	protected String profession = "Engineer";
	List<Integer> dataList = null;
	IntSummaryStatistics stats = null;
	
	public EngineerFirm(int n) {
		income = new int[n];
		for (int i = 0; i < n; i++) {
			income[i] = 0;
		}
	}	

	public void assignSalaries(int[] salaries) {
		this.income = Arrays.copyOf(salaries, Math.min(income.length, salaries.length));
		this.dataList = Arrays.stream(income).boxed().collect(Collectors.toList());
		this.stats = dataList.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println("Incomes of "+ profession +" credited");
	}

	public void averageSalary() {
		System.out.println("Average salary of "+ profession +" is " + String.format("%.2f", this.stats.getAverage()));
	}

	public void maxSalary() {
		System.out.println("Maximum salary amongst "+ profession +" is " + this.stats.getMax());
	}

	public void minSalary() {
		System.out.println("Minimum salary amongst "+ profession +" is " + this.stats.getMin());
	}
	
}

class AccountantFirm extends EngineerFirm {

	public AccountantFirm(int n) {
		super(n);
		super.profession = "Accountant";
	}
	
	@Override
	public void assignSalaries(int[] salaries) {
		super.assignSalaries(salaries);
		
	}

	@Override
	public void averageSalary() {
		super.averageSalary();
	}

	@Override
	public void maxSalary() {
		super.maxSalary();
	}

	@Override
	public void minSalary() {
		super.minSalary();
	} 
	
}


public class Employee {

	public static void main(String[] args) throws Exception {
		
		EngineerFirm e = new EngineerFirm(5);
		AccountantFirm a = new AccountantFirm(5);
		
		int[] incomeAccountants = {9317, 7796, 3352, 7068, 9500};
		int[] incomeEngineers = {6848, 9329, 9984, 5543, 7986};
		
		e.assignSalaries(incomeEngineers);
		a.assignSalaries(incomeAccountants);
		e.averageSalary();
		e.maxSalary();
		e.minSalary();
		a.averageSalary();
		a.maxSalary();
		a.minSalary();

	}
}
