package bsu.comp152;

public class Main {

    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0};
        double[] arr2 = {-1.0, 2.0, -1.0};

        Vctor vect1 = new Vctor(arr);
        Vctor vect2 = new Vctor(arr2);

        System.out.println(arr.length);
        // Instance fields are private!
        // They can't be accessed directly from a class other than Vctor.
        // System.out.println(vect1.elements);

        System.out.printf("The vector has dimension %d\n", vect1.getDimension());

        System.out.println();
        System.out.println(Math.pow(3.0, 2));
        System.out.println(vect1.geometricLength());
        System.out.println(Math.sqrt(14));

        System.out.println();

        System.out.println("vect1 is " + vect1);
        System.out.println("vect2 is " + vect2);
        System.out.println("Their sum is: ");
        System.out.println(vect1.addVector(vect2));

    }
}
