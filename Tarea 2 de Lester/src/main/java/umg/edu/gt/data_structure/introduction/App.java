/*    */ package umg.edu.gt.data_structure.introduction;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import umg.edu.gt.data_structure.array.BubbleSort;
/*    */ import umg.edu.gt.data_structure.array.MergeSortDemo;
/*    */ import umg.edu.gt.data_structure.array.QuickSort;
/*    */ import umg.edu.gt.data_structure.array.SumArray;
/*    */ import umg.edu.gt.data_structure.array.SecondMinMax;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class App
/*    */ {
/*    */   public static void main(String[] args) {
/* 17 */     int[] d1 = { 3, 5, 2, 9 };
/* 18 */     SumArray sumArray = new SumArray();
/* 19 */     System.out.println(sumArray.sum(d1));
/*    */ 
/*    */     
/* 22 */     MergeSortDemo mergeSortDemo = new MergeSortDemo();
/* 23 */     int[] d2 = { 8, 3, 7, 4, 9, 2 };
/* 24 */     mergeSortDemo.mergeSort(d2);
/* 25 */     System.out.println(Arrays.toString(d2));
/*    */ 
/*    */     
/* 28 */     BubbleSort blueSort = new BubbleSort();
/* 29 */     int[] arr = { 5, 1, 4, 2, 8 };
/* 30 */     blueSort.bubbleSort(arr);
/*    */     
/* 32 */     for (int n : arr) {
/* 33 */       System.out.print(n + " ");
/*    */     }

             System.out.println();// agregue salto de linea para separar los resultados juntos
/*    */ 
/*    */    
/* 37 */     QuickSort quick = new QuickSort();
/* 38 */     int[] arr1 = { 10, 7, 8, 9, 1, 5 };
/* 39 */     quick.quickSort(arr1, 0, arr1.length - 1);
/*    */     
/* 41 */     for (int n : arr1) {
/* 42 */       System.out.print(n + " ");
/*    */     }
/*    */ 
/*    */     
/* 46 */     int[] arr2 = { 10, 7, 8, 9, 1, 5 };
/* 47 */     Arrays.sort(arr2);// utiliza Arrays.sort el cual es un metodo ya implementado dentro de java.util.Arrays
/* 48 */     System.out.println("\nUse sort: " + Arrays.toString(arr2));

             int[] nums = {10, 7, 8, 9, 1, 5};
             SecondMinMax segminmax = new SecondMinMax();
             segminmax.findSecondMinMax(nums);  
/*    */   }
/*    */ }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\introduction\App.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */