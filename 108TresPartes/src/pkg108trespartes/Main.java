package pkg108trespartes;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Departamento dep1 = new Departamento();
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;

        do {
            System.out.println("Bienvenido al Mejor programa de organizacion RRHH");
            System.out.println("1añadirEmpleado:\n"
                    + "2BorrarEMpleado:\n"
                    + "3BuscarEmpleado:\n"
                    + "4MostrarDep:\n"
                    + "5:RevisarSueldos:\n"
                    + "6NuevoAño:\n");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    dep1.aniadirEmpleado();
                    break;
                case 2:
                    dep1.borrarEmpleado();
                    break;
                case 3:
                    dep1.buscarEmpleado();
                    break;

                case 4:
                    dep1.mostrarDepartamento();

                    break;
                case 5:
                    dep1.revisarSueldos();
                    break;
                case 6:
                    dep1.nuevoAnio();
                    break;
                case 7:
                    System.out.println(" Saliendo de la aplicacion");
            }
        } while (eleccion != 7);

    }

}
