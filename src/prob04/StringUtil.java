package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String val = "";
		
		for (String string : strArr) {
			val += string;
		}
		
		return val;
	}
}
