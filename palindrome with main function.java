import java.util.*;
class Main {
    public static int palindrome(int n){
        int c=0,p=0;
      while(n!=0){
         c=n%10;
         p=(p*10)+c;
         n=n/10;
      }  
      return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int x=palindrome(n);
       if(n==x){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not a palindrome");
       }
        
    }
}