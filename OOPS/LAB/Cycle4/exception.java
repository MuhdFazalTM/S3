public class exception
{
   public static void main(String args[]){
     try{
        int[] num={1,2,3};
        System.out.println(num[10]);
       }
     catch(Exception e){
        System.out.println("error occured in program");
       }
     finally{
        System.out.println("Try and Catch executed successfully");
      }
    }
}
