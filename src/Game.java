import java.util.Scanner;

public class Game {

    private Addition addition;

    public Game() {

        this.addition = new Addition();
    }

    public void start(int NumberOfExercices){
        Scanner answer = new Scanner(System.in);
        int numberOfTimes=addition.getLevel();
        int maxLevel=NumberOfExercices;
        while (numberOfTimes<maxLevel) {
            addition.printAddition();
            int giveanswer = answer.nextInt();
           //juiste antwoord checken. Momenteel word number of times opgeteld
            addition.giveAnswer(giveanswer);
            numberOfTimes++;
            if (numberOfTimes==maxLevel){
                System.out.println("YOU WON!");
            }
        }

    }
}
