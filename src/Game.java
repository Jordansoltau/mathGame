import java.util.Scanner;

public class Game {

    private Addition addition;

    public Game() {

        this.addition = new Addition();
    }

    public void start(){
        Scanner answer = new Scanner(System.in);
        int numberOfTimes=0;

        while (numberOfTimes<5) {
            addition.printAddition();
            int giveanswer = answer.nextInt();
            addition.giveAnswer(giveanswer);
            numberOfTimes++;
            if (numberOfTimes==5){
                System.out.println("YOU WON!");
            }
        }

    }
}
