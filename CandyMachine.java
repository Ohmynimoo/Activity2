import java.util.Scanner;
public class CandyMachine {
    public static void main(String[] args) {
        int Food = runMenu();
        int Price = retrievePrice(Food);
        int change = moneyInserted(Price);
    }
    
    public static int runMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0 ;
        System.out.println("\n\nPlease enter your selection:"
                    + "\n1: Candy \t 5 pesos"
                    + "\n2: Chips \t 15 pesos"
                    + "\n3: Gum   \t 10 pesos"
                    + "\n4: Cookies \t 30 pesos"
                    + "\n5: Exit ");
        choice = keyboard.nextInt();
        return choice;        
    }
    
    public static int retrievePrice(int menuChoice){
        if (menuChoice == 1)
            return 5;
        if (menuChoice == 2)
            return 15;
        if (menuChoice == 3)
            return 10;
        if (menuChoice == 4)
            return 30;
        else return 0;
    }
    
    public static int moneyInserted(int Price){
        Scanner keyboard = new Scanner(System.in);
        int money = 0;
        System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
        money = keyboard.nextInt();
        while (money < Price){
            System.out.println("Please insert sufficient funds");
            money = money + keyboard.nextInt();
        }
        return money - Price ;
        }
    }
