import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tamagotchi {
    public String name = "";
    private int hunger = 0;
    private int boredom = 0;
    private boolean isAlive = true;
    private List<String> words = new ArrayList<>();

    public void feed(int hunger) {
        this.hunger++;
    }

    private void reduceBoredom(int boredom) {
        this.boredom++;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void teach(String word) {
        words.add(word);
        reduceBoredom(boredom);
    }

    public void hi() {
        if (!words.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(words.size());
            String randomWord = words.get(randomIndex);
            System.out.println(randomWord);
            reduceBoredom(boredom);
        } else {
            System.out.println("Tamagotchin have yet to learn this word.");
        }
    }

    public void tick() {
        hunger++;
        boredom++;

        if (hunger == 10 || boredom == 10) {
            isAlive = false;
        }
    }

    public void printStats() {
        System.out.println("isAlive: " + isAlive);
        System.out.println("hunger: " + hunger);
        System.out.println("boredom: " + boredom);
    }
}