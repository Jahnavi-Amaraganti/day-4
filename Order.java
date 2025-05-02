public class Order{
public String getStringDetails(String restaurantName , String foodItem , int quantity)
	{
	return "Restaurant name:" +restaurantName +"\n Food item:" +foodItem +"\n Quantity:" +quantity;
	}
	public static void main (String[] args)
{
	Order order=new Order();
	String result1 =order.getStringDetails("Spice Garden" , "Paneer butter masala", 2);
	System.out.println(result1);
	String result2 =order.getStringDetails("Spice Garden" , "Chicken Biryani" , 1);
	System.out.println(result2);
}
}