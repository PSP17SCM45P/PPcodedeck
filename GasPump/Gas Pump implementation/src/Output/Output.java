package Output;
/* output class for performing operations
 * 
 */

import Strategy.CancelMsg;
import Strategy.DisplayMenu;
import Strategy.GasPumpedMsg;
import Strategy.PayMsg;
import Strategy.PrintReceiptMsg;
import Strategy.PumpGasUnit;
import Strategy.ReadyMsg;
import Strategy.RejectMsg;
import Strategy.ReturnCash;
import Strategy.SetInitialValues;
import Strategy.SetPrice;
import Strategy.StopMsg;
import Strategy.StoreCash;
import Strategy.StoreData;
import abstractFactory.AbstractFactory;
import datastore.DataStore;

/*This is the output processor which will have all our meta actions
 * 
 * StoreData // stores price(s) for the gas from the temporary data store
PayMsg // displays a type of payment method
StoreCash // stores cash from the temporary data store
DisplayMenu // display a menu with a list of selections
RejectMsg // displays credit card not approved message
SetPrice(int g) // set the price for the gas identified by g identifier
ReadyMsg // displays the ready for pumping message
SetInitialValues // set G (or L) and total to 0
PumpGasUnit // disposes unit of gas and counts # of units disposed
GasPumpedMsg // displays the amount of disposed gas
StopMsg // stop pump message and receipt? msg (optionally)
PrintReceipt // print a receipt
CancelMsg // displays a cancellation message
ReturnCash // returns the remaining cash */

public class Output {

	AbstractFactory factory = null;
	DataStore dataStore = null;
	
	
	public Output(AbstractFactory factory, DataStore dataStore) {
		this.factory = factory;
		this.dataStore = dataStore;
	}
	
	public void StoreData() {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to the gas pump it is activated!! \n");
		StoreData storedata = factory.get_StoreData();
		storedata.StoreData(dataStore);
	}
	
	public void PayMsg() {
		// TODO Auto-generated method stub
		PayMsg paymsg = factory.get_PayMsg();
		paymsg.PayMsg();
	}

	public void StoreCash() {
		// TODO Auto-generated method stub
		StoreCash storecash = factory.get_StoreCash();
		storecash.StoreCash(dataStore);
		
	}

	public void SetW() {
		// TODO Auto-generated method stub
		
	}

	public void DisplayMenu() {
		// TODO Auto-generated method stub
		DisplayMenu displaymenu = factory.get_DisplayMenu();
		displaymenu.DisplayMenu();
		
	}

	public void RejectMsg() {
		// TODO Auto-generated method stub
		RejectMsg rejectmsg = factory.get_RejectMsg();
		rejectmsg.RejectMsg();
	}

	public void CancelMsg() {
		// TODO Auto-generated method stub
		CancelMsg cancelmsg = factory.get_CancelMsg();
		cancelmsg.cancelmsg();
		
		
	}

	public void SetPrice() {
		// TODO Auto-generated method stub
		SetPrice setprice = factory.get_SetPrice();
		setprice.SetPrice(dataStore);
		
	}

	public void SetInitialValues() {
		// TODO Auto-generated method stub
		SetInitialValues setinitialvalues = factory.get_SetInitialValues();
		setinitialvalues.SetInitialValues(dataStore);
		
	}

	public void ReadyMsg() {
		// TODO Auto-generated method stub
		ReadyMsg readymsg = factory.get_ReadyMsg();
		readymsg.ReadyMsg();
		
	}

	public void PumpGasUnit() {
		// TODO Auto-generated method stub
		PumpGasUnit pumpgasunit = factory.get_PumpGasUnit();
		pumpgasunit.PumpGasUnit();
		
	}

	public void GasPumpedMsg() {
		// TODO Auto-generated method stub
		GasPumpedMsg gaspumpedmsg = factory.get_GasPumpedMsg();
		gaspumpedmsg.GasPumpedMsg(dataStore);
		
	}

	public void StopMsg() {
		// TODO Auto-generated method stub
		StopMsg stopmsg = factory.get_StopMsg();
		stopmsg.StopMsg();
		
	}

	public void PrintReceiptMsg() {
		// TODO Auto-generated method stub
		System.out.println("\n RECEIPT: \n");
		PrintReceiptMsg printreceiptmsg = factory.get_PrintReceiptMsg();
		printreceiptmsg.PrintReceiptMsg(dataStore);
		
	}
	
	public void ReturnCash(){
		ReturnCash returncash = factory.get_ReturnCash();
		returncash.ReturnCash(dataStore);
		
	}

	

}
