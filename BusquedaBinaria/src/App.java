public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        int[] array = { 12, 23, 34, 45, 56, 78, 91 };
        int target = 56;

        // Llamar a la función de búsqueda binaria
        int result = binarySearch(array, target);

        // Comprobar el resultado de la búsqueda
        if (result != -1) {
            System.out.println("Elemento encontrado en la posición: " + result);
        } else {
            System.out.println("Elemento no encontrado en el array.");
        }
    }



     // Función para realizar la búsqueda binaria recursiva
     public static int binarySearch(int[] array, int target) {
        
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            // Comprobar si el valor buscado está en el punto medio
            if (array[mid] == target) {
                return mid; // Elemento encontrado, devolver su posición
            } else if (array[mid] < target) {
                low = mid + 1; // Descartar la mitad inferior
            } else {
                high = mid - 1; // Descartar la mitad superior
            }
        }

        return -1; // Elemento no encontrado
    }


}
