         package umg.edu.gt.data_structure.introduction;

         import java.util.Arrays;
         import umg.edu.gt.data_structure.array.BubbleSort;
         import umg.edu.gt.data_structure.array.MergeSortDemo;
         import umg.edu.gt.data_structure.array.QuickSort;
         import umg.edu.gt.data_structure.array.SumArray;
         import umg.edu.gt.data_structure.array.SecondMinMax;


 


        public class App
         {
           public static void main(String[] args) {
             int[] d1 = { 3, 5, 2, 9 };
             SumArray sumArray = new SumArray();
             System.out.println(sumArray.sum(d1));
    
             MergeSortDemo mergeSortDemo = new MergeSortDemo();
             int[] d2 = { 8, 3, 7, 4, 9, 2 };
             mergeSortDemo.mergeSort(d2);
             System.out.println(Arrays.toString(d2));
                  
             BubbleSort blueSort = new BubbleSort();
             int[] arr = { 5, 1, 4, 2, 8 };
             blueSort.bubbleSort(arr);
     
             for (int n : arr) {
             System.out.print(n + " ");
             }

             System.out.println();// Agregue salto de linea para separar los resultados juntos
 
    
             QuickSort quick = new QuickSort();
             int[] arr1 = { 10, 7, 8, 9, 1, 5 };
             quick.quickSort(arr1, 0, arr1.length - 1);
    
             for (int n : arr1) {
               System.out.print(n + " ");
             }

    
             int[] arr2 = { 10, 7, 8, 9, 1, 5 };
             Arrays.sort(arr2);// Utiliza Arrays.sort el cual es un metodo ya implementado dentro de java.util.Arrays
             System.out.println("\nUse sort: " + Arrays.toString(arr2));
             int[] nums = {10, 7, 8, 9, 1, 5};
             SecondMinMax segminmax = new SecondMinMax();
             segminmax.findSecondMinMax(nums);  
           }
         }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\introduction\App.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */