package bsu.comp152;

import java.util.Arrays;

public class Vctor {

    private double[] elements;

    public Vctor(double[] array) {
        // Create an array that can store the same number
        // of elements as the parameter.
        elements = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            elements[i] = array[i];
        }
    }

    public int getDimension(){
        return elements.length;
    }

    @Override
    public String toString() {
        return "Vctor{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public Vctor addVector(Vctor other){
        Vctor vect = new Vctor(other.elements);
        for (int i = 0; i < elements.length; i++) {
            vect.elements[i] = elements[i] + other.elements[i];
        }
        return vect;
    }

    public double geometricLength() {
        double x = 0.0;
        for (int i = 0; i < elements.length; i++) {
            x += Math.pow(elements[i], 2);
        }
        return Math.sqrt(x);
    }
}
