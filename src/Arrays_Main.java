import java.util.Arrays;
import java.util.Date;

public class Arrays_Main {

   static int z = 20;
   
   public static void main(String[] args) 
   {
      // TODO Auto-generated method stub
 
         z = 20;
         System.out.println("z1: " + z);
         
         System.out.println(sum(10, 20));     // 30
         // Суммирование вещественных чисел
         System.out.println(sum(10.5, 20.7)); // 31.2
         // Какой метод будет вызван?
         System.out.println(sum(10L, 20L));
         
         int[] arr = {1, 2, 3, 4, 5};
         System.out.println(Arrays.toString(arr));
         // [1, 2, 3, 4, 5]
         func(arr);
         System.out.println(Arrays.toString(arr)); // Изменился!!!
         // [9, 2, 3, 4, 5]

         func(1, 2.5, "строка");
         func(1, 2.5, 300L, "строка", new Date());      
      }       
         
      public static double sum(double x, double y) 
      {
         return x + y;            
      }
         
      public static void func(int[] arr) 
      {
         arr[0] = 9;
      }

      public static void func(Object... a) {
         for (Object b: a) {
            System.out.println(b);
         }
      }        
}
