import java.util.*;

public class WildHacks{

	public static void main(String[]args){
	
	Scanner s = new Scanner(System.in);		
	String word = s.nextLine();
	
	String key =  System.getenv("dict_api_key");
	String url = "http://www.dictionaryapi.com/api/v1/references/collegiate/xml/" + word + "?key=" + key;
	System.out.println(url);
	//String charset = "UTF-8";
	//String param1 = "value1";
	}
}

