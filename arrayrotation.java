import java.util.Arrays;
 import java.util.Scanner;
 
 public class arrayrotation{
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        int size=scr.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
        arr[i]=scr.nextInt();
        }
        int left=scr.nextInt();
        for(int j=1;j<=left;j++){
            int temp=arr[0];
            for(int i=0;i<size-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[size-1]=temp;
        }
        System.out.print(Arrays.toString(arr));
    
 }}
 