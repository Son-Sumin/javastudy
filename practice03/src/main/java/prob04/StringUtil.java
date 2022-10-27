package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
    	//String result = str.toString();
    	String[] result = new String[1];
        for(int i = 0; i < str.length; i++) {
        	String[] r = new String[str.length];
        	r[i] += str[i];
        	System.out.println(r[i]);
        }
        return null;
    }
    

}
