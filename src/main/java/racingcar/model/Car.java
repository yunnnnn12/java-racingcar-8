package racingcar.model;

public class Car {

    private String name;
    private int moveCount;

    public Car(String name, int count) {
        this.name = name;
        this.moveCount = count;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move() {
        this.moveCount++;
    }
}
