import java.util.*;

public class bool {
    public static void main(String[] args) {
        
        //Assuming you are riding a Bike and police officer Stops you
        //Police officer asking you to provide 2 details 
        //Your current speed
        //if it is Birthday Today ?

        //Police officer will collect fine based on following parameters

        Scanner sc = new Scanner(System.in);
        System.out.println("Enterv speed : ");
        int speed = sc.nextInt();

        System.out.println("Today is your birthday :");
        boolean isBirthday = sc.nextBoolean();

        if(isBirthday==true){
            speed-=5;
        }

        if(speed>80){
            System.out.println("High Ticket");
         } else if(speed>=0){
                System.out.println("Mid Ticket");
            }
            else{
                System.out.println("No ticker");
            }
        }
    }
    

