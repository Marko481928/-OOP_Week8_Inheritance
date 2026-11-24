package tickets;

public class EarlyBirdTicket extends Tickets
{
    public EarlyBirdTicket(Tickets base, String holderName)
    {
        super(base.getEventName(), holderName, base.getBasePrice());
    }

    @Override
    public double calculatePrice()
    {
        int discount = 10;
        double price = getBasePrice();
        if(price < 10)
        {
            return price;
        }
        else
        {
            return price - discount;
        }
    }

    @Override
    public String toString()
    {
        return "Early bird ticket - " + getHolderName() + ":\t" + calculatePrice();
    }
}
