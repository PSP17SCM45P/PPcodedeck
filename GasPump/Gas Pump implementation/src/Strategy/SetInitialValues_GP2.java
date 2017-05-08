package Strategy;

import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

public class SetInitialValues_GP2 extends SetInitialValues {

	@Override
	public void SetInitialValues(DataStore dataStore) {
		// TODO Auto-generated method stub

		((DataStore2)dataStore).set_L(0);
		((DataStore2)dataStore).set_Total(0);
	}

}
