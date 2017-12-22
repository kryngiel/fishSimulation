package com.gmail.kryngielto.simulation.fish;

import java.util.List;

/**
 * Created by Marcin on 22-Dec-17.
 */
public class Neuron {

    private ActivationFunction function;

    private List<Neuron> inputs;
    private List<Float> weights;
    private float bias;

    public void setInputs(List<Neuron> inputs) {
        this.inputs = inputs;
    }

    public void setWeights(List<Float> weights) {
        this.weights = weights;
    }

    public float getOutput() {
        float result = bias;
        for (int i = 0; i < inputs.size(); i++) {
            result += inputs.get(i).getOutput() * weights.get(i);
        }
        return function.getOutput(result);
    }


}
