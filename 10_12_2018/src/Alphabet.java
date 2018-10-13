import java.util.ArrayList;
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char a = 'a';
		String s = in.next();
		int min = 26;
		int temp = 0;
		ArrayList<Character> arr = new ArrayList<>();
		int [] ints =  new int [s.length()];
		char [] chars = s.toCharArray();
		for(int i = 0;i<s.length();i++) {
			for(int j = i+1;j<s.length();j++) {
				if(chars[j]>chars[i])
					ints[i]++;
				
			}
		}
		System.out.println(26 - check(chars));
	}
	
	public static int check(char[]a) {
		if(a.length==0)
			return 0;
		int []b=new int[a.length];
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[j]>a[i])
					b[i]++;
				
			}
		}
		int max = Integer.MIN_VALUE;
		int in=0;
		for (int i = 0;i<a.length;i++) {
			if(b[i]>max) {
				in=i;
				max=b[i];
			}
		}
		char [] A = new char[max];
		int [] B = new int [max];
		int ci = 0;
		for(int i =in+1;i<a.length;i++) {
			if(a[i]>a[in]) {
				A[ci]=a[i];
				B[ci]=b[i];
				ci++;
			}
		}
		
		
		return 1+check(A);
		
	}

}
