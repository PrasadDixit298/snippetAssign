
public class FirstAssignment {
	static String Input ="FName=Isaac|LName=Newton|Address=UK|Age=20|School=Trinity|Invention=LawsOfMotion";
	String Result = " ";
	public void Spliting() {
		char[] ch = new char[Input.length()];
		Result = " ";
		for (int i = 0; i < Input.length(); i++)
		{ 
            ch[i] = Input.charAt(i); 
        }
		for(int i=0; i< Input.length(); i++){
			if(ch[i]!='|') {
				Result=Result+ch[i];
			}
			else {
				System.out.println(Result);
				Result= " ";
			}
	
		}
		
	}
	public static void main(String[] args)  {
		FirstAssignment fis = new FirstAssignment();
		fis.Spliting();
		
	}

}
