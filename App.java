import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 	1- Multiplicar 2 numeros, sin utilizar el operador de multiplicacion.
        Helper helper = new Helper();
        int res = helper.multiplicarSinOperador(-4, 2);
        System.out.println("El resultado de la suma es " + res);

        // 2- Obtener el numero mayor dentro de un arreglo. Solo iterar 1 vez.
        int arr[] = {38, 539, 123, 323, 209};
        int max = helper.obtenerMayorNumeroArray(arr);
        System.out.println("El mayor numero del arreglo es " +max);

        // 3- Dado un arreglo, eliminar todos los "undefined", "null", "false" y 0 (no sus valores en string). Iterar solo 1 vez.
        String stringArr[] = {"hola", "juancito", "null", "como", "andas", "undefined", "0", "todo", "bien", "false"};
        String elementos[] = {"undefined", "null", "false", "0"};
        String stringRes[] = helper.eliminarElementosStringArray(stringArr, elementos);
        System.out.println(Arrays.toString(stringRes));

        // 4- Dado un arreglo multidimensional, obtener todos los valores en un nuevo arreglo de una sola dimension. Usar recursividad
        Object [] multiArr = new Object[]{1, new Object[]{2 , new Object[]{3, 4}}, "hola", new Object[]{1, "buenos dias"}};
        List<Object> list = new ArrayList<>();
        Object [] resultadoArr = helper.transformarArray(multiArr, list);
        System.out.println(Arrays.toString(resultadoArr));

        // 5- Dado un string, devolver un objeto/array que indique la palabra que mas veces se repite, y su cantidad.
        String oracion = "como como como no no la la es es es es";
        Object resp[] = helper.palabraMasRepetida(oracion);
        System.out.println(Arrays.toString(resp));

        // 6- Verificar si un string es un palíndromo.
        if (helper.esPalindromo("Oso")) {
            System.out.println("Es palindromo");
        }
        else {
            System.out.println("No es palindromo");
        }

        // 7- Dado 3 numeros, devolver el mayor. Adaptar esto para que funcione con cualquier cantidad de numeros.
        // Creo que se puede resolver con el punto 2)
        
    }
}
