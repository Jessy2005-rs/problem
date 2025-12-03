import java.util.scanner;
public class search{

public static void main(String[] args){
    Scanner Scr=new Scanner(System.in);
    int size=kbd.nextInt();
        int arr[]=new int[size];
        int i;
        boolean found =false;
        for(i=0;i<size;i++)
        arr[i]=kbd.nextInt();
        int searchele=kbd.nextInt();
        {
            if(searchele==arr[i])
            {
                found=true;
                break;
                if(found)
                System.out.print(i);
                else
                System.out.print("-1");
            }
        }
}
}