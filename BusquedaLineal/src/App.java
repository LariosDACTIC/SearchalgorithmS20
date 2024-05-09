public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        int[] array = { 12, 45, 78, 23, 56, 91, 34 };
        int target = 56;

        // Llamar a la función de búsqueda lineal
        int result = linearSearch(array, target);

        // Comprobar el resultado de la búsqueda
        if (result != -1) {
            System.out.println("Elemento encontrado en la posición: " + result);
        } else {
            System.out.println("Elemento no encontrado en el array.");
        }
        
    }

     // Función para realizar la búsqueda lineal
     public static int linearSearch(int[] array, int target) {
        // Iterar a través de cada elemento del array
        for (int i = 0; i < array.length; i++) {
            // Comprobar si el elemento actual es igual al valor buscado
            if (array[i] == target) {
                // Devolver la posición del elemento si se encuentra
                return i;
            }
        }
        // Devolver -1 si el elemento no se encuentra en el array
        return -1;
    }



}
