public class binarystring {
    public static int bin(String num[], String key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (key.equals(num[mid])) {
                return mid;
            }
            if (num[mid].compareTo(key)<0) { /*when two strings compared if one string is s1>ss2 if gives positive ansd if s1<s2 then it gives negative so for continueing the result we do <0 */
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String num[] = { "piya","riya","shijk","tlmn"};
        String key = "shijk";
        System.out.println(bin(num, key));
    }
}


