import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

int r = scan.nextInt();
int c = scan.nextInt();
int count=0;
char [][] arr = new char [r][c];
scan.nextLine();
for(int i=0;i<r;i++) {
	
	String s = scan.nextLine();

	for(int j=0;j<c;j++) {
		
		arr[i][j]= s.charAt(j) ;
	
	}

}


for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		if(arr[i][j]=='L') {
			count++;
			int a=i;
			int b=j;
			arr[i][j]='W';
			
			
			while(!AllWater(arr,a,b,r,c)) {
				
				
					if(a-1>=0&&arr[a-1][b]!='W') {
						
							arr[a-1][b]='W';
							a--;
						}
						else if(a+1<r&&arr[a+1][b]!='W') {
						
							arr[a+1][b]='W';
							a++;
						}
						else if(b+1<c&&arr[a][b+1]!='W') {
						
							arr[a][b+1]='W';
							b++;
						}
						else if(b-1>=0&&arr[a][b-1]!='W') {
					
							arr[a][b-1]='W';
							b--;
						}
					
						
					//print(arr,r,c);
						
			}
		}
	}
}
//DONE

System.out.println(count);


	}
	private static boolean AllWater(char [][] arr,int a,int b,int r, int c) {
		boolean allWater=true;
		if(a-1>=0)
			{if(arr[a-1][b]!='W') allWater=false;}
		if(a+1<r)
			{if(arr[a+1][b]!='W') allWater=false;}
		if(b+1<c)
			{if(arr[a][b+1]!='W') allWater=false;}
		if(b-1>=0)
			{if(arr[a][b-1]!='W') allWater=false;}
		
		return allWater;
	}
	private static void print(char[][] arr,int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		
	}

}
