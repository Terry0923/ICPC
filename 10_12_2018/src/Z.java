import java.util.ArrayList;
import java.util.Scanner;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < x; i++) {
			a.add(input.nextInt());
		}
	int turn = 0;
	int c=1;
	for(int i=0;i<a.size()-1;i++) {
		if(a.get(i)<a.get(i+1)) {
			//getting more
			if(turn==-1||turn==0) {
				c++;
				turn=1;
			}
		}
		if(a.get(i)>a.get(i+1)) {
			//getting less
			if(turn==1||turn==0) {
				c++;
				turn=-1;
			}
		}
	}
	System.out.println(c);
	}

}
