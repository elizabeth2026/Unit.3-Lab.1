import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to the jungle. Your task is to complete the game without losing");
        System.out.println("A monkey is staring at you, suspicious. You must say a word starting with the letter 'r' and ends with 'x', and is a synonym with calm ");
        String relax = scanner.nextLine();
        if (relax.equals("relax")) {
            return "true";
        } else return "false, lose";
    }

        }
    }
