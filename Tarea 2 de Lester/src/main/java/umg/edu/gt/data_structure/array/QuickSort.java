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
/*    */ public class QuickSort
/*    */ {
/*    */   public void quickSort(int[] arr, int low, int high) {// aca se esta definiendo el metodo quickSort que recibe el arreglo y los indices de inicio y fin
/* 16 */     if (low < high) {// si el indice de inicio es menor que el de fin, es decir, hay al menos 2 elementos para ordenar
/* 17 */       int pivotIndex = partition(arr, low, high);// llama a partition para obtener el indice del pivote ordenado
/*    */       
/* 19 */       quickSort(arr, low, pivotIndex - 1);// llama recursivamente quickSort en la parte izquierda del pivote
/* 20 */       quickSort(arr, pivotIndex + 1, high);// llama recursivamente quickSort en la parte derecha del pivote
/*    */     } 
/*    */   }
/*    */   
/*    */   private int partition(int[] arr, int low, int high) { // aca se crea el metodo partition que organiza los elementos respecto al pivote
/* 25 */     int pivot = arr[high]; // selecciona el ultimo elemento como pivote
/* 26 */     int i = low - 1;// i apunta al ultimo elemento menor que el pivote, empieza antes de low
/*    */     
/* 28 */     for (int j = low; j < high; j++) {// recorre todos los elementos desde low hasta high-1
/* 29 */       if (arr[j] <= pivot) {// si el elemento actual es menor o igual al pivote
/* 30 */         i++;// avanza i para marcar la nueva posición donde se va a poner el valor menor
/* 31 */         int k = arr[i]; //guarda temporalmente el valor de arr[i]
/* 32 */         arr[i] = arr[j];// pone el arr[j] en la posición de arr[i], osea mueve  el menor a la izquierda
/* 33 */         arr[j] = k;// pone el valor antiguo de arr[i] en arr[j], es decir que se completo el intercambio
/*    */       } 
/*    */     } 
/*    */     
/* 37 */     int temp = arr[i + 1]; // despues de recorrer todo, se guarda temporalmente el valor que sigue a los menores
/* 38 */     arr[i + 1] = arr[high];// pone el pivote en su posición correcta, que es i+1
/* 39 */     arr[high] = temp;//mueve el valor que estaba en i+1 al final
/*    */     
/* 41 */     return i + 1;// devuelve la posición final del pivote
/*    */   }
/*    */ }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\QuickSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */