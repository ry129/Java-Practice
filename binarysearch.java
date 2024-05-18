public class binarysearch {
    public static int bin(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == num[mid]) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int num[] = { 10, 20,  30, 55 };
        int key = 30;
        System.out.println(bin(num, key));
    }
}
