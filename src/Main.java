import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int choice = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
	    Player playerOne = new Player(name);
        System.out.println("Welcome " + name + ", to progress fight to gain xp as well as heal up");
        while(choice >= 1 && choice <= 4) {
            System.out.println("-------------------");
            System.out.println("Press: ");
            System.out.println("1 to battle");
            System.out.println("2 to buy healing items");
            System.out.println("3 to heal");
            System.out.println("4 to display stats");
            System.out.println("0 to end the game");
            System.out.println("-------------------");
            choice = scanner.nextInt();
            if(choice == 1) {
                playerOne.battle();
                if(playerOne.getHealth() <= 0) {
                    break;
                }
            } else if(choice == 2) {
                playerOne.buyItem();
            } else if(choice == 3) {
                playerOne.heal();
            } else if(choice == 4) {
                playerOne.stats();
            }
        }
        System.out.println("THANK YOU SO MUCH FOR PLAYING MY GAME!");

    }


}
