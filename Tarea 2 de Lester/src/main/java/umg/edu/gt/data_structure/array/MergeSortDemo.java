/*    */ package umg.edu.gt.data_structure.array;
/*    */ 
/*    */ import java.util.Arrays;
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
/*    */ public class MergeSortDemo //aca se esta creando la clase MergeSortDemo que va a tener el metodo para ordenar
/*    */ {
/*    */   public void mergeSort(int[] a) {
/* 18 */     if (a.length <= 1) if (a.length <= 1) // si el arreglo tiene 1 o menos elementos no hace nada porque ya esta ordenado
/*    */       return;  // sale del metodo porque no hay nada que ordenar
/* 20 */     int mid = a.length / 2; //int mid = a.length / 2; // calcula el punto medio del arreglo para dividirlo en dos
/* 21 */     int[] left = Arrays.copyOfRange(a, 0, mid);// crea un arreglo izquierdo con los elementos de 0 hasta mid-1
/* 22 */     int[] right = Arrays.copyOfRange(a, mid, a.length);// crea un arreglo derecho con los elementos de mid hasta el final
/* 23 */     mergeSort(left);// llama recursivamente mergeSort en el arreglo izquierdo
/* 24 */     mergeSort(right);// llama recursivamente mergeSort en el arreglo derecho
/* 25 */     merge(a, left, right);// llama al metodo merge para combinar los arreglos left y right en orden dentro de a
/*    */   }
/*    */   
/*    */   private void merge(int[] a, int[] left, int[] right) {// aca se esta creando el metodo merge para combinar los arreglos ordenados
/* 29 */     int i = 0, j = 0, k = 0;// i recorre left, j recorre right, k recorre el arreglo principal a
/* 30 */     while (i < left.length && j < right.length) {// mientras queden elementos en left y right
/* 31 */       if (left[i] <= right[j]) {// si el valor actual de left es menor o igual al de right
/* 32 */         a[k++] = left[i++]; continue;// pone el valor de left en a y avanza i y k, luego continua el while
/*    */       } 
/* 34 */       a[k++] = right[j++];// si no, pone el valor de right en a y avanza j y k
/*    */     } 
/*    */     
/* 37 */     while (i < left.length)// si quedaron elementos en left que no se copiaron
/* 38 */       a[k++] = left[i++];// copia los que faltan de left al arreglo principal
/* 39 */     while (j < right.length)// si quedaron elementos en right que no se copiaron
/* 40 */       a[k++] = right[j++];// copia los que faltan de right al arreglo principal
/*    */   }
/*    */ }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\MergeSortDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */