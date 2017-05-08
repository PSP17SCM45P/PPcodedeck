package Maindriver;
import java.util.Scanner;

import Gaspump.GasPump1;
import Gaspump.GasPump2;
import Output.Output;
import State.MDAEFSM;
import State.state;
import abstractFactory.ConcreteFactory1;
import abstractFactory.ConcreteFactory2;

/* This is the main driver of the entire project. The user input for Gaspump 1 and Gaspump 2 will be avaliable from this class*/
public class Maindriver 
{
    public static int _gaspump_flag = 0;
	public static void main(String[] args) 
	
	{
		
		System.out.println("		       Menu	           ");
		System.out.println("----------------------------------------");
		System.out.println("		1. Select Gas Pump 1					");
		System.out.println("		2. Select Gas Pump 2					");
		System.out.println("-----------------------------------------");
		System.out.println("		Input your choice				");

		Scanner scr = new Scanner(System.in);
		int choice = scr.nextInt();
		switch(choice)
        {
		case 1:
		{
			// Gaspump 1
			_gaspump_flag= 1;	
			ConcreteFactory1 c_factory1 = new ConcreteFactory1();
			
			MDAEFSM md_efsm = new MDAEFSM();
			state.opobj = new Output(c_factory1, c_factory1.get_DataStore());
			GasPump1 gp_1 = new GasPump1(md_efsm, c_factory1.get_DataStore());
			
			System.out.println();
			System.out.println("Operations for Gas Pump 1");
			
			System.out.println("1. Activate(float,float)");
			System.out.println("2. Start() ");
			System.out.println("3. PayCredit()");
			System.out.println("4. Reject() ");
			System.out.println("5. Cancel()");
			System.out.println("6. Approved()");
			System.out.println("7. Super()  ");
			System.out.println("8. Regular()");
			System.out.println("9. StartPump()");
			System.out.println("10. PumpGallon()");
			System.out.println("11. StopPump()");
			System.out.println("12. Quit");
			
			while(true)
			{
				System.out.println();
				System.out.println("Select Operation: ");
				System.out.println("1-Activate\n2-Start\n3-PayCredit\n4-Reject\n5-Cancel\n6-Approved\n7-Super\n8-Regular\n9-StartPump\n10-PumpGallon\n11-StopPump\n12-Quit");	
				System.out.println("Enter your choice:");
				int choice_1 = scr.nextInt();
				switch(choice_1){
				case 1:
				{
		
				System.out.println("\n  Operation:  Activate(float a,float b)");
				System.out.println("   Enter the Unit  Price of the Super Gas - a");
				float superprice_1  =  scr.nextFloat();
				System.out.println("   Enter the Unit  Price of the Regular Gas - b");
				float regularprice_1 = scr.nextFloat();
				gp_1.Activate(superprice_1,regularprice_1);
				break;
				}
			
				case 2:
				{
				
				System.out.println("  Operation:  Start()");
				gp_1.Start();
				break;
				}
			
				case 3:
				{
				
				System.out.println("  Operation:  PayCredit()");
				gp_1.PayCredit();
				break;
				}
			
				case 4:
				{
			
				System.out.println("Operation:  Reject()");
				gp_1.Reject();
				break;
				}
			
				case 5:
				{
			
				System.out.println("Operation:  Cancel()");
				gp_1.Cancel();
				break;
				}
			
				case 6:
				{
				//approve
				System.out.println("Operation: Approved()");
				gp_1.Approved();
				break;
				}
			
				case 7:
				{
				//select regular gas
				System.out.println("  Operation:  Regular()");
				gp_1.Regular();
				break;
				}
			
				case 8:
				{
				//selected super gas
				System.out.println("  Operation:  Super()");
				gp_1.Super();
				break;
				}
			
				case 9:
				{
				
				System.out.println("  Operation:  StartPump()");
				gp_1.StartPump();
				break;
				}
			
				case 10:
				{
			
				System.out.println("  Operation:  Pump()");
				gp_1.Pump();
				break;
				}
			
				case 11:
				{
			
				System.out.println("  Operation:  StopPump()");
				gp_1.StopPump();
				break;
				}
			
				case 12:
				{
			
				System.out.println("Quit Gas Pump 1 operations");
				break;
				}
			    default:
			    	
				System.out.println("Please  a valid input");
				break;
				}
			}
			
		}
		case 2:
		{
			ConcreteFactory2 c_factory2 = new ConcreteFactory2();
			MDAEFSM mda_efsm = new MDAEFSM();
			state.opobj = new Output(c_factory2, c_factory2.GetDataStore());
			GasPump2 gp_2 = new GasPump2(mda_efsm, c_factory2.GetDataStore());
			_gaspump_flag = 2;
			
			System.out.println();
			System.out.println("Operations for Gas Pump 2");
			System.out.println("1. Activate(int, int ,int)");
			System.out.println("2. Start() ");
			System.out.println("3. PayCash()");
			System.out.println("4. Cancel()");
			System.out.println("5. Premium()");
			System.out.println("6. Regular()");
			System.out.println("7. Super()  ");
			System.out.println("8. StartPump()");
			System.out.println("9. PumpLiter()");
			System.out.println("10. StopPump()");
			System.out.println("11. Receipt()");
			System.out.println("12. NoReceipt()");
			System.out.println("13. Quit");
			
			while(true)
			{
				System.out.println();
				System.out.println("  Select Operation: ");
				System.out.println("1-Activate\n2-Start\n3-PayCash\n4-Cancel\n5-Premium\n6-Regular\n7-Super\n8-StartPump\n9-PumpLiter\n10-StopPump\n11-Receipt\n12-NoReceipt\n13-Quit");	
				System.out.println("Enter your choice:");
				int choice_2 = scr.nextInt();
				switch(choice_2){
				case 1:
				{  
		
				System.out.println("\n  Operation:  Activate(int a,int b,int c)");
				System.out.println("   Enter the Unit  Price of the Premium Gas - value a");
				int premiumprice_2  =  scr.nextInt();
				System.out.println("   Enter the Unit  Price of the Super Gas - value b");
				int superprice_2  =  scr.nextInt();
				System.out.println("   Enter the Unit  Price of the Regular Gas - value c");
				int regularprice_2 = scr.nextInt();
				gp_2.Activate(premiumprice_2,superprice_2,regularprice_2);
				break;
				}
				case 2:
				{
				
				System.out.println("  Operation:  Start()");
				gp_2.Start();
				break;
				}
			
				case 3:
				{
				//PayCash
				System.out.println("  Operation:  PayCash()");
				System.out.println("Enter the amount of cash :");
				int cash = scr.nextInt();
				gp_2.PayCash(cash);
				break;
				}
						
				case 4:
				{
				System.out.println("Operation:  Cancel()");
				gp_2.Cancel();
				break;
				}
				case 5:
				{
				//select regular gas
				System.out.println("  Operation:  Premium()");
				gp_2.Premium();
				break;
				}
			
				case 6:
				{
				//select regular gas
				System.out.println("  Operation:  Regular()");
				gp_2.Regular();
				break;
				}
				case 7:
				{
				//selected super gas
				System.out.println("  Operation:  Super()");
				gp_2.Super();
				break;
				}
				case 8:
				{
				//start pump
				System.out.println("  Operation:  StartPump()");
				gp_2.StartPump();
				break;
				}
				case 9:
				{
			
				System.out.println("  Operation:  Pump()");
				gp_2.Pump();
				break;
				}
				case 10:
				{
			
				System.out.println("  Operation:  StopPump()");
				gp_2.StopPump();
				break;
				}
				case 11:
				{
			
				System.out.println("  Operation:  Receipt()");
				gp_2.Receipt();
				break;
				}
				case 12:
				{
			
				System.out.println("  Operation:  NoReceipt()");
				gp_2.NoReceipt();
				break;
				}
			
				case 13:
				{
				
				System.out.println("Quitting Gas Pump 2");
				break;
				}
				default:
				{	
				System.out.println("Select a valid input");
				}
			}
			
		} //while
		}
		default:
		{
		
			System.out.println("Invalid choice selected");
			
		
		}
        }
		
	}
		
}