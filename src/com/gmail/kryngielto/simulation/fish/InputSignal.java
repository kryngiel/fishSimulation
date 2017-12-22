package com.gmail.kryngielto.simulation.fish;

/**
 * Created by Marcin on 22-Dec-17.
 */
public class InputSignal extends Neuron {

    private float currentValue;

    @Override
    public float getOutput() {
        return currentValue;
    }

    public void setCurrentValue(float currentValue) {
        this.currentValue = currentValue;
    }
}
