import java.util.Scanner;

public class Ejercicio5Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int numeroEdades;
        int mujeresMayores = 0;
        int hombresMenores = 0;
        int edad;
        String sexo = "";
        numeroEdades = getInt("Ingrese número de edades");
        
        for(int i=0;i<numeroEdades;i++){
            edad = getInt("Ingrese la edad");
            sexo = getString("Ingrese sexo (F / M)");
            if (sexo.equals("F")){
                if(edad >= 18){
                    mujeresMayores++;
                }
            
            }
            else if(sexo.equals("M")){
                if(edad < 18){
                    hombresMenores++;
                }
            }
            else{
                System.out.println("No esta entre las opciones dadas");
            }
        }
        System.out.println("La cantidad de mujeres mayores de edad son: " + mujeresMayores + " y la cantidad de hombres menores de edad son: " + hombresMenores);
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }

    public static String getString(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }
        
        return n;
    }
}