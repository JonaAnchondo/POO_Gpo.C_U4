/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author invitado
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informacion info = new Informacion ("JGS","Sistemas",3);
        //encapsulamiento
        String NumCont = info.getNombre()+""+info.carrera()+""+info.semestre()+"";
        
        System.out.println("Datos del alumno: "+NumCont);
   
    }
    // se crean metodos
}
