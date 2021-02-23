import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingMap {

	public   void GetResult()
		{
			String Input="Fname=IISAC|LName=Newton|Address=UK|Age=20|School=Trinity|Invention=LawsOfMotion";
			Map<String,String>map =new LinkedHashMap<String,String>();
			
			String []split=Input.split("\\|");
			for(String sKey : split)
			{
				String[] Val=sKey.split("=");
				map.put(Val[0],Val[1]);
			}
			Set<Entry<String, String>> Outputset=map.entrySet();
			for(Entry<String,String> output: Outputset)
			{
				System.out.println(output.getKey()+"="+output.getValue());
			}
		}
		
		public static void main(String[] args) 
		{
			UsingMap obj= new UsingMap();
			obj.GetResult();
		}

}
