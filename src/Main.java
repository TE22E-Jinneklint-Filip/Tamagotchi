import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action;
        String giveName;
        Tamagotchi tamagotchi = new Tamagotchi();

        System.out.println("Ge tamagotchin ett namn: ");
        giveName = scanner.nextLine();
        tamagotchi.name = giveName;

        while (tamagotchi.getAlive()) {

            System.out.println("FEED: 1");
            System.out.println("LEARN: 2");
            System.out.println("HI: 3");
            System.out.println("Quit: 4");
            System.out.println("Choose 1-4: ");
            action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "1":
                    tamagotchi.feed(10);
                    break;
                case "2":
                    System.out.print("Vad ska Tamagotchin lära sig? ");
                    String word = scanner.nextLine();
                    tamagotchi.teach(word);
                    break;
                case "3":
                    tamagotchi.hi();
                    break;
                case "4":
                    System.out.println("Spelet avslutas.");
                    return;
                default:
                    System.out.println("Ogiltig åtgärd.");
                    return;
            }
            System.out.println();
            tamagotchi.tick();
            System.out.println();
            tamagotchi.printStats();
        }

        System.out.println("Tamagotchin har dött.");
    }
}