import java.util.*;
import java.awt.Point;
public class GalacticWarlords {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int N = in.nextInt();
        ArrayList <Double> x = new ArrayList <Double>();
        ArrayList <Double> y = new ArrayList <Double>();
        for(int i = 0; i<N;i++){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            double m,b;
            if(x1!=x2){
                m=(y2-y1)/(x2-x1);
                b=-m*x1+y1;
            }else{
                m=Integer.MAX_VALUE;
                b=x1;
            }
            for(int j = 0;j<x.size();j++){
                if(!(x.get(j)==m&&y.get(j)==b)){
                   x.add(m);
                   y.add(b);
                }

            }
        }
        double M=x.get(0);
        boolean flag = false;
        for(int i = 0;i<x.size();i++){
            if(M!=x.get(i))
                flag=true;
        }
        if(!flag){
            if(1+x.size()>=W)
                System.out.println(0);
            else
                System.out.println((W+1)/2-x.size());

        }
        else{
            if(2*x.size()>=W)
                System.out.println(0);
            else
                System.out.println((W+1)/2-x.size());
        }
    }

}
