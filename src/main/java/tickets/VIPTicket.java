package tickets;

public class VIPTicket extends Tickets
{
    public VIPTicket(Tickets base, String holderName)
    {
        super(base.getEventName(), holderName, base.getBasePrice());
    }

    @Override
    public double calculatePrice()
    {
        return getBasePrice() + 25;
    }

    public String getBenefits()
    {
        return "Benefits: Priority entry and reserved seating";
    }

    @Override
    public String toString()
    {
        return "VIP ticket - " + getHolderName() + ":\t" + calculatePrice() + "\n" + getBenefits();
    }
}
