package main;

import metodos.Cuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta test = new Cuenta("Test",1000);//Creamos un objeto llamado test
        // Usamos métodos del Objeto (Cuenta)
        System.out.println(test.toString());
        test.ingresarCuenta(1500);
        test.retirarCuenta(200.5);
        /*****************************************************/ 
        System.out.println(" ");
        Cuenta test2 = new Cuenta("Test2");//Creamos un objeto llamado test2
        // Usamos métodos del Objeto (Cuenta)
        System.out.println(test2.toString());
        test2.ingresarCuenta(-1000.50);
        test2.retirarCuenta(500);
        
    }
    
}
