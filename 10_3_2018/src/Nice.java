import java.util.Scanner;

public class Nice {

	public static void main(String[] args) {

		boolean f2,f4;
		int s;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			s=0;
			f2=false;
			f4 = false;
			String str=in.nextLine();
			for(int j = 0;j<str.length();j++) {
				char C = str.charAt(j);
				if(C=='2') {
					if(f2)
						f4=!f4;
					System.out.print(2);
					f2=!f2;
					s+=2;
				}
				else if(f2){
					f4=!f4;
					f2=!f2;
					System.out.print(2);
					s+=2;
					j--;
				}else if(C=='4') {
					f4=!f4;
					System.out.print(4);
					s+=4;
				}else if(f4){
					f4=!f4;
					System.out.print(4);
					s+=4;
					j--;
				}else
					System.out.print(8);
			}
			if(f2){
				f4=!f4;
				f2=!f2;
				System.out.print(2);
				s+=2;
			}
			if(f4){
				f4=!f4;
				System.out.print(4);
				s+=4;
			}
//			if(s%16==8)
//				System.out.print(8);
		}
	}

}
