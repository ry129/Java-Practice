public class subarrayprefixmax {

    public static void sub(int num[]) {
           
            int curr = 0;
            int max = Integer.MIN_VALUE;
            
            int prefix[]=new int[num.length];
            prefix[0]=num[0];
            for(int i=1;i<num.length;i++){
                prefix[i]=prefix[i-1]+num[i];
            }

    
            for (int i = 0; i < num.length; i++) {
                int start = i;
                for (int j = i; j < num.length; j++) {
                    int end = j;
                    curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                    if (curr > max) {
                        max = curr;
                    }

                }

            }
            System.out.println("max="+max);
        }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        sub(num);
    }

}


