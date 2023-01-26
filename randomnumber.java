import java.util.*;

public class randomnumber {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    int compChoice = rnd.nextInt(20);
    
    
    //Guess the number 
    for(int i=1;i<=5;i++){
   System.out.println("Guess a number between 0 an 20");
   int userChoice = sc.nextInt();
   System.out.println("Computer choice : "+compChoice);

   if(userChoice>compChoice){
    System.out.println("Your guess is too high");
   }

   else if(userChoice==compChoice){
    System.out.println("Your guess is correct");
    break;
   }
   else{
    System.out.println("Your guess is too low");
   }
}
  }  
}
