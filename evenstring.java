public class evenstring {
    public static void main(String[] args) {
        String str = "this is a world";
        String words[] = str.split(" ");
        
        for (String word:words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            } 

        }

    }
}