package javasessions;

public class funtionsexam {

	public int studentMarks(String studentName)
	{
		System.out.println("studentName:  "+studentName);
		if(studentName.equalsIgnoreCase("devika"))
		{
			return 90;
		}
		else if(studentName.equalsIgnoreCase("khaja"))
		{
			return 99;
	
		}
		else
		{
			System.out.println("Student Name not found" + studentName);
		return -1;
		}
	}
	
	public int studentMarkList(String StudentName)
	{
	
		switch (StudentName) {
		case "shajreen": 
			return 99;
			
		case "khaja": 
			return 89;
			
		case "shaz": 
			return 59;	
			
		default:
			System.out.println("Pass correct name"  +StudentName);
			return -1;
			
		}
	}	
		public boolean studentMarkL(String StudentName)
		{
		
			switch (StudentName) {
			case "shajreen": 
				return true;
				
			case "khaja": 
				return true;
				
			case "shaz": 
				return true;	
				
			default:
				System.out.println("Pass correct name:  "  +StudentName);
				return false;
				
			}
		
	}
		
	
	public static void main(String[] args) {
		
		funtionsexam fe=new funtionsexam();
		int m1=fe.studentMarks("DevikA  ".toLowerCase().trim());
		System.out.println(m1);
		
		int m2=fe.studentMarkList("KhAja".toLowerCase().trim());
		System.out.println(m2);
		
		boolean m3=fe.studentMarkL("ShAzasad".toLowerCase().trim());
		System.out.println(m3);

	}

    }





