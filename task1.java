package javapract;


public class Main {
	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	public static Boolean pol(String string) {
		if(string.equals(reverse(string))) {
			System.out.println("da");
			return true;
		}
		else {
			System.out.println("net");
			return false;
		}
	}
	
	public static void main(String[] args) {
		int x = 121;
		int x2 = -121;
		String str = Integer.toString(x);
		String str2 = Integer.toString(x2);
		pol(str);
		pol(str2);
	}
}
