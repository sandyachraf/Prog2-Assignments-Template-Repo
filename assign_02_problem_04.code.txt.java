//sandy achraf
//20216500

import java.util.*;
public class first{
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int i=0;
        int x = sc.nextInt();
        for(int f=x ; f >=1 ; f--){
                while(i<f){
                System.out.print("*");
                    i++;
            }
            i=0;
            System.out.print("\n");
        }
        
    }
}