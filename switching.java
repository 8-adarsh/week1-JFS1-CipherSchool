import java.util.Scanner;

public class switching{
    public static void main(String[] args) {
        
        //Get user Divison and Print his Rank

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Divison");
        int div = sc.nextInt();
        switch(div){
            case 1 : System.out.println("First Rank");
                     break;

             case 2: System.out.println("Second Rank");
             break;
             
             case 3 : System.out.println("Third Rank");
             break;

             default : System.out.println("No rank");
             break;
        } 
    }
}
