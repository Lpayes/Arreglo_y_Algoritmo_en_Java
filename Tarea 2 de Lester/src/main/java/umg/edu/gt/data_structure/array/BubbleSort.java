         package umg.edu.gt.data_structure.array;



         public class BubbleSort// Aca estoy creando la clase para la burbuja ya que cada funcion debe ir dentro de una clase 
         {
           public void bubbleSort(int[] arr) {// Aca estoy definiendo un metodo para que lo pueda llamar app. java 
            int n = arr.length;// Esta linea hace que n guarde el numero de elementos que tiene el arreglo
 
     
             for (int i = 0; i < n - 1; i++) {// Aca se recorre solo 5 veces ya que no es necsario la sexta vez porque automaticamente queda ordenado
               boolean swapped = false;// Se inicializa una variable y se le da el valor booleano de false
      
                for (int j = 0; j < n - 1 - i; j++) {// Recorre la parte del arreglo que aún no está ordenada, evitando comparar posiciones ya acomodadas
                 if (arr[j] > arr[j + 1]) {// Aca se evalua la condicion de que si el indice actual es mayo al idice proximo
          
                   int temp = arr[j];// Variable temporal para guardar el valor del numero mayor
                   arr[j] = arr[j + 1];// Valor del indice con el vlaor mayo, se le da el valor del indice proximo
                   arr[j + 1] = temp;// El valor del indice proximo, se le asigna o actualiza con el valor mayor
                   swapped = true;// La variable de swapped boleana cambia a true
                 } 
               } 
 
      
                if (!swapped)// Si la primera condicion no se cumple pues hay un break
                 break; 
             } 
           }
         }


/* Location:              C:\Users\LESTER\Downloads\introduction-0.0.1-SNAPSHOT.jar\\umg\edu\gt\data_structure\array\BubbleSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */