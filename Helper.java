import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper {
    
    // 	1- Multiplicar 2 numeros, sin utilizar el operador de multiplicacion.
    public int multiplicarSinOperador (int num1, int num2){
        if(num2 == 0 || num1 == 0){
            return 0;
        }
        else if(num2 < 0){
            return -multiplicar(num1, -num2);
        }
        else {
            return multiplicar(num1, num2);
        }
    }

    private int multiplicar(int num1, int num2){
        int resultado = 0;
        for(int i = 0; i < num2; i++){
            resultado += num1;
        }
        return resultado;
    }

    // 2- Obtener el numero mayor dentro de un arreglo. Solo iterar 1 vez.
    public int obtenerMayorNumeroArray(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 3- Dado un arreglo, eliminar todos los "undefined", "null", "false" y 0 (no sus valores en string). Iterar solo 1 vez.
    public String[] eliminarElementosStringArray(String[] arr, String[] elementos) {       
        List<String> elementosList = Arrays.asList(elementos);
        List<String> resultadoList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!elementosList.contains(arr[i])){
                resultadoList.add(arr[i]);
            }
        }
        String[] res = new String[resultadoList.size()];
        res = resultadoList.toArray(res);
        return res;
    }

    // 4- Dado un arreglo multidimensional, obtener todos los valores en un nuevo arreglo de una sola dimension. Usar recursividad
    public Object[] transformarArray(Object[] multiArr, List<Object> list) {
        if (multiArr == null) return null;
        for (Object element : multiArr) {
            if(element instanceof Object[]){
                transformarArray((Object[])element, list);
            } else {
                list.add((Object)element);
            }
        }
        return list.toArray(new Object[list.size()]);
    }

    // 5- Dado un string, devolver un objeto/array que indique la palabra que mas veces se repite, y su cantidad.
    public Object[] palabraMasRepetida(String oracion){
        oracion = oracion.toLowerCase();
        String[] palabras = oracion.split(" ");
        int repeticiones = 0;
        String palabraRepetida = "";

        for (int i = 0; i < palabras.length; i++) {
            String aux = palabras[i];
            int contador = 1;
            for (int j = i + 1; j < palabras.length; j++) {
                if (aux.equalsIgnoreCase(palabras[j]))
                    contador++;
            }
            if (repeticiones < contador) {
               repeticiones = contador;
               palabraRepetida = aux;
            }
        }
        Object res[] = {palabraRepetida, repeticiones};
        return res;
    }

    // 6- Verificar si un string es un palíndromo.
    public boolean esPalindromo(String str)
    {
        int i = 0, j = str.length() - 1;
        String aux = str.toLowerCase();
        while (i < j) {
            if (aux.charAt(i) != aux.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
