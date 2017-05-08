package Strategy;

import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

public class GasPumpedMsg2 extends GasPumpedMsg {

	@Override
	public void GasPumpedMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println(((DataStore2)dataStore).get_L() + " Liters(s) Pumped"  );
		System.out.println("\nPress 9 to Continue the process of Pumping:\n");
	}

}
