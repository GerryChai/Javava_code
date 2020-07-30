public class MaxMinTest {
    public static void main(String[] args) {
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100*Math.random();
        }
        System.out.println("Max_Min");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("max number is " + MaxMin.getResult(array).getMax());
        System.out.println("min number is " + MaxMin.getResult(array).getMin());
    }
}
