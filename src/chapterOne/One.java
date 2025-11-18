package chapterOne;
import java.util.Scanner;

public class One {
    public int binary_search(int list[], int size, int item) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess < item) low = mid + 1;
            if (guess > item) high = mid - 1;
            if (guess == item) return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int my_list[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("Массив: 1 3 5 7 9 11 13 15 17 19");

        int size = my_list.length;
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        One search = new One();
        int result = search.binary_search(my_list, size, item);
        if (result != -1) System.out.println(result);
        else System.out.println("Такого числа нет");
    }
}