public class Patient
{
	public void printDetails(String hospitalName , String patientName , int age)
	{
	System.out.println("Hospital Name:" +hospitalName +"\n Patient Name:" +patientName + "\n Patient Age:" +age);
	}
		public static void main (String[] args)
		{
		Patient patient=new Patient();
		patient.printDetails("city care hospital", "Jhon Doe" , 45);
		patient.printDetails("city care hospital" , "Emma Whatson", 30);
		}
}

