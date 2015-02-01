package com.assignments.expensetracker.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Expense> EXPENSES = new ArrayList<Expense>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Expense> ITEM_MAP = new HashMap<String, Expense>();

	static {
		// Add 3 sample items.
		addItem(new Expense("1", "Item 1"));
		addItem(new Expense("2", "Item 2"));
		addItem(new Expense("3", "Item 3"));
	}

	private static void addItem(Expense expense) {
		//ITEMS.add(item);
		//ITEM_MAP.put(item.id, item);
	}

	/**
	 * An expense.
	 */
	public static class Expense {
		public String id;
		public String content;

		public Expense(String id, String content) {
			this.id = id;
			this.content = content;
		}

		/*
		@Override
		public String toString() {
			return content;
		}
		*/
	}
}
