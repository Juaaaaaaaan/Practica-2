/**
@author Estructuras de Datos
 */
public class Pila {
    private Nodo cima;
    private int numElementos;

    public Pila() {
        cima = null;
        numElementos = 0;
    }

    public boolean vacia() {
        return cima == null;
    }

    public void apilar(int dato) {
        Nodo nuevo = new Nodo(dato, cima);
        cima = nuevo;
        numElementos++;
    }

    public int desapilar() {
        int valor =-999;
        if (this.vacia()) {
            System.out.println("Error, la pila está vacía");
            valor = '?';
        } else {
            valor = cima.getDato();
            cima = cima.getSiguiente();
            numElementos--;
        }
        return valor;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void mostrar() {
        Nodo auxiliar = cima;
        System.out.println("Contenido de la pila:");
        while (auxiliar != null) {
            System.out.println(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("FIN");
    }
}
