public class Enrollment{
	public String getEnrollmentInfo(String platform , String course, String student){
	return "Platform:" +platform +"\n Course:" +course +"\n Student:" +student;
}
		public static void main (String[] args)
		{
		Enrollment enrollment=new Enrollment();
		String result1=enrollment.getEnrollmentInfo("udemy" ,"Java developer" ,"Alice");
		System.out.println(result1);
		String result2=enrollment.getEnrollmentInfo("udemy" , "Web developer" , "Bob");
		System.out.println(result2);
		}
}