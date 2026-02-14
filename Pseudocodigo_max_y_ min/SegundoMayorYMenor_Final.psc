Algoritmo SegundoMayorYMenor_Final
	//Lester David Payes Méndez 0905-24-22750
    Definir arreglo, n, max1, max2, min1, min2, i, tamano Como Entero
    Dimension arreglo[6] // Declaración del arreglo y definición de su tamaño
    
    // ojo el vector va del indice 1 al 6 ya que al utilizar el 0 me daba error y además es una práctica de pseudocódigo empezar desde 0
    
    // Llenando el arreglo
    arreglo[1] <- 10
    arreglo[2] <- 7
    arreglo[3] <- 8
    arreglo[4] <- 9
    arreglo[5] <- 1
    arreglo[6] <- 5
    
    // Inicializar con valores extremos
    max1 <- -999999   // el máximo inicial más pequeño posible
    max2 <- -999999   // el segundo máximo inicial más pequeño posible
    min1 <- 999999    // el mínimo inicial más grande posible
    min2 <- 999999    // el segundo mínimo inicial más grande posible
    tamano <- 6       // tamaño del arreglo
    
    // Un solo ciclo del 1 al 6 para recorrer una vez el arreglo
    Para i <- 1 Hasta tamano Hacer
        n <- arreglo[i]  // tomo el valor actual del arreglo
        
        // Lógica de máximos
        Si n > max1 Entonces
            max2 <- max1   // el máximo actual pasa a ser el segundo máximo
            max1 <- n      // n se convierte en el nuevo máximo
        Sino
            Si n > max2 Y n <> max1 Entonces
                max2 <- n  // n es mayor que el segundo máximo pero menor que max1
            FinSi
        FinSi
        
        // Lógica de mínimos
        Si n < min1 Entonces
            min2 <- min1   // el mínimo actual pasa a ser segundo mínimo
            min1 <- n      // n se convierte en el nuevo mínimo
        Sino
            Si n < min2 Y n <> min1 Entonces
                min2 <- n  // n es menor que el segundo mínimo pero mayor que min1
            FinSi
        FinSi
    FinPara
    
    Escribir "El segundo máximo es: ", max2
    Escribir "El segundo mínimo es: ", min2
FinAlgoritmo
