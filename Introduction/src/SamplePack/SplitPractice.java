package SamplePack;

public class SplitPractice {

	public static void main(String[] args) {
		
		 /*String s = "My Name is Renu";
		
		String[] a = s.split(" "); 
		
		System.out.println(a[3]);
		*/
		
		String s = "Renu";
		
		char[] ch = s.toCharArray();
		
		String rev = " ";
		
		for(int i = ch.length-1; i>=0; i--) {
			
			rev = rev + ch[i];
			
			System.out.println(rev);
		}
		
	}
}