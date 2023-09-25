/**
 * Class Instrument is the parent class or super class or base class
 *
 * @author (Tesha Shree Shrestha)
 * @version number (2022/03/10)
 */
public class Instrument
{                                                   ////defining variables
    private static int InstrumentID;
    private String InstrumentName;
    private String CustomerName;
    private String CustomerMobileNumber;
    private int CustomerPAN_No;

    /**
     * initializing variables in constructor and assigning values
     * parameters of constructor respectively.
     */
    public Instrument(String InstrumentName)
        {
            this.InstrumentName = InstrumentName;
            InstrumentID++;                                         /*adding the number of instrument as its number increases*/
            this.CustomerName = CustomerName;
            this.CustomerMobileNumber = CustomerMobileNumber;
            this.CustomerPAN_No = CustomerPAN_No;
        }

        //accessor method of each attributes corresponding
    public int getInstrumentID()                                
        {
            return InstrumentID;
        }

    public String getInstrumentName()
        {
            return this.InstrumentName;
        }
    
    public String getCustomerName()
        {
            return this.CustomerName;
        }
    
    public String getCustomerMobileNumber()
        {
            return this.CustomerMobileNumber;
        }
    
    public int getCustomerPAN_No()
        {
            return this.CustomerPAN_No;
        }
    
        //setter method to assign new name parameter
    public void setInstrumentID(int InstrumentID)
        {
            this.InstrumentID = InstrumentID;
        }
    
    public void setInstrumentName(String InstrumentName)
        {
            this.InstrumentName = InstrumentName;
        }
    
    public void setCustomerName(String CustomerName)
        {
            this.CustomerName = CustomerName;
        }
    
    public void setCustomerMobileNumber(String CustomerMobileNumber)
        {
            this.CustomerMobileNumber = CustomerMobileNumber;
        }
    
    public void setCustomerPAN_No(int CustomerPAN_No)
        {
            this.CustomerPAN_No = CustomerPAN_No;
        }
    
    //display method
    public void display()                                                                                                                    /*displaying the values obtained from the user*/
        {
            System.out.println("The Instrument's Name And Its ID is " + this.InstrumentName + "And " + this.InstrumentID + "Respectively.");
        
            if(this.CustomerName !=" "  &&  this.CustomerMobileNumber != " "  &&  this.CustomerPAN_No!=0)
            {
                System.out.println("The Name Of The Customer, Their Mobile Number And Their PAN Number Is " +
                                    this.CustomerName + ", " + this.CustomerMobileNumber + "And " + this.CustomerPAN_No +
                                    "Respectively.");
            }
        }
}