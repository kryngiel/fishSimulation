package com.gmail.kryngielto.simulation.fish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin on 22-Dec-17.
 */
public class Brain {

    private List<List<Neuron>> layers;

    private Brain(){}

    public static Brain newRandomBrain(int inputNumber, int... restLayersSizes) {
        Brain result = new Brain();
        initLayers(inputNumber, result, restLayersSizes);
        return result;
    }

    private static void initLayers(int inputNumber, Brain result, int[] restLayersSizes) {
        result.layers = new ArrayList<>();
        List<Neuron> inputLayer = new ArrayList<>();
        for (int i = 0; i < inputNumber ; i++) {
            inputLayer.add(new InputSignal());
        }
        result.layers.add(inputLayer);

        List<Neuron> currentLayer;
        for (int numberOfNeuronsInCurrentLayer: restLayersSizes) {
            currentLayer = new ArrayList<>();
            for (int i = 0; i < numberOfNeuronsInCurrentLayer; i++) {
                currentLayer.add(new Neuron());
            }
            result.layers.add(currentLayer);
        }
    }

    public List<Float> getOutputs() {
        List<Float> result = new ArrayList<>();
        for (Neuron neuron : getLastLayer()) {
            result.add(neuron.getOutput());
        }
        return result;
    }

    public List<List<Neuron>> getLayers() {
        return layers;
    }

    public void setLayers(List<List<Neuron>> layers) {
        this.layers = layers;
    }

    private List<Neuron> getLastLayer() {
        return layers.get(layers.size() - 1);
    }


}
