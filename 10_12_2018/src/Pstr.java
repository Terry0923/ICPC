import java.util.Scanner;

public class Pstr {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(thing(str));
		
	}
	public static int thing(String s) {
		int l = s.length();
		for(int i = 1;i<=l/2;i++) {
			if(l%i==0) {
				boolean flag = true;
				for(int j = 0;j<l-i;j+=i) {
					
					String s1 = s.substring(j, j+i);
					String s2 = s.substring(j+i+1,j+2*i)+s.substring(j+i,j+i+1);
					System.out.println(s1+" "+s2+" "+j);
					if(!(s1.equals(s2))) {
						
						flag = false;
					}
					
				}
				if(flag)
				return i;
			}
		}
		
		
		
		
		return l;
	}

}
