import java.util.Arrays;

public class ejercicio02 {

	public static void main(String[] args) {
		int D = 8; // distancia de los libros
        int M = 1; // cantidad de amigos dispuestos a caminar D1
        int D1 = 15; // distancia máxima que puede caminar cada amigo de tipo M
        int N = 1; // cantidad de amigos dispuestos a caminar D2
        int D2 = 10; // distancia máxima que puede caminar cada amigo de tipo N
		
        /*int D = 11; // distancia de los libros
        int M = 1; // cantidad de amigos dispuestos a caminar D1
        int D1 = 15; // distancia máxima que puede caminar cada amigo de tipo M
        int N = 1; // cantidad de amigos dispuestos a caminar D2
        int D2 = 10; // distancia máxima que puede caminar cada amigo de tipo N*/
        
        int[] amigos = new int[M + N]; // array para guardar las distancias que pueden caminar los amigos
        
        // llenar el array con las distancias de los amigos de tipo M y N
        Arrays.fill(amigos, 0, M, D1);
        Arrays.fill(amigos, M, M + N, D2);
        
        // ordenar el array en orden ascendente
        Arrays.sort(amigos);

        D=D*2;
        System.out.println("Distancia para recorrer "+D);
        // recorrer el array de amigos y sumar las distancias hasta llegar a los libros
        int i = M + N - 1;//Cantidad total de amigos, iteracion o para recorrer en orden inverso
        int distanciaRecorrida = 0;
        while (distanciaRecorrida < D && i >= 0) {
            distanciaRecorrida += amigos[i];
            System.out.println("distanciaRecorrida "+distanciaRecorrida);
            i--;
        }
        
        // si todavía no se alcanzó la distancia de los libros, se necesitará a alguien más
        if (distanciaRecorrida < D) {
            System.out.println("-1 : Se necesitará a alguien más para llegar a los libros");
        } else {
            System.out.println("La cantidad minima de personas necesarias es: " + (M + N - i - 1));
        }
    }

}
