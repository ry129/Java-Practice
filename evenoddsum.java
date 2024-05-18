import java.util.Scanner;
public class evenoddsum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            if(i%2==0){
                System.out.println("even");
                evensum=evensum+i;}
                else{
                System.out.println("odd");
                oddsum=oddsum+i;}
            i++;
 }
           System.out.println(evensum) ;
           System.out.println(oddsum);


        }
        
    }
    

