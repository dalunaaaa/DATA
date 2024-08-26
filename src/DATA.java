import java.util.ArrayList;
import java.util.List;

public class DATA {
 // BASE DE DATOS
public static ArrayList ListaDeAlumnos(){
    ArrayList<Alumno> alumnos = new ArrayList<>();
    alumnos.add(new Alumno("Ricardo","nuñez", 19));
    alumnos.add(new Alumno("andrea","marinelli", 17));
    alumnos.add(new Alumno("Isaac","Maldonado", 16));
    alumnos.add(new Alumno("philipe","echeverria", 25));
    alumnos.add(new Alumno("jose","borroco", 20));
    return alumnos;

}
}
