public class Mobile
{
	public void showDetails(String storeName , String brand , int price)
	{
	System.out.println("Store Name:" +storeName + "\n Brand:" +brand +"\n Price:" +price);
	}
		public static void main(String[] args)
		{
		Mobile mobile = new Mobile();
		mobile.showDetails("Tech World" ,"Apple", 20000);
		mobile.showDetails("Tech WOrld", "samsung", 30000);
		}
} 