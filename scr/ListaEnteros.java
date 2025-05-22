package scr;

import java.util.ArrayList;

public class ListaEnteros {
    private ArrayList<Integer> lista;

    public ListaEnteros() {
        lista = new ArrayList<>();
    }

    public void agregar(int numero) {
        lista.add(numero);
    }

    public boolean eliminar(int numero) {
        return lista.remove(Integer.valueOf(numero));
    }

    public boolean contiene(int numero) {
        return lista.contains(numero);
    }

    public int obtener(int indice) {
        return lista.get(indice);
    }

    public int tamaño() {
        return lista.size();
    }

    public void imprimir() {
        System.out.println(lista);
    }
}
