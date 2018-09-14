package com.hades.typeview.model;

public class Passcode {

    public int firstNumber = -1;
    public int secondNumber = -1;
    public int thirdNumber = -1;
    public int fourthNumber = -1;
    public boolean isActive;

    public Passcode() {
    }

    public Passcode(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public void setFourthNumber(int fourthNumber) {
        this.fourthNumber = fourthNumber;
    }

    public int getCode() {
        return firstNumber * 1000 + secondNumber * 100 + thirdNumber * 10 + fourthNumber;
    }

    public boolean isActive() {
        return firstNumber != -1 && secondNumber != -1 || thirdNumber != -1 || fourthNumber != -1;
    }
}
