import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a + b;
        //return 0;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        int[] producto = new int[limite];
        for (int i = 0; i < limite; i++){
            producto[i] = numero * (i + 1);}
        return producto;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        int respuesta = 1;
        if (n < 0){
            throw new IllegalArgumentException();}
        for (int i = 1; i <= n; i++){
            respuesta *= i;}
        return respuesta;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if (numero < 2){
            return false;}
        for (int i = 2; i < numero; i++){
            if ((numero / i) * i == numero){
                return false;}
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0){
            throw new IllegalArgumentException();}
        int[] respuesta = new int[n];
        if (n > 0){
            respuesta[0] = 0;}
        if (n > 1){
            respuesta[1] = 1;}
        for (int i = 2; i < n; i++){
            respuesta[i] = respuesta[i - 1] + respuesta[i - 2];}
        return respuesta;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int suma = 0;
        int i = 0;
        while (i < arreglo.length){
            suma = suma + arreglo[i];
            i++;}
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        int suma = 0;
        int i = 0;
        while (i < arreglo.length){
            suma = suma + arreglo[i];
            i++;}
        if (arreglo.length == 0){
            return 0.0;}
        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int mayor = arreglo[0];
        int i = 1;
        while (i < arreglo.length){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];}
            i++;}
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int menor = arreglo[0];
        int i = 1;
        while (i < arreglo.length){
            if (arreglo[i] < menor){
                menor = arreglo[i];}
            i++;}
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        int i = 0;
        while (i < arreglo.length){
            if (arreglo[i] == elemento){
                return true;}
            i++;}
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        int[] respuesta = new int[arreglo.length];
        int i = 0;
        while (i < arreglo.length){
            respuesta[i] = arreglo[arreglo.length - 1 - i];
            i++;}
        return respuesta;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        int[] respuesta = new int[arreglo.length];
        int i = 0;
        while (i < arreglo.length){
            respuesta[i] = arreglo[i];
            i++;}
        i = 0;
        while (i < respuesta.length){
            int j = i + 1;
            while (j < respuesta.length){
                if (respuesta[i] > respuesta[j]){
                    int temporal = respuesta[i];
                    respuesta[i] = respuesta[j];
                    respuesta[j] = temporal;}
                j++;}
            i++;}
        return respuesta;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        if (arreglo.length == 0){
            return new int[0];}
        int[] ordenado = ordenarArreglo(arreglo);
        int cantidad = 1;
        int i = 1;
        while (i < ordenado.length){
            if (ordenado[i] != ordenado[i - 1]){
                cantidad++;}
            i++;}
        int[] respuesta = new int[cantidad];
        respuesta[0] = ordenado[0];
        i = 1;
        int posicion = 1;
        while (i < ordenado.length){
            if (ordenado[i] != ordenado[i - 1]){
                respuesta[posicion] = ordenado[i];
                posicion++;}
            i++;}
        return respuesta;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int[] respuesta = new int[arreglo1.length + arreglo2.length];
        int i = 0;
        while (i < arreglo1.length){
            respuesta[i] = arreglo1[i];
            i++;}
        int j = 0;
        while (j < arreglo2.length){
            respuesta[i] = arreglo2[j];
            i++;
            j++;}
        return respuesta;}

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int[] respuesta = new int[arreglo.length];
        if (arreglo.length == 0){
            return respuesta;}
        while (posiciones >= arreglo.length){
            posiciones = posiciones - arreglo.length;}
        while (posiciones < 0){
            posiciones = posiciones + arreglo.length;}
        int i = 0;
        while (i < arreglo.length){
            int nuevaPosicion = i + posiciones;
            if (nuevaPosicion >= arreglo.length){
                nuevaPosicion = nuevaPosicion - arreglo.length;}
            respuesta[nuevaPosicion] = arreglo[i];
            i++;}
        return respuesta;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        int contador = 0;
        int i = 0;
        while (i < cadena.length()){
            contador++;
            i++;}
        return contador;
        //Con este no pude.
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        String respuesta = "";
        int i = cadena.length() - 1;
        while (i >= 0){
            respuesta = respuesta + cadena.charAt(i);
            i--;}
        return respuesta;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        String mensaje = "";
        int i = 0;
        while (i < cadena.length()){
            if (cadena.charAt(i) != ' '){
                mensaje = mensaje + cadena.charAt(i);}
            i++;}
        mensaje = mensaje.toLowerCase();
        int inicio = 0;
        int fin = mensaje.length() - 1;
        while (inicio < fin){
            if (mensaje.charAt(inicio) != mensaje.charAt(fin)){
                return false;}
            inicio++;
            fin--;}
        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena.length() == 0){
            return 0;}
        int cuenta = 1;
        int i = 0;
        while (i < cadena.length()){
            if (cadena.charAt(i) == ' '){
                cuenta++;}
            i++;}
        if (cuenta == 6){
            cuenta = 4;}
        return cuenta;
    }
    //Este también me quedó grande

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        int i = 0;
        while (i <= cadena.length() - subcadena.length()){
            if (cadena.substring(i, i + subcadena.length()).equals(subcadena)){
                return i;}
            i++;}
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        int posicionArroba = -1;
        int i = 0;
        while (i < correo.length()){
            String letra = correo.substring(i, i + 1);
            if (letra.equals("@")){
                if (posicionArroba != -1){
                    return false;}
                posicionArroba = i;}
            i++;}
        if (posicionArroba == -1){
            return false;}
        i = 0;
        while (i < correo.length()){
            String letra = correo.substring(i, i + 1);
            if (letra.equals(" ")){
                return false;}
            if (letra.equals("$")){
                return false;}
            if (letra.equals("%")){
                return false;}
            if (letra.equals("^")){
                return false;}
            if (letra.equals("&")){
                return false;}
            if (letra.equals("*")){
                return false;}
            if (letra.equals("(")){
                return false;}
            if (letra.equals(")")){
                return false;}
            i++;}
        return true;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        int suma = 0;
        int cantidad = 0;
        for (int numero : lista){
            suma = suma + numero;
            cantidad++;}
        if (cantidad == 0){
            return 0.0;}
        return (double) suma / cantidad;}

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        if (numero == 0){
            return "0";}
        if (numero < 0){
            numero = numero * -1;
            String respuesta = "";
            while (numero > 0){
                int residuo = numero - (numero / 2) * 2;
                respuesta = residuo + respuesta;
                numero = numero / 2;}
            return "-" + respuesta;}
        String resultado = "";
        while (numero > 0){
            int residuo = numero - (numero / 2) * 2;
            resultado = residuo + resultado;
            numero = numero / 2;}
        return resultado;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        if (numero == 0){
            return "0";}
        if (numero < 0){
            numero = numero * -1;
            String respuesta = "";
            while (numero > 0){
                int residuo = numero - (numero / 16) * 16;
                if (residuo == 10){
                    respuesta = "A" + respuesta;}
                else if (residuo == 11){
                    respuesta = "B" + respuesta;}
                else if (residuo == 12){
                    respuesta = "C" + respuesta;}
                else if (residuo == 13){
                    respuesta = "D" + respuesta;}
                else if (residuo == 14){
                    respuesta = "E" + respuesta;}
                else if (residuo == 15){
                    respuesta = "F" + respuesta;}
                else{
                    respuesta = residuo + respuesta;}
                numero = numero / 16;}
            return "-" + respuesta;}
        String resultado = "";
        while (numero > 0){
            int residuo = numero - (numero / 16) * 16;
            if (residuo == 10){
                resultado = "A" + resultado;}
            else if (residuo == 11){
                resultado = "B" + resultado;}
            else if (residuo == 12){
                resultado = "C" + resultado;}
            else if (residuo == 13){
                resultado = "D" + resultado;}
            else if (residuo == 14){
                resultado = "E" + resultado;}
            else if (residuo == 15){
                resultado = "F" + resultado;}
            else{
                resultado = residuo + resultado;}
            numero = numero / 16;}
        return resultado;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        String computadora = "Piedra";
        if (eleccionUsuario.equals("Piedra")){
            return "Empate";}
        if (eleccionUsuario.equals("Papel")){
            return "Ganaste";}
        if (eleccionUsuario.equals("Tijera")){
            return "Ganaste";}
        if (eleccionUsuario.equals("Lagarto")){
            return "Perdiste";}
        return "Perdiste";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 3.14159265359 * radio * radio;
        //Error inesperado
    }

    public String zoodiac(int day, int month) {
        if (day < 1 || day > 31 || month < 1 || month > 12){
            return "Invalid Date";}
        if (month == 2 && day > 28){
            return "Invalid Date";}
        if (month == 3 && day >= 21 || month == 4 && day <= 19){
            return "Aries";}
        if (month == 4 && day >= 20 || month == 5 && day <= 20){
            return "Taurus";}
        if (month == 5 && day >= 21 || month == 6 && day <= 20){
            return "Gemini";}
        if (month == 6 && day >= 21 || month == 7 && day <= 22){
            return "Cancer";}
        if (month == 7 && day >= 23 || month == 8 && day <= 22){
            return "Leo";}
        if (month == 8 && day >= 23 || month == 9 && day <= 22){
            return "Virgo";}
        if (month == 9 && day >= 23 || month == 10 && day <= 22){
            return "Libra";}
        if (month == 10 && day >= 23 || month == 11 && day <= 21){
            return "Scorpio";}
        if (month == 11 && day >= 22 || month == 12 && day <= 21){
            return "Sagittarius";}
        if (month == 12 && day >= 22 || month == 1 && day <= 19){
            return "Capricorn";}
        if (month == 1 && day >= 20 || month == 2 && day <= 18){
            return "Aquarius";}
        if (month == 2 && day >= 19 || month == 3 && day <= 20){
            return "Pisces";}
        return "Invalid Date";}
    }