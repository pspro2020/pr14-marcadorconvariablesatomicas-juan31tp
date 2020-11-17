package dice;

import java.util.concurrent.atomic.AtomicLong;

public class Tracker {

    private AtomicLong resultOne = new AtomicLong();
    private AtomicLong resultTwo = new AtomicLong();
    private AtomicLong resultThree = new AtomicLong();
    private AtomicLong resultFour = new AtomicLong();
    private AtomicLong resultFive = new AtomicLong();
    private AtomicLong resultSix = new AtomicLong();

    public void update(int throwResult) {
        switch (throwResult){
            case 1:
                resultOne.addAndGet(1);
                break;
            case 2:
                resultTwo.addAndGet(1);
                break;
            case 3:
                resultThree.addAndGet(1);
                break;
            case 4:
                resultFour.addAndGet(1);
                break;
            case 5:
                resultFive.addAndGet(1);
                break;
            case 6:
                resultSix.addAndGet(1);
                break;
        }
    }

    public void showScore() {
        System.out.println( "Total times of face 1: " + getResultOne() + "\n" +
                "Total times of face 2: " + getResultTwo() + "\n" +
                "Total times of face 3: " + getResultThree() + " times\n" +
                "Total times of face 4: " + getResultFour() + " times\n" +
                "Total times of face 5: " + getResultFive() + " times\n" +
                "Total times of face 6: " + getResultSix() + " times\n\n");
    }

    public int getResultOne() {
        return resultOne.intValue();
    }

    public int getResultTwo() {
        return resultTwo.intValue();
    }

    public int getResultThree() {
        return resultThree.intValue();
    }

    public int getResultFour() {
        return resultFour.intValue();
    }

    public int getResultFive() {
        return resultFive.intValue();
    }

    public int getResultSix() {
        return resultSix.intValue();
    }
}
