package Strategy;

import datastore.DataStore;
import datastore.DataStore1;


public class PrintReceiptMsg1 extends PrintReceiptMsg {
	public void PrintReceiptMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump 1:\n");
		
		System.out.println("\nTotal Amount calculated:- $" + ((DataStore1)dataStore).get_Total() );
		System.out.println("Quantity:-"+ (((DataStore1)dataStore).get_G()-1) + " Gallon(s)" );
	}

}
