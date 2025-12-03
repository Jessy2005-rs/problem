import java.util.scanner;
class pattern{
    public static void main(string[]arg){
        scanner kbd =new scanner(system.in);
        int n=kbd.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
         if(row==1||row==n||col==1||col==n)
         system.out.print("*");
         else
         system.out.print(" ");
            system.out.println();
            }
            
        }
        }
    }
    
        

        


