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
/*    */ public class BubbleSort// aca estoy creando la clase para la burbuja ya que cada funcion debe ir dentro de una clase 
/*    */ {
/*    */   public void bubbleSort(int[] arr) {// aca estoy definiendo un metodo para que lo pueda llamar app. java 
/* 15 */     int n = arr.length;// esta linea hace que n guarde el numero de elementos que tiene el arreglo
/*    */ 
/*    */     
/* 18 */     for (int i = 0; i < n - 1; i++) {// aca se recorre solo 5 veces ya que no es necsario la sexta vez porque automaticamente queda ordenado
/* 19 */       boolean swapped = false;// se inicializa una variable y se le da el valor booleano de false
/*    */       
/* 21 */       for (int j = 0; j < n - 1 - i; j++) {// Recorre la parte del arreglo que aún no está ordenada, evitando comparar posiciones ya acomodadas
/* 22 */         if (arr[j] > arr[j + 1]) {// aca se evalua la condicion de que si el indice actual es mayo al idice proximo
/*    */           
/* 24 */           int temp = arr[j];// variable temporal para guardar el valor del numero mayor
/* 25 */           arr[j] = arr[j + 1];// valor del indice con el vlaor mayo, se le da el valor del indice proximo
/* 26 */           arr[j + 1] = temp;// el valor del indice proximo, se le asigna o actualiza con el valor mayor
/* 27 */           swapped = true;// la variable de swapped boleana cambia a true
/*    */         } 
/*    */       } 
/*    */ 
/*    */       
/* 32 */       if (!swapped)// si la primera condicion no se cumple pues hay un break
/*    */         break; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\BubbleSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */