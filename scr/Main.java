package scr;

public class Main {
    public static void main(String[] args) {
        ListaEnteros miLista = new ListaEnteros();

        miLista.agregar(5);
        miLista.agregar(10);
        miLista.agregar(15);
        miLista.imprimir(); // Muestra [5, 10, 15]

        miLista.eliminar(10);
        miLista.imprimir(); // Muestra [5, 15]

        System.out.println("Contiene 5: " + miLista.contiene(5)); // true
        System.out.println("Elemento en índice 1: " + miLista.obtener(1)); // 15
        System.out.println("Tamaño: " + miLista.tamaño()); // 2
    }
}
