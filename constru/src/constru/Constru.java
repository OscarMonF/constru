/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package constru;
import java.util.Scanner;

/**

 *

 * @author Alumno

 */

public class Constru {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        Constru dis = new Constru();

        dis.aplicar();

    }

    private void aplicar() {
        
    }

    public class libro {

    String titulo ="";
    String autor="";
    int id =0;
    String editorial="";
    int cantidad =0;
    libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    libro(int numser){

        this.id = numser;
    }
    libro(String ED){
        this.editorial = ED;
    }
    libro(String ED, int numser){
        this.editorial = ED;
        this.id = numser;
    }
    public void combinar(){   };    
}
}