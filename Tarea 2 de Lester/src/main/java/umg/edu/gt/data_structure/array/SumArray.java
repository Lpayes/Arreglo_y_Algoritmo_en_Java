/*    */ package umg.edu.gt.data_structure.array;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SumArray
/*    */ {
/*    */   public int sum(int[] nums) {
/* 17 */     int total = 0;//Esta es la variable elegida para guardar la suma del arreglo
/* 18 */     for (int n : nums) { // aca se recorrera cada elemento del arreglo nums
/* 19 */       total += n;// Aca por cada vueta se ira sumando el valor de cada espacio del arreglo
/*    */     }
/* 21 */     return total; // Devuelve el resultado final de la suma
/*    */   }
/*    */ }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\SumArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */