import java.util.Scanner;

public class Game {

    private Addition addition;

    public Game() {

        this.addition = new Addition();
    }

    public void start(int NumberOfExercices) {
        Scanner answer = new Scanner(System.in);
        int currentLevel = addition.getLevel();
        int maxLevel = NumberOfExercices;
        while (currentLevel < maxLevel) {
            addition.printAddition();
            int giveanswer = answer.nextInt();
            addition.giveAnswer(giveanswer);
            currentLevel = addition.getLevel();
            if (currentLevel == maxLevel) {
                System.out.println("YOU WON!");
            }
        }

    }
}
