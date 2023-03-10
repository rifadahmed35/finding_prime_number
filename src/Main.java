public class Main {
    public static void main(String[] args) {
      int i, num, count=0;
      num = 13;
      if(num==0 || num==1){        // 0 and 1 are not prime number. we have to mention here
          System.out.println("Not primitive");
      }else {
          for (i = 2; i < num/2; i++) {  //we are counting (num/2) half of 13. it's enough for finding prime num.
              if (num % i == 0) {
                  count++;
                  break;
              }
          }
          if (count == 0) {
              System.out.println("Prime number");
          } else {
              System.out.println("Not prime");
          }
      }
    }
}