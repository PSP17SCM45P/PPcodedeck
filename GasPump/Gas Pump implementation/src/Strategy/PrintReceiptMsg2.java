package Strategy;

import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

public class PrintReceiptMsg2 extends PrintReceiptMsg {

	@Override
	public void PrintReceiptMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
         System.out.println("Gas Pump 2:\n");
		
		System.out.println("\nTotal Amount:- $" + ((DataStore2)dataStore).get_Total() );
		System.out.println("Quantity:-"+ (((DataStore2)dataStore).get_L()-1) + " Liter(s)" );
	}

}
