// import java.util.Scanner;

public class Person{

    public String DNI;

    public String Nombre;

    public String Direccion;

    public int Edad;
    

    public void Ingresar(){

        C.print("Ingrese su Nombre: ");
        this.Nombre = Input.input.nextLine();
        C.print("Ingrese su Edad: ");
        this.Edad = input.nextInt();
        C.print("Ingrese su numero de identidad: ");
        this.DNI = input.nextLine();
        
        C.print("Ingrese su Direccion: ");
        this.Direccion = input.nextLine();

    }


    public void Presentar(){

        C.println("\nPersona: " + this.Nombre);
        C.println("Numero de identidad: " + this.DNI);
        C.println("Direccion: " + this.Direccion);
        C.println("Edad: " + this.Edad);
    
    }


}