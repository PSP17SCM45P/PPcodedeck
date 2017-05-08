package Gaspump;

import State.MDAEFSM;
import datastore.DataStore;
import datastore.DataStore2;

/* This is Input Processor 2 for GasPump 2. This will have all the operations of Gaspump2
 * Activate (int a, int b, int c) // the gas pump is activated where a is the price of Regular gas, b is
								  //the price of Premium gas and c is the price of Super gas per liter
	Start() //start the transaction
	PayCash(int c) // pay for gas by cash, where c represents prepaid cash
	Cancel() // cancel the transaction
	Premium() // Premium gas is selected
	Regular() // Regular gas is selected
	Super() // Super gas is selected
	StartPump() // start pumping gas
	PumpLiter() // one liter of gas is disposed
	Stop() // stop pumping gas
	Receipt() // Receipt is requested
	NoReceipt() // No receipt */

public class GasPump2 {
	
	MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

	DataStore dataStore = null; // Pointer to DataStore

	public GasPump2(MDAEFSM efsm, DataStore dataStore) {
		
		this.mdaefsm = efsm;
		this.dataStore = dataStore;
		// TODO Auto-generated constructor stub
	}

	public void Activate(int premiumprice, int superprice, int regularprice) {
		// TODO Auto-generated method stub
		
		if (premiumprice >0 && superprice > 0 && regularprice >0 ){
			((DataStore2) dataStore).temp_a = premiumprice;
			((DataStore2) dataStore).temp_b = superprice;
			((DataStore2) dataStore).temp_c = regularprice;
			mdaefsm.Activate();
		}
		
	}

	public void Start() {
		// TODO Auto-generated method stub
		mdaefsm.Start();
	}

	public void PayCash(int cash) {
		// TODO Auto-generated method stub
		if (cash > 0){
			((DataStore2) dataStore).temp_cash = cash;
			//((DataStore2) dataStore).w = 0;
			mdaefsm.PayType(2);
		}
		
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		mdaefsm.Cancel();
		mdaefsm.ReturnCash();
	}

	public void Regular() {
		// TODO Auto-generated method stub
		
		((DataStore2) dataStore).set_rprice();
		mdaefsm.SelectGas(1);

		System.out.println("!!Regular Gas is Selected!!\n");
		
	}

	public void Premium() {
		// TODO Auto-generated method stub
		((DataStore2) dataStore).set_pprice();
		mdaefsm.SelectGas(2);

		System.out.println("Premium Gas option is Selected\n");
		
	}

	public void Super() {
		// TODO Auto-generated method stub
		((DataStore2) dataStore).set_sprice();
		mdaefsm.SelectGas(3);

		System.out.println("Super Gas option is Selected\n");
		
	}

	public void StartPump() {
		// TODO Auto-generated method stub
		mdaefsm.StartPump();
		
	}

	public void Pump() {
		// TODO Auto-generated method stub
		if (((DataStore2) dataStore).cash < (((DataStore2) dataStore).L + 1)
				* ((DataStore2) dataStore).Price) {
			mdaefsm.StopPump();
			System.out.println("Pump has been stopped due to insufficient cash\n");
		} else

			mdaefsm.Pump();
		
	}

	public void StopPump() {
		// TODO Auto-generated method stub
		mdaefsm.StopPump();
	}

	public void Receipt() {
		// TODO Auto-generated method stub
		mdaefsm.Receipt();
		mdaefsm.ReturnCash();
	}

	public void NoReceipt() {
		// TODO Auto-generated method stub
		mdaefsm.NoReceipt();
		mdaefsm.ReturnCash();
	}
	
	

}
