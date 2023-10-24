import java.util.Scanner;

public class AdventureGame {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a dark room. There are doors to your left and right. Which one do you choose (left/right)?");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "left":
                leftDoorPath();
                break;
            case "right":
                rightDoorPath();
                break;
            default:
                System.out.println("Invalid input! The game is over.");
                break;
        }
    }

    private void leftDoorPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You see a treasure chest. Do you open it (yes/no)?");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "yes":
                System.out.println("You found a gold coin! You win!");
                break;
            case "no":
                System.out.println("You leave the treasure chest alone and walk away. You live to see another adventure. Game Over.");
                break;
            default:
                System.out.println("Invalid input! The game is over.");
                break;
        }
    }

    private void rightDoorPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You see a sleeping dragon. Do you try to sneak past it? (yes/no)");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "yes":
                System.out.println("You successfully sneak past the dragon. You find a door leading outside. You escape! You Win!");
                break;
            case "no":
                System.out.println("The dragon wakes up and sees you. Game over!");
                break;
            default:
                System.out.println("Invalid input! The game is over.");
                break;
        }
    }

    public static void main(String[] args) {
        new AdventureGame().startGame();
    }
}
