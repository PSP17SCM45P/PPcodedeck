package abstractFactory;

import Strategy.CancelMsg;
import Strategy.CancelMsg1;
import Strategy.DisplayMenu;
import Strategy.DisplayMenu_1;
import Strategy.DisplayMenu_2;
import Strategy.GasPumpedMsg;
import Strategy.GasPumpedMsg1;
import Strategy.GasPumpedMsg2;
import Strategy.PayMsg;
import Strategy.PayMsg1;
import Strategy.PayMsg2;
import Strategy.PayType;
import Strategy.PaytypeGP;
import Strategy.PrintReceiptMsg;
import Strategy.PrintReceiptMsg1;
import Strategy.PrintReceiptMsg2;
import Strategy.PumpGasUnit;
import Strategy.PumpGasUnit1;
import Strategy.PumpGasUnit2;
import Strategy.ReadyMsg;
import Strategy.ReadyMsgGP;
import Strategy.RejectMsg;
import Strategy.RejectMsgGP;
import Strategy.ReturnCash;
import Strategy.ReturnCashGP;
import Strategy.SetInitialValues;
import Strategy.SetInitialValues_GP1;
import Strategy.SetInitialValues_GP2;
import Strategy.SetPrice;
import Strategy.SetPrice_GP1;
import Strategy.SetPrice_GP2;
import Strategy.StopMsg;
import Strategy.StopMsgGP;
import Strategy.StoreCash;
import Strategy.StoreCash_GP2;
import Strategy.StoreData;
import Strategy.StoreData_GP1;
import Strategy.StoreData_GP2;
import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

/* Concrete factory 2 will link to the strategy pattern classes which link logically in the gaspump2*/
public class ConcreteFactory2 implements AbstractFactory{
	
	DataStore dataStore = new DataStore2();
	StoreData storedata = new StoreData_GP2();
	PayMsg paymsg = new PayMsg2();
	StoreCash storecash = new StoreCash_GP2();
	DisplayMenu displaymenu = new DisplayMenu_2();
	ReadyMsg readymsg = new ReadyMsgGP();
	PumpGasUnit pumpgasunit = new PumpGasUnit2();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg2();
	StopMsg stopmsg = new StopMsgGP();
	PrintReceiptMsg printreceiptmsg = new PrintReceiptMsg2();
	CancelMsg cancelmsg = new CancelMsg1();
	SetInitialValues setinitialvalues = new SetInitialValues_GP2();
	PayType paytype = new PaytypeGP();
	SetPrice setprice = new SetPrice_GP2();
	ReturnCash returncash = new ReturnCashGP();

	
	public void ConcreteFactory() {

	}

	public DataStore CreateDataStore() {
		return (this.dataStore);
	}
	
	public DataStore GetDataStore() {
		return this.dataStore;
	}
	@Override
	public StoreData get_StoreData() {
		// TODO Auto-generated method stub
		return this.storedata;
	}

	@Override
	public PayMsg get_PayMsg() {
		// TODO Auto-generated method stub
		return this.paymsg;
	}

	@Override
	public StoreCash get_StoreCash() {
		// TODO Auto-generated method stub
		return this.storecash;
	}

	@Override
	public DisplayMenu get_DisplayMenu() {
		// TODO Auto-generated method stub
		return this.displaymenu;
	}

	@Override
	public RejectMsg get_RejectMsg() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public SetPrice get_SetPrice() {
		// TODO Auto-generated method stub
		return this.setprice;
	}

	@Override
	public ReadyMsg get_ReadyMsg() {
		// TODO Auto-generated method stub
		return this.readymsg;
	}

	@Override
	public SetInitialValues get_SetInitialValues() {
		// TODO Auto-generated method stub
		return this.setinitialvalues;
	}

	@Override
	public PumpGasUnit get_PumpGasUnit() {
		// TODO Auto-generated method stub
		return this.pumpgasunit;
	}

	@Override
	public GasPumpedMsg get_GasPumpedMsg() {
		// TODO Auto-generated method stub
		return this.gaspumpedmsg;
	}

	@Override
	public StopMsg get_StopMsg() {
		// TODO Auto-generated method stub
		return this.stopmsg;
	}

	@Override
	public PrintReceiptMsg get_PrintReceiptMsg() {
		// TODO Auto-generated method stub
		return this.printreceiptmsg;
	}

	@Override
	public CancelMsg get_CancelMsg() {
		// TODO Auto-generated method stub
		return this.cancelmsg;
	}

	@Override
	public PayType get_PayType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCash get_ReturnCash() {
		// TODO Auto-generated method stub
		return returncash;
	}

}
