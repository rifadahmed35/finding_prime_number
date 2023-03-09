public class Main {
    public static void main(String[] args) {
      int i, num, count=0;
      num = 5;
      for (i=2; i<num; i++){
          if(num%i==0){
              count++;
              break;
          }
      }
      if(count==0){
          System.out.println("Prime number");
      }else{
          System.out.println("Not prime");
      }
    }
}