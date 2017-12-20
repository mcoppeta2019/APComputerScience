import java.util.Arrays;

public class StringPractice2 {

	public static void main(String[] args){
		System.out.println(areAnagrams("abcdd", "bccda"));
		System.out.println(areAnagrams("earth", "heart"));
		System.out.println(areAnagrams("help", "hello"));
		System.out.println(areAnagrams("no", "thank you"));
		
		System.out.println("\n---\n");
		
		System.out.println(areAnagramsNoArrays("abcdd", "bcada"));
		System.out.println(areAnagramsNoArrays("earth", "heart"));
		System.out.println(areAnagramsNoArrays("help", "hello"));
		System.out.println(areAnagramsNoArrays("no", "thank you"));
	}
	
	public static boolean areAnagramsNoArrays(String a, String b){
		int pos;
		
		if (a.length() != b.length()){
			return false;
		}
		
		for(int i = 0; i<a.length(); i++){
			pos = b.indexOf(a.charAt(i));
			
			if (pos >= 0){
				if(pos == b.length() - 1){
					b = b.substring(0, pos);
				} else {
					b = b.substring(0, pos) + 
							b.substring(pos+1);
				}
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean areAnagrams(String a, String b){
		int aLen = a.length();
		int bLen = b.length();
		String[] str1 = new String[a.length()];
		String[] str2 = new String[b.length()];
		
		for(int i = 0; i<aLen; i++){
			str1[i] = a.substring(0,1).toLowerCase();
			a = a.substring(1);
		}
		for(int i = 0; i<bLen; i++){
			str2[i] = b.substring(0,1).toLowerCase();
			b = b.substring(1);
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		return Arrays.equals(str1, str2);
	}
}
