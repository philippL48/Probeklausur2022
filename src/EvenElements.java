public class EvenElements {

    public static void main(String[] args) {
        System.out.println("test");
    }

    public int sumEvenElements(int[] array) {
        int sumEvens = 0;
        if (array == null) {
            System.out.println("Achtung: array ist null.");
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEvens++;
            }
        }
        return sumEvens;
    }
}
