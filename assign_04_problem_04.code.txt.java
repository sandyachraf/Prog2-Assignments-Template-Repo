//sandy achraf
//20216500

import java.util.Arrays;
import java.util.*;
public class first {
	public static void main(String[] args)
	{
		System.out.println("choose the size of array :");
        Scanner sc=new Scanner(System.in);
        int length , searching;
        length=sc.nextInt();    
        int [] arr = new int[length];   
        System.out.println("insert numbers in the array :"); 
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();    
        }
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
