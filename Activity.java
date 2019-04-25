package activity;

import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = "";
        while (command != "X"){
            String answer;
            System.out.print("Welcome! Create new Character? (Type Y/N) ");
            answer = input.nextLine();
            if (answer.equals("Y")){
                System.out.print("Enter name: ");
                answer = input.nextLine();
                String name = answer;
                System.out.print("Enter gender: ");
                answer = input.nextLine();
                String gender = answer;
                System.out.println("Choose character type by typing the number next to your choice.");
                System.out.println("1. Warrior");
                System.out.println("2. Mage");
                System.out.println("3. Minstrel");
                String type = "";
                int power = 0;
                answer = input.nextLine();
                if (answer.equals("1")){
                    type = "Warrior";
                    power = 75;
                }
                else if (answer.equals("2")){
                    type = "Mage";
                    power = 60;
                }
                else if (answer.equals("3")){
                    type = "Minstrel";
                    power = 50;
                }
                else {
                    System.out.println("Invalid command!");
                }
                Character c1 = new Character(name, gender, type, power, 100);
            }
        }
    }
}
