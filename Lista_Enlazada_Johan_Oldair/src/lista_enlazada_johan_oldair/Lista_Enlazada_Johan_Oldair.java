/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_enlazada_johan_oldair;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Lista_Enlazada_Johan_Oldair {

    public static void main(String[] args) {
       Lista opcion = new Lista();
        int objeto=0;
        
  do{
         objeto =Integer.parseInt(JOptionPane.showInputDialog("Eliga una de las siguientes opciones "
                + "\n 1.- Llene la lista con numeros enteros solamente " 
                + "\n 2.- Ver lsita llenada"
                + "\n 3.- Salir"));
        
        
   switch(objeto)
   {
   case 1:
   {
    int nuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento que desee ingresar a la lista:"));
    opcion.ingresar(nuevo);
    break;
   }
   case 2:
   {
    System.out.println("lista Llena:");
    opcion.imprimir();
    break;
   }

   case 3:
   {
    System.out.println("FIN DEL PROGRAMA");
    break;
   }
   }
  }while(objeto!=3);
 }
}
        
    


