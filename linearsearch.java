public class linearsearch {
    public static int linear(int num[], int key) {
        for (int i = 0; i <= num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 10, 8, 9 };
        int key = 10;
        int index = linear(num,key);
        if (index == -1) {
            System.out.println("NOT FOUND");

        } else {
            System.out.println(index);
        }

    }
}