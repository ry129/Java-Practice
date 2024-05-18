public class stringreversearray {
    
        public static void reve(String num[]){
            int first=0;
            int last=num.length-1;
            while(first<last){
                String temp = num[first];
                num[first] = num[last];
                num[last] = temp;
                first++;
                last--;
            }
    
        }
    
        public static void main(String[] args) {
            String num[] = { "a","b","c","d","e" };
            System.out.println("Original array:");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
            reve(num);
            System.out.println("reversed array:");
            for (int i = 0; i < num.length; i++) {
                System.out.print( num[i]+" ");
            }
    
        }
        
        
    }
    

    

