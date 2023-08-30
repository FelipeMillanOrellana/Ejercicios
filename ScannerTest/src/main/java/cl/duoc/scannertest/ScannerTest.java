package cl.duoc.scannertest; 

import cl.duoc.scannertest.Models.Persona;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setId(10);
        p1.setNombre("Felipe");
        p1.setApellido("Millán");
        p1.setBirthday(2001,01,15);
        p1.setRut("20.647.283-9");
        p1.setDireccion("Los Salessianos #4784");
        p1.setCasado(true);
        
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        
        System.out.println(p2.getId());
        System.out.println(p3.getId());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre= sc.nextLine();
        System.out.println("Hola "+nombre+"Welcome!");
    }
}
