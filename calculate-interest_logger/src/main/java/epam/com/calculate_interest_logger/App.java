package epam.com.calculate_interest_logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

class interest
{
	    Scanner scan=new Scanner(System.in);
	
	    float principal_amount,rate_of_interest,time,n,simple_interest;
		double compund_interest,amount;
		private static final Logger LOGGER =LogManager.getLogger(App.class);
	
	void calculate_interest()throws IOException
	{
		
		 System.out.format("\n \n \t ******************* CALCULATE SIMPLE & COMPOUND INTEREST *****************************\n \n ");
		  
		  
		 System.out.format("\n ENTER THE PRINCIPAL AMOUNT : ");
		   principal_amount=scan.nextFloat();
		 
		   
		   LOGGER.info("PRINCIPAL AMOUNT :  " + principal_amount);
		   
		   System.out.format("\n ENTER THE RATE OF INTEREST : ");
		   rate_of_interest=scan.nextFloat();
		   
		   LOGGER.info("INTEREST RATE  :"+  rate_of_interest);
		   
		 
		   System.out.format("\n ENTER THE TIME PERIODE (IN-YEARS) : ");
		   time=scan.nextFloat();
		   
		   
		   LOGGER.info("TIME PERIODE (YEARS) :  "+   time);
		  
		   simple_interest=(principal_amount*rate_of_interest*time)/100;
		   
		   LOGGER.info("  SIMPLE INTEREST AMOUNT IS RS:  "+simple_interest);
		   
			
			
		    amount=(principal_amount)* Math.pow( ( 1+ (rate_of_interest/100) ),time);
		  
		     compund_interest=amount-(principal_amount);
		   
		     LOGGER.info(" COMPUND  INTEREST AMOUNT IS RS:  "+compund_interest);
			
			
		     System.out.format(" \n \n --------------------------------------------------------------------------------");
		   
		 
		
		
	}
	
	
	
}



class construction 
{
	    Scanner scan=new Scanner(System.in);
		
		int choice;
		float area,cost=0;
		
		
		private static final Logger LOGGER =LogManager.getLogger(App.class);
	void  calculate_cost()throws IOException
	    {
		 System.out.format("\n \n \t ******************* ESTIMATE HOUSE CONSTRUCTION COST  *****************************\n \n ");
			 
		 System.out.format("\n 1. STANDARD-MATERIAL \n 2. ABOVE STANDARD-MATERIAL \n 3. HIGH STANDARD-MATERIAL \n 4. HIGH STANDARD-MATERIAL AND FULLY AUTOMATED HOME  \n");
		 System.out.format("=================================================================================================\n \n ");
		  
		  
		 System.out.format("\n ENTER TOTAL AREA OF THE HOUSE (square feet) : ");
              area = scan.nextFloat();
		  
              LOGGER.info("AREA OF HOUSE (SQUARE FEET) :  "+   area);
		  
              System.out.format("\n ENTER YOUR CHOICE FOR MATERIAL STANDARD : ");
		      choice = scan.nextInt();
			

			
	            switch(choice)
		        {
		   
		   
		                      case 1:  cost= area*1200;
							            display();
                                         break;
					   
			                 case 2:  cost= area*1500;
							            display();
                                         break;
			
			                 case 3:  cost= area*1800;
							           display();
                                         break;
					   
			                 case 4:  cost= area*2500;
							            display();
                                          break;
					   
			                 default :   System.out.format("\n WRONG CHOICE PLEASE RE-ENTER YOUR CHOICE !!!!! ");
			                              break;
		 
		 
		 
		        }
				
				
				
	            System.out.format(" \n \n --------------------------------------------------------------------------------");
		
		
		
	    }
		
	
	    void display()
		{
			
	    	 LOGGER.debug(" THE ESTIMATED  HOUSE CONSTRUCTION COST IS  :  "+cost);
			
		}
		
		
		
		
		
}



public class App 

{
	
    public static void main( String[] args )throws IOException
    {
    	 Scanner scan=new Scanner(System.in);
		   
		   int ch;
		   
		   System.out.format("\n \t \t \t**************** EPAM PROJECT ***************** \n ");
		   
		while (true)
		 
		{  
			System.out.format("\n \n 1. CALCULATE SIMPLE AND COMPOUND INTEREST \n 2. ESTIMATE HOUSE CONSTRUCTION COST  \n 3. EXIT \n ");
					 
			System.out.format("=====================================================================================\n \n ");
					  
			System.out.format("\n ENTER YOUR CHOICE  : ");
					  
		                 ch = scan.nextInt();
		                 
		  
		  
		  switch(ch)
		    {
		                    

				 case 1:	    interest one=new interest();
		                        one.calculate_interest();
							     break;
		
	
		                      
				 case 2: 	   construction two =new construction();
		                        two.calculate_cost();
							     break;
							
							
		         case 3: System.out.format("\n \t !!!! THANK YOU  !!!!! \t \n  ");
				            break;
				
				
				default :  System.out.format("\n WRONG CHOICE PLEASE RE-ENTER YOUR CHOICE !!!!! ");
			                   break;
		
		
	        }
		  
			
			if (ch==3)
			{
				scan.close();
				break;
			}
	
	
	
      }
		
    }
}
