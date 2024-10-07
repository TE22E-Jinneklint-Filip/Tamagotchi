import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action;
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.name = "Pou";
        while (tamagotchi.getAlive()) {
            tamagotchi.tick();
            tamagotchi.printStats();

            System.out.println("Vad vill du göra? (mata, lär, lek eller avsluta)");
            action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "mata":
                    tamagotchi.feed(10);
                    break;
                case "lär":
                    System.out.print("Vad ska Tamagotchin lära sig? ");
                    String word = scanner.nextLine();
                    tamagotchi.teach(word);
                    break;
                case "lek":
                    tamagotchi.hi();
                    break;
                case "avsluta":
                    System.out.println("Spelet avslutas.");
                    return;
                default:
                    System.out.println("Ogiltig åtgärd.");
            }
        }

        System.out.println("Tamagotchin har dött.");
    }
}