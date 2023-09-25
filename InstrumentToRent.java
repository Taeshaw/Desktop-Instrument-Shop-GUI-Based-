/**
 *class InstrumentToRent is also child class of parent class.
 *
 * @author (Tesha Shree Shrestha)
 * @version (2022/03/10)
 */
public class InstrumentToRent extends Instrument
{
    private int ChargePerDay;
    private String DateOfRent;
    private String DateOfReturn;
    private int NoOfDays;
    private boolean IsRented;
    
    /**
     * the constructor accepts six parameters and value are
     * assigning respectively,
     */
    public InstrumentToRent(String InstrumentName, int ChargePerDay)
        {
            super(InstrumentName);
            this.ChargePerDay = ChargePerDay;
            this.DateOfRent = " ";
            this.DateOfReturn = " ";
            this.NoOfDays = 0;
            this.IsRented = false;
        }
       
        //accessor method
    public int getChargePerDay()
        {
            return this.ChargePerDay;
        }
    
    public String getDateOfRent()
        {
            return this.DateOfRent;
        }
        
    public String getDateOfReturn()
        {
            return this.DateOfReturn;
        }
        
    public int getNoOfDays()
        {
            return this.NoOfDays;
        }
        
    public boolean getIsRented()
        {
            return this.IsRented;
        }
        
        //setter method
    public void setChargePerDays(int ChargePerDay)
        {
            this.ChargePerDay = ChargePerDay;
        }
        
    public void setDateOfRent(String DateOfRent)
        {
            this.DateOfRent = DateOfRent;
        }
        
    public void setDateOfReturn(String DateOfReturn)
        {
            this.DateOfReturn = DateOfReturn;
        }
        
    public void setNoOfDays(int NoOfDays)
        {
            this.NoOfDays = NoOfDays;
        }
        
    public void setIsRented(boolean IsRented)
        {
            this.IsRented = IsRented;
        }
    
         //creating method to register details 'about person renting the instrument' with parameters
    public void InstrumentRenting(String CustomerName, String CustomerMobileNumber, int CustomerPAN_No, String DateOfRent, String DateOfReturn, int NoOfDays)
        {
            if(this.IsRented  == true)
                {
                    System.out.println("The Instrument Is Currently Not Available. It's Right Now Rented By \n Customer Name: "+
                                        getCustomerName() + "Customers Phone No. : " + getCustomerMobileNumber() + "And Date Of Return : "+
                                        getDateOfRent() );
                }
            else
                {
                    setCustomerName(CustomerName);
                    setCustomerMobileNumber(CustomerMobileNumber);
                    setCustomerPAN_No(CustomerPAN_No);
                    
                    setDateOfRent(DateOfRent);
                    setDateOfReturn(DateOfReturn);
                    setNoOfDays(NoOfDays);
                    setIsRented(true);
                    
                    System.out.println("The Instrument Has Been Successfully Rented.\n" +  
                                        "The Details Of The Person Renting The Instrument Is: ");
                                        
                    System.out.println("The Customers Name Is: " + getCustomerName() +
                                        "\n Customers Number Is: " + getCustomerMobileNumber() + 
                                        "\n Customers PAN Number Is: " + getCustomerPAN_No() + 
                                        "\n Its Rented Date Is: " + getDateOfRent() + 
                                        "\n Its Return Date Is: " + getDateOfReturn() + 
                                        "\n The No. Of Day Instrument Has Been Taken " + getNoOfDays() +
                                        "\n And Its Total Price Is : " + getNoOfDays()* getChargePerDay());
                    
                }
        }
        
        //creating method to initialize values to null or zero it given instrument is rented
    public void InstrumentToReturn ()
        {
            if(this.IsRented == true)
                {
                    setCustomerName("");
                    setCustomerMobileNumber("");
                    setDateOfReturn("");
                    setDateOfRent("");
                    setNoOfDays(0);
                    setIsRented(false);
                }
            else
                {
                    System.out.println("This Instrument Cannot Be Returned. There Is No Valid Information About It.");
                }
        }
    
        //display method
    public void display()
        {
            super.display();                //calling of method from parent class
            
            if(this.IsRented == true)
                {
                     System.out.println("Customer's Name: " + getCustomerName() +
                                         "\n Customer's Phone Number: " + getCustomerMobileNumber() +
                                         "\n Customer PAN Number: " + getCustomerPAN_No() +
                                         "\n Rented Date Of The Instrument: " + getDateOfRent() +
                                         "\n Return Date Of The Instrument: " + getDateOfReturn() );
                }
        }
}