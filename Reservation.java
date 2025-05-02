public class Reservation{
public String getReservationDetails(String hotelName , String guestName , int nights){
return "Hotel Name:" +hotelName +"\n GuestName:" +guestName + "\n Nights:"+nights;
}
public static void main (String[] args)
	{
	Reservation reservation=new Reservation();
 	String result1=reservation.getReservationDetails("Grand palace" , "David" , 3);
	System.out.println(result1);
	String result2=reservation.getReservationDetails("Grand palace" , "maria" , 2);
	System.out.println(result2);
	}
}