package com.hades.typeview.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.hades.typeview.BR;

/**
 * Observable provide way to automatic sync the UI data without explicitly calling setter methods.
 * The UI will be updated when the value of property changes in an object.
 */
public class Passcode extends BaseObservable {

    public int firstNumber;
    public int secondNumber;
    public int thirdNumber;
    public int fourthNumber;
    public boolean isActive;

    public Passcode() {
        firstNumber = -1;
        secondNumber = -1;
        thirdNumber = -1;
        fourthNumber = -1;
    }

    public Passcode(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
        notifyPropertyChanged(BR.firstNumber);
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
        notifyPropertyChanged(BR.secondNumber);
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
        notifyPropertyChanged(BR.thirdNumber);
    }

    public void setFourthNumber(int fourthNumber) {
        this.fourthNumber = fourthNumber;
        notifyPropertyChanged(BR.fourthNumber);
    }

    public int getCode() {
        return firstNumber * 1000 + secondNumber * 100 + thirdNumber * 10 + fourthNumber;
    }

    @Bindable
    public int getFirstNumber() {
        return firstNumber;
    }

    @Bindable
    public int getSecondNumber() {
        return secondNumber;
    }

    @Bindable
    public int getThirdNumber() {
        return thirdNumber;
    }

    @Bindable
    public int getFourthNumber() {
        return fourthNumber;
    }

    public boolean isActive() {
        return firstNumber != -1 && secondNumber != -1 && thirdNumber != -1 && fourthNumber != -1;
    }

    @Override
    public String toString() {
        return "Passcode{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", thirdNumber=" + thirdNumber +
                ", fourthNumber=" + fourthNumber +
                ", isActive=" + isActive +
                '}';
    }
}
