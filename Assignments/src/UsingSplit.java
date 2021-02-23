
public class UsingSplit {
  String Input ="FName=Isaac|LName=Newton|Address=UK|Age=20|School=Trinity|Invention=LawsOfMotion";
  public void Output() {
	  String[] result = Input.split("\\|");
	  for(String s : result)
	  {
      System.out.println(s);
	  }
  }
  public static void main(String[] args) {
		  UsingSplit obj = new UsingSplit();
		  System.out.println("Output : ");
		  obj.Output();
		  System.out.println("And so on ......");
		  }
}
