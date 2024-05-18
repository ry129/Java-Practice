public class linearsearchstring {
    public static int linear(String s[], String key) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(key)) {
                return i;
            }
        }
            return -1;

        
    }

public static void main(String[]args){
    String s[] = { "riya", "shiv", "lavi", "shavi" };
    String key = "lavi";
    int r=linear(s,key);
    if(r == -1){
        System.out.println("not found");
    }
    else{
        System.out.println(r);
    }


}
}
