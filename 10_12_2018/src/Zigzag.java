import java.util.ArrayList;
import java.util.Scanner;

public class Zigzag {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < x; i++) {
			a.add(input.nextInt());
		}
int num=0;
int c=1;
int cmax=0;
boolean greater=false;
boolean firstZ = true;
		for(int i=0;i<a.size()-1;i++) {
			num=a.get(i);
			c=1;
			firstZ=true;
			for(int j=i+1;j<a.size();j++) {
				
				
				if(a.get(j)>num) {
				   if(!greater||firstZ) {
					   c++;
					   greater=true;
					   num=a.get(j);
					   firstZ=false;
				   }
				}
				if(a.get(j)<num) {
					if(greater||firstZ) {
						c++;
						greater=false;
						num=a.get(j);
						firstZ=false;
					}
				}
				System.out.println(c);
			}
			
			
			cmax = cmax > c ? cmax : c;
				
		}
		System.out.println(cmax);		
	}

}
