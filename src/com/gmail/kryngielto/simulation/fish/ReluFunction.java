package com.gmail.kryngielto.simulation.fish;

/**
 * Created by Marcin on 22-Dec-17.
 */
public class ReluFunction implements ActivationFunction {

    @Override
    public float getOutput(float x) {
        if (x < 0) {
            return 0;
        }
        return x;
    }
}
