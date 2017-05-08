package Strategy;

import datastore.DataStore;
import datastore.DataStore1;

public class SetPrice_GP1 extends SetPrice {

	
	public void SetPrice(DataStore dataStore)
	{
		System.out.println("\nGas Pump 1:- Gas Price: $" + ((DataStore1)dataStore).get_Price() );
		
	}
}
