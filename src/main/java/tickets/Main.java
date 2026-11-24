package tickets;

public class Main
{
    public static void main(String[] args)
    {

        Tickets standard = new Tickets("Summer concert", "Alice", 50);
        StudentTicket student = new StudentTicket(standard, "Bob","123456");
        VIPTicket vip = new VIPTicket(standard, "Charlie");
        EarlyBirdTicket bird = new EarlyBirdTicket(standard, "Megan");

        System.out.println(standard);
        System.out.println(student);
        System.out.println(vip);
        System.out.println(bird);
    }
}
