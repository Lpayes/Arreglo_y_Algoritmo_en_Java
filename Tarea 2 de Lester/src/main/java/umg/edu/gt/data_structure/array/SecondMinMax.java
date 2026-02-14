package umg.edu.gt.data_structure.array;

// ojo: Imgeniero Walter, utilice el metodo void ya que se me hizo el ideal para este reto de impirmir el max2 y min2 de un arreglo
public class SecondMinMax {

    // Método que encuentra el segundo mayor y el segundo menor
    public void findSecondMinMax(int[] arr) {
        // inicializamos los valores
        int max1 = Integer.MIN_VALUE; // guarda el número más grande encontrado hasta ahora
        int max2 = Integer.MIN_VALUE; // guarda el segundo mayor
        int min1 = Integer.MAX_VALUE; // guarda el número más pequeño encontrado hasta ahora
        int min2 = Integer.MAX_VALUE; // guarda el segundo menor

        // recorremos todo el arreglo una sola vez
        for (int n : arr) { // por cada valor n en el arreglo arr
            // revisamos si n es mayor que el máximo actual
            if (n > max1) { 
                max2 = max1; // el actual máximo pasa a ser segundo máximo
                max1 = n;    // n se convierte en el nuevo máximo
            } else if (n > max2 && n != max1) { 
                max2 = n;    // n es mayor que el segundo máximo pero menor que max1
            }

            // revisamos si n es menor que el mínimo actual
            if (n < min1) { 
                min2 = min1; // el mínimo actual pasa a ser segundo mínimo
                min1 = n;    // n se convierte en el nuevo mínimo
            } else if (n < min2 && n != min1) { 
                min2 = n;    // n es menor que el segundo mínimo pero mayor que min1
            }
        }

        // Ahora procedo a imprimir los resultados
        System.out.println("Segundo mayor: " + max2);
        System.out.println("Segundo menor: " + min2);
    }
}