package models;
public class Computations {
    float num1,num2;

    public Computations(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getSum() {
        return num1 + num2;
    }

    public float getDivide() {
        return num1 / num2;
    }

    public float getMultiply() {
        return num1 * num2;
    }

    public float getSubtract() {
        return num1 - num2;
    }
}