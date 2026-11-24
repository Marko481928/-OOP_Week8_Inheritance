package tickets;

public class StudentTicket extends Tickets
{
    private String studentID;


    public StudentTicket(Tickets base, String holderName,String studentID)
    {
        super(base.getEventName(), holderName, base.getBasePrice());
        this.studentID = studentID;
    }

    public String getStudentID()
    {
        return "Student ID: " + studentID;
    }

    @Override
    public double calculatePrice()
    {
        double price = getBasePrice();
        return price - ((0.2 * price));
    }

    @Override
    public String toString()
    {
        return "Student ticket - " + getHolderName() + ":\t" + calculatePrice() + "\n" + getStudentID();
    }
}
