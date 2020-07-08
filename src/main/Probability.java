package main;

public class Probability {
    double value;

    public Probability(double value) {
        this.value = value;
    }

    public boolean compare(Probability probability1){
        return this.value == probability1.value;
    }
}
