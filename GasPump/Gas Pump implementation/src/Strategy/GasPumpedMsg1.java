package Strategy;

import datastore.DataStore;
import datastore.DataStore1;


public class GasPumpedMsg1 extends GasPumpedMsg {
	
	public void GasPumpedMsg(DataStore dataStore){
		System.out.println(((DataStore1)dataStore).get_G() + " Gallon(s) Pumped"  );
		System.out.println("\nPress 10 to Continue the process of Pumping:\n");
	}

}
