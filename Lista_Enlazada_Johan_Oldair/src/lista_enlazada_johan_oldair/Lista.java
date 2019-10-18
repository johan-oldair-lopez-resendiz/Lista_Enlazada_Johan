/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_enlazada_johan_oldair;

/**
 *
 * @author Alumno
 */
public class Lista {

    private nodos primero;
    private nodos ultimo;

    public Lista() {
        primero = ultimo = null;
    }

    
    public void borrar(int valor){
        nodos borr=primero;
        nodos borra=primero.getDere();
        while(borra!=null){
            if (borra.getDatos()>valor) {
                
            } else {
            }
        }
    }
    
    public void ingresar(int info) {
        nodos nuevo = new nodos(info);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setDere(nuevo);
            ultimo = nuevo;
        }

    }

    public void imprimir() { //Ricardo Arjona Historia de Taxi 

        nodos tomy = primero;
        while (tomy != null) {
            System.out.println(tomy.getDatos());
            tomy = tomy.getDere();
        }
    }

}
