         package umg.edu.gt.data_structure.array;



         public class SumArray
         {
          public int sum(int[] nums) {
             int total = 0;//Esta es la variable elegida para guardar la suma del arreglo
             for (int n : nums) { // aca se recorrera cada elemento del arreglo nums
                total += n;// Aca por cada vueta se ira sumando el valor de cada espacio del arreglo
             }
             return total; // Devuelve el resultado final de la suma
           }
         }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\SumArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */