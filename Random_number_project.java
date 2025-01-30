import java.util.*;

public class Random_number_project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int MYNUMBER=(int)(Math.random()*100);
        int input = 0;  
        do{
            System.out.println("GUESS MY NUMBER");
            input = sc.nextInt();

            if(input == MYNUMBER){
            System.out.println("Whoo hooo ... CORRECT CHOICE");
            break;
            }
            else if(input > MYNUMBER){
            System.out.println("Number is Large"+"\nTry Small Number");
            }
            else {
                System.out.println("Number is too Small"+"\n Try Large Number");
            }
            
        }
        while(input >= 0);
            System.out.println("My Number was"+"\n" + MYNUMBER);
    }
}
