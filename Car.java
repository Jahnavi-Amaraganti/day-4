public class Car{
	public void displayDetails( String showroomName , String modelName , int price)
{
	System.out.println("Showroom Name:" +showroomName);
	System.out.println("Car Model:" +modelName);
	System.out.println("Car price:" +price);
}
		public static void main (String[] args){
		Car car= new Car();
		car.displayDetails("Elite Motors", "Tesla Model S", 80000);
		car.displayDetails("Grand Palace" , "Maria" , 75000);
}
}

