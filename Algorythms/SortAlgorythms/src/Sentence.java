
public class Sentence {
	private String text;
	
	public Sentence(String aText)
	{
		this.text=aText;
	}
	
	public void reverse()
	{
		int length = text.length();
		String result = " ";
		
		for (int i = length-1; i >= 0; i--) {
			
			result = result + text.charAt(i);
	}
		System.out.println(result);	
	}
	
	
	 public static String recReverse(String str) {
	        int localI = i++;
	        if ((null == str) || (str.length()  <= 1)) {
	            return str;
	        }
	        System.out.println("Step " + localI + ": " + str.substring(1) + " / " + str.charAt(0));
	        String reversed = reverse(str.substring(1)) + str.charAt(0);

	        System.out.println("Step " + localI + " returns: " + reversed);
	        return reversed;
	    }
	
}
