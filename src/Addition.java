import java.util.Random;

public class Addition {
    private int leftOperand;
    private int rightOperand;
    private int anser;
    private int level;
    public Addition() {
        createNewAddition();
    this.level=0;
    }

    public void printAddition(){
        System.out.println(leftOperand + " + " + rightOperand);
    }

    public void giveAnswer(int answer){
        if(this.anser!=answer){
            System.out.println("Bad anwer. Try again");
        }
        else {
            System.out.println("Good answer. ");
            createNewAddition();

        }
    }


    private void createNewAddition(){
        Random number = new Random();
        int upperBound =10;
        this.leftOperand= number.nextInt(upperBound);
        this.rightOperand= number.nextInt(upperBound);
        this.anser=leftOperand+rightOperand;
    }



}
