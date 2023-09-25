/**
 * class InstrumentToSell is one of child class of course class which is parent class
 *
 * @author (Tesha Shree Shrestha)
 * @version (2022/03/10)
 */
public class InstrumentToSell extends Instrument
{
    private float Price;
    private String SellDate;
    private float DiscountPercentage;
    private boolean IsSold;
    
    /**
     * the constructor accepts four parameters and value are
     * assigning respectively,
     */
    public InstrumentToSell(String InstrumentName, float Price)
        {
            super(InstrumentName);
            this.Price = Price;
            this.SellDate = "";
            this.DiscountPercentage = 0;
            this.IsSold = false;
        }
       
        //accessor method
    public float getPrice()
        {
            return this.Price;
        }
    
    public String getSellDate()
        {
            return this.SellDate;
        }
        
    public float getDiscountPercentage()
        {
            return this.DiscountPercentage;
        }
        
    public boolean getIsSold()
        {
            return this.IsSold;
        }
        
        //setter method
    public void setPrice(float Price)
        {
            if(IsSold == false)
                {
                    this.Price = Price;;
                }
            else
                {
                    System.out.println("The Instrument Has Already Been Sold. Therefore Its Price Cannot Be Changed");
                }
        }
    
    public void setSellDate(String SellDate)
        {
            this.SellDate = SellDate;    
        }
        
    public void setDiscountPercentage(float DiscountPercentage)
        {
            this.DiscountPercentage = DiscountPercentage;
        }
    
    public void setIsSold(boolean IsSold)
        {
            this.IsSold = IsSold;
        }
    
        //creating a method to keep track of the details about the person which the instrument is sold to
    public void InstrumentSell(String CustomerName, String CustomerMobileNumber, int CustomerPAN_No, String SellDate, float DiscountPercentage)
        {
            if(IsSold == true)
                {
                    System.out.println("Instrument Has Been Sold Out." +
                                    "\n Customers Details As Listed Below :" +
                                    "\n Customer's Name: " + getCustomerName() +
                                    "\n Customer's Mobile Number: " + getCustomerMobileNumber() +
                                    "\n Customer's PAN Number: " + getCustomerPAN_No() );
                }
            else
                {
                    setCustomerName(CustomerName);
                    setCustomerMobileNumber(CustomerMobileNumber);
                    setCustomerPAN_No(CustomerPAN_No);
                    this.setSellDate(SellDate);
                    this.setDiscountPercentage(DiscountPercentage);
                    setIsSold(true);
                    
                    super.setCustomerName(CustomerName);                    //calling the method from the super/parent class
                    super.setCustomerMobileNumber(CustomerMobileNumber);
                    super.setCustomerPAN_No(CustomerPAN_No);
                    
                    float FinalPrice = this.Price - (getDiscountPercentage() / 100 * this.Price);
                    System.out.println("Final Price For The Instrument Is: " + FinalPrice);
                }
        }
    
    public void display()
        {
            //calling method for signature as display in parent class
            super.display();
            System.out.println(getPrice());
            
            if(IsSold == true)
                {
                    System.out.println("Customers Details Are Listed Below: "+
                                        "\n Customers Name: " + getCustomerName() +
                                        "\n Customers Mobile Number: " + getCustomerMobileNumber() +
                                        "\n Customer PAN Number: " + getCustomerPAN_No() + 
                                        "\n And This Very Instrument Was Sold At " + getSellDate() );
                }
        }
}