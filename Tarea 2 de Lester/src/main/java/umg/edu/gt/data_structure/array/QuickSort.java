         package umg.edu.gt.data_structure.array;



         public class QuickSort
         {
           public void quickSort(int[] arr, int low, int high) {// Aca se esta definiendo el metodo quickSort que recibe el arreglo y los indices de inicio y fin
             if (low < high) {// Si el indice de inicio es menor que el de fin, es decir, hay al menos 2 elementos para ordenar
               int pivotIndex = partition(arr, low, high);// Llama a partition para obtener el indice del pivote ordenado
      
               quickSort(arr, low, pivotIndex - 1);// Llama recursivamente quickSort en la parte izquierda del pivote
               quickSort(arr, pivotIndex + 1, high);// Llama recursivamente quickSort en la parte derecha del pivote
             } 
           }
   
           private int partition(int[] arr, int low, int high) { // Aca se crea el metodo partition que organiza los elementos respecto al pivote
             int pivot = arr[high]; // Selecciona el ultimo elemento como pivote
             int i = low - 1;// i apunta al ultimo elemento menor que el pivote, empieza antes de low
             
             for (int j = low; j < high; j++) {// Recorre todos los elementos desde low hasta high-1
               if (arr[j] <= pivot) {// Si el elemento actual es menor o igual al pivote
                 i++;// Avanza i para marcar la nueva posición donde se va a poner el valor menor
                 int k = arr[i]; //Guarda temporalmente el valor de arr[i]
                 arr[i] = arr[j];// Pone el arr[j] en la posición de arr[i], osea mueve  el menor a la izquierda
                 arr[j] = k;// Pone el valor antiguo de arr[i] en arr[j], es decir que se completo el intercambio
               } 
             } 
     
             int temp = arr[i + 1]; // Despues de recorrer todo, se guarda temporalmente el valor que sigue a los menores
             arr[i + 1] = arr[high];// Pone el pivote en su posición correcta, que es i+1
             arr[high] = temp;//Mueve el valor que estaba en i+1 al final
     
             return i + 1;// Devuelve la posición final del pivote
           }
         }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\QuickSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */