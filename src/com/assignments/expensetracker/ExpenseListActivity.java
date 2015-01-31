package com.assignments.expensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * An activity representing a list of Expenses. This activity has different
 * presentations for handset and tablet-size devices. On handsets, the activity
 * presents a list of items, which when touched, lead to a
 * {@link ExpenseDetailActivity} representing item details. On tablets, the
 * activity presents the list of items and item details side-by-side using two
 * vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link ExpenseListFragment} and the item details (if present) is a
 * {@link ExpenseDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link ExpenseListFragment.Callbacks} interface to listen for item
 * selections.
 */
public class ExpenseListActivity extends FragmentActivity implements
		ExpenseListFragment.Callbacks {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expense_list);


		// TODO: If exposing deep links into your app, handle intents here.
	}

	/**
	 * Callback method from {@link ExpenseListFragment.Callbacks} indicating
	 * that the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id) {

		// In single-pane mode, simply start the detail activity
		// for the selected item ID.
		Intent detailIntent = new Intent(this, ExpenseDetailActivity.class);
		detailIntent.putExtra(ExpenseDetailFragment.ARG_ITEM_ID, id);
		startActivity(detailIntent);
	}
}

