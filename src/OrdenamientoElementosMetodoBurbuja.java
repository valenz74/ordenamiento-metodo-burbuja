public class OrdenamientoElementosMetodoBurbuja {
    public static void main(String[] args) {
    //Creamos un arreglo de enteros de 10 elementos
        int a[] = new int[10];

    /*
        Poblaremos el arreglo llenandolo de numeros de forma aleatoria.
        Clase de Java llamada Math.random :
            1. Float 0.0 y 0.999999
            2. Como se genera un Flotante, necesitamos convertirlo a un entero,
               eso lo hacemos con el casting (int)
     */
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 99);
        }

    //Mostramos resultado en consola utilizando un for:
        System.out.print("Arreglo sin ordenar: ");
        for(int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();

    /*
    Ordenamos por el método Burbuja:
    1. Recorrer el arreglo tantas veces como el elemento contenga menos 1.
       Ej: Si el arreglo tiene 10 elementos, voy a recorrerlo 9 veces.
    2. En cada recorrido comparo el elemento actual con el elemento siguiente
       para saber si estan ordenados.
       Si, no lo estan, entonces, los ordeno.
       1. 5 6 9 1  (original)
       2. 5 6 1 9
       3. 5 1 6 9
       4. 1 5 6 9
     */
        for (int recorrido = 0; recorrido < a.length -1; recorrido++){
            for (int elemento = 0; elemento < a.length -1; elemento++){
                if (a[elemento] > a[elemento + 1]){
                    int temp = a[elemento];
                    a[elemento] = a[elemento + 1];
                    a[elemento + 1] = temp;
                }
            }
        }
    //Mostramos el arreglo ya ordenado
        System.out.print("Arreglo ordenado: ");
        for(int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
