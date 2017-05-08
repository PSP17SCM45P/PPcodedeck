package Gaspump;

import State.MDAEFSM;
import datastore.DataStore;
import datastore.DataStore1;

/* This is Input Processor 1 for GasPump 1. This will have all the operations of Gaspump1
 * Activate (float a, float b) // the gas pump is activated where a is the price of the Regular gas
								// and b is the price of Super gas per gallon
	Start() //start the transaction
	PayCredit() // pay for gas by a credit card
	Reject() // credit card is rejected
	Cancel() // cancel the transaction
	Approved() // credit card is approved
	Super() // Super gas is selected
	Regular() // Regular gas is selected
	StartPump() // start pumping gas
	PumpGallon() // one gallon of gas is disposed
	StopPump() // stop pumping gas*/
public class GasPump1 {


		MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

		DataStore dataStore = null; // Pointer to DataStore

		public GasPump1(MDAEFSM mdaefsm, DataStore dataStore) {
			this.mdaefsm = mdaefsm;
			this.dataStore = dataStore;

		}

		public void Activate(float superprice, float regularprice) {
			// TODO Auto-generated method stub
			if (superprice > 0 && regularprice > 0)
				((DataStore1) dataStore).temp_a = superprice;
			    ((DataStore1) dataStore).temp_b = regularprice;

			mdaefsm.Activate();
		}
		// TODO Auto-generated method stub

		public void Start() {
			// TODO Auto-generated method stub
			mdaefsm.Start();
		}

		public void PayCredit() {
			// TODO Auto-generated method stub
	//		mdaefsm.PayCredit();
			mdaefsm.PayType(1);
			System.out.println("Payment Approval needed");
		}

		public void Reject() {
			// TODO Auto-generated method stub
			mdaefsm.Reject();
			
		}

		public void Cancel() {
			// TODO Auto-generated method stub
			mdaefsm.Cancel();
			
		}

		public void Approved() {
			// TODO Auto-generated method stub
			mdaefsm.Approved();
			
		}

		public void Regular() {
			// TODO Auto-generated method stub
			((DataStore1) dataStore).set_rprice();
			mdaefsm.SelectGas(1);

			System.out.println("Regular Gas option is selected\n");
			
		}

		public void Super() {
			// TODO Auto-generated method stub
			((DataStore1) dataStore).set_sprice();
			mdaefsm.SelectGas(2);

			System.out.println("Super Gas option is Selected\n");
			
		}

		public void StartPump() {
			// TODO Auto-generated method stub
			mdaefsm.StartPump();
			
		}

		public void Pump() {
			mdaefsm.Pump();
			// TODO Auto-generated method stub
			
		}

		public void StopPump() {
			// TODO Auto-generated method stub
			mdaefsm.StopPump();
			mdaefsm.Receipt();
			
		}
		
		
	}


