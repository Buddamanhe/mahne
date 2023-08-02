public class Median
{
   public static void main(String[]args)
   {
   
   double array[] = {10,40,90,80,30,70,60,20,50};
   
   bubbleSort(array);
   
   for(double i : array )
   {
      System.out.print(i);
   }
   }
   public static void bubbleSort(double array[]) 
   {
      for(int i = 0;i < array.length - 1; i++)
      {
         for(int j = 0; j < array.length - i - 1;j++)
         {
          if(array[j] > array[j+1])
          {
           double temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
          }
        }
      }
   }
}