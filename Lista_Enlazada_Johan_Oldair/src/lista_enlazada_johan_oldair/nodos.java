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
public class nodos {
    
int datos;
nodos dere;

    public nodos(int datos, nodos dere) {
        this.datos = datos;
        this.dere = dere;
    }

public nodos(int dato){
    this.datos=dato;
    this.dere=null;
}

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public nodos getDere() {
        return dere;
    }

    public void setDere(nodos dere) {
        this.dere = dere;
    }


}