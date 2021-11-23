package insertion_sort;

/**
 *
 * @author fuad
 */
public class Insertion_sort {

    public static void main(String[] args) {
        int numbers[] = {15, 2, 13, 4, 8, 10, 50, 40};

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= i - 1 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                --j;
            }
            numbers[j + 1] = key;
        }

        System.out.print("Sorted Array in Ascending Order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
