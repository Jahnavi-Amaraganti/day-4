public class Ticket 
{
public String getTicketInfo( String theaterName , String movieName , String seatNo)
{
return "Teatre name:" +theaterName +"\n Movie Name:" +movieName +"\n Seat No:" +seatNo;
}
	public static void main (String[] args)
	{
	Ticket ticket=new Ticket();
	String result1=ticket.getTicketInfo("Galaxy Cinemas" , "Intersteller" , "A10");
	System.out.println(result1);
	String result2=ticket.getTicketInfo("Galaxy Cinemas" , "intersent" , "B12");
	System.out.println(result2);
	}
} 