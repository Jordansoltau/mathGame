import java.util.Random;

public class Addition {
    private int leftOperand;
    private int rightOperand;
    private int anser;
    private int level;
    private int limitOperand;

    public Addition() {

        this.level = 1;
        this.limitOperand = 10;
        createNewAddition();
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public int getAnser() {
        return anser;
    }

    public int getLevel() {
        return level;
    }

    public void printAddition() {
        System.out.println(leftOperand + " + " + rightOperand);
    }

    public void giveAnswer(int answer) {
        if (this.anser != answer) {
            System.out.println("Bad anwer. Try again");
        } else {
            System.out.println("Good answer. ");
            createNewAddition();
            level++;
            if (level%5==0){
                makeLimitOperandHigherByFive();
            }
        }
    }


    private void createNewAddition() {
        Random number = new Random();
        int upperBound = limitOperand;
        this.leftOperand = number.nextInt(upperBound);
        this.rightOperand = number.nextInt(upperBound);
        this.anser = leftOperand + rightOperand;
    }

    private void makeLimitOperandHigherByFive() {
        limitOperand += 5;
    }

}
