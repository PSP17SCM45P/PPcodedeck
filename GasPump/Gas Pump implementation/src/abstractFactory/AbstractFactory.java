package abstractFactory;

import Strategy.*;

/* Abstract factory will help concrete factory 1 and 2 to link with the strategy pattern classes*/
public interface AbstractFactory 
{

	public StoreData get_StoreData();

	public PayMsg get_PayMsg();

	public StoreCash get_StoreCash();

	public DisplayMenu get_DisplayMenu();

	public RejectMsg get_RejectMsg();
	
	public PayType get_PayType();

	public SetPrice get_SetPrice();

	public ReadyMsg get_ReadyMsg();

	public SetInitialValues get_SetInitialValues();

	public PumpGasUnit get_PumpGasUnit();

	public GasPumpedMsg get_GasPumpedMsg();

	public StopMsg get_StopMsg();

	public PrintReceiptMsg get_PrintReceiptMsg();

	public CancelMsg get_CancelMsg();

	public ReturnCash get_ReturnCash();
	
}
