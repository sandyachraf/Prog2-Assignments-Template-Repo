//sandy achraf
//20216500

import java.util.*;
public class first{
	public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x,y,sum=0;
        x = sc.nextInt();//10
        y = sc.nextInt();//6
        if(x > y){
            for(int i=y+1 ; y<i && i<x ; i++){     
                if(i%2 != 0){//odd
                    System.out.print(i + " + ");
                    sum = sum + i;
                }
            }
        }else{
            for(int i=x+1 ; x<i && i<y ; i++){     
                if(i%2 != 0){//odd
                    System.out.print(i + " + ");
                    sum = sum + i;
                }
            }
        }System.out.print("\n"+sum);
    }
}
