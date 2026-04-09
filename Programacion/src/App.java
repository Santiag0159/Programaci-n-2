public class App {
    public static void main(String[] args) throws Exception {
        
        Estudiante estudiante1 = new Estudiante("Santiago", "Morales", 24, "Programacion", 6.6);
        Estudiante estudiante2 = new Estudiante("Noelia", "Gonzalez", 25, "Programacion", 7.8);
        Estudiante estudiante3 = new Estudiante("Noelia","Gonzalez",25,"Programacion", 9.9);
        Estudiante estudiante4 = new Estudiante();

        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3, estudiante4};

        for (int i = 0; i < estudiantes.length; i++){
            System.out.println("Nombre: "+ estudiantes[i].getNombre());
            System.out.println("Promedio: "+ estudiantes[i].getPromedio());
        }
    }
}
