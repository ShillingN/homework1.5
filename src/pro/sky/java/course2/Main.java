package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {910, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);


    }
}
