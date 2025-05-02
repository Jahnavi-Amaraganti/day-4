public class Faculty
{
	public class showFacultyDetails(String universityName , String facultyName , String departmentName){
	System.out.println("University Name:" + universityName +"\n Faculty Name:" + facultyName + "\n department Name:" +departmentName);
}
		public static void main (String[] args)
		{
		 Faculty faculty=new Faculty();
		faculty.showFacultyDetails("Standford University" , "Dr. Robert Brown" , "Computer science");
		faculty.showFacultyDetails("Standford University" , "Dr. Lisa Green" , "Physics");
		}
}