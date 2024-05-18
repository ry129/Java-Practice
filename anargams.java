
import java.util.Arrays;

public class anargams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        //lowercase
        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();
        //check strings are equal or not
        if (str1.length() == str2.length()) {
            //convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or equal then the strings are anargam
    boolean result= Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 +" and "+ str2+ " are Anagrams");
            }
            else{
                System.out.println("not anargams");
            }
        }
            else{
                //when lengths are not equal
                System.out.println("Strings are of different lengths");
            }

            
            
        }


    }
    

