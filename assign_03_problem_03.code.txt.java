//sandy achraf
//20216500

import java.util.*;
public class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int counter=1,c=1,y,x = sc.nextInt();
        y=x*4;
    for(int i=0 ; i<x ;i++){
        while(c<=y){
            if(counter<4){
                System.out.print(" "+c);
                c++;
                
            }else if(counter==4){
                System.out.println(" PUM ");
            }else{
                c=c+1;
                counter =1;
                break;
            }counter++;
        }
    }
    }
}
