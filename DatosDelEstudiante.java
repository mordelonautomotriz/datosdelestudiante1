/*
implemente un algoritmo que le permita solicitar el ingreso por teclado 
el nombre de la universidad, 
carrera,el departamento, 
el nombre de la materia, 
nombres completos del  del estudiante, 
nivel
numero de cedula, 
pais, ciudad, canton, provincia, ID, sexo.
*/
package datosdelestudiante;

/**
 *
 * @author HECTOR ORTIZ
 */
import java.util.Scanner;
public class DatosDelEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
        System.out.println("ingrese el nombre de la universidad: ");
        String nombreUniversidad=objeto.nextLine();
        
        System.out.println("ingrese el departamento: ");
        String departamento=objeto.nextLine();
        
        System.out.println("ingrese la carrera: ");
        String carera=objeto.nextLine();
        
        System.out.println("ingrese el nombre de la materia: ");
        String nombreMateria=objeto.nextLine();
        
        System.out.println("ingrese nombres completos del estudiante: ");
        String noombreEstudiante=objeto.nextLine();
        
        System.out.println("ingrese el nivel: ");
        String nivel=objeto.nextLine();
        
        System.out.println("ingrese el numero de cedula: ");
        String numeroCedula=objeto.nextLine();
        
        System.out.println("ingrese el pais: ");
        String pais=objeto.nextLine();
        
        System.out.println("ingrese la ciudad: ");
        String ciudad=objeto.nextLine();
        
        System.out.println("ingrese el canton: ");
        String canton=objeto.nextLine();
        
        System.out.println("ingrese la provincia: ");
        String provincia=objeto.nextLine();
        
        System.out.println("ingrese el ID: ");
        String ID=objeto.nextLine();
        
        System.out.println("ingrese el sexo: ");
        String sexo=objeto.nextLine();
        
        System.out.println("bienvenido ala universidad: " +nombreUniversidad);
        
       
        System.out.println("este es su primer programa en netbeens");
    }
    
}
