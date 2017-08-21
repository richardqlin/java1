import java.util.*;

public class Solution_anagram{

	static boolean isAnagram(String a, String b){
		boolean check=false;
		if (a.length()==b.length()){
			a=a.toLowerCase();
			b=b.toLowerCase();
			char [] achar=a.toCharArray();
			char [] bchar=b.toCharArray();
			Arrays.sort(achar);
			Arrays.sort(bchar);
			check= Arrays.equals(achar,bchar);
		}
		return check;

		}

		public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}