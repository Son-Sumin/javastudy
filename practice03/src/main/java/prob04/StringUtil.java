package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
    	
    	String[] result = new String[str.length];
        for(int i = 0; i < str.length; i++) {
        	result[str.length-1] += str[i];
        	//System.out.print(result[str.length-1]);
        }
        return result[str.length-1];
    }
    

}
