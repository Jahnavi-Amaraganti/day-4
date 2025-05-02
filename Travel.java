public class Travel
{
public String getBookingDetails(String agency, String destination , int travellers){
return "Agency" +agency +"\n Destination:" +destination +"\n Travellers:" +travellers;
}
public static void main (String[] args)
{
	Travel travel = new Travel();
	String result1 =travel.getBookingDetails("Wanderlust travels" , "paris" , 4);
	System.out.println(result1);
	String result2 = travel.getBookingDetails("wanderlust travels" , "Tokyo" , 2);
	System.out.println(result2);
}
}
