import java.util.Scanner;

public class Base {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int a = in.nextInt();
		int b = in.nextInt();

		
		for(int h = 0;h<10000;h++) {
		n=(int)(Math.random()*Math.pow(10, 16)+1);
		a=(int)(Math.random()*35)+2;
		b=(int)(Math.random()*35)+2;
		System.out.println(n+"\t"+a+"\t"+b);
		for(;;) {
			n++;
			if(sum(n,a)==sum(n,b)) {
				System.out.println(n);
				break;
			}
		}
		}
	}
	public static int sum(long n, int b) {
		int s = 0;
		while(n>0) {
			s+=n%b;
			n/=b;
		}
		return s;
	}

}
