import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList alumnos = DATA.ListaDeAlumnos();
       for( Object cadaAlumno : alumnos){
           System.out.println(cadaAlumno);
       }





    }
}