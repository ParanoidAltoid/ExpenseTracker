package com.assignments.expensetracker;

import java.util.Date;



public class Expense {

	private Date date;
	private ExpenseCategory category;
	private String description;
	private double amountSpent;
	private String currency;

	public Expense(Date date, ExpenseCategory category, String description,
			double amountSpent, String currency) {
		
		this.date = date;
		this.category = category;
		this.description = description;
		this.amountSpent = amountSpent;
		this.currency = currency;
		
	}

}
