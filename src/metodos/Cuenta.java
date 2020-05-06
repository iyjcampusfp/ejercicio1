package metodos;

public class Cuenta {
                                    // Atributos
    // Creación de Atributos (Titular de la Cuenta y Cantidad de dinero)
    private String titular;
    private double cantidad;
    /*****************************************************************************************/
                            // Constructores (Dos Constructores)
                    // Definición: Queremos que cantidad sea opcinal en el Constructor
    /******************************************************************************************/
    // 1º Constructor solo Un parámetro que será el titular
    public Cuenta( String titular ){
        this.titular = titular;
    }
    
    // 2ºConstructor Dos parámetros , con la cantidad como opcional.
    public Cuenta( String titular,double cantidad ){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    /******************************************************************************************/
                                // Getters y Setters
    // Getters
    private String getTitular(){
        return this.titular;
    }
    
    private double getCantidad(){
        return this.cantidad;
    }
    
    // Setters
    private void setTitular( String titular ){
        this.titular = titular;
    }
    
    private void setCantidad( double cantidad ){
        this.cantidad = cantidad;
    }
    /**********************************************************************************************/
                                            // Método toString
    // Explicación:Realizamos un try y un catch , para comprobar si cantidad existe.
    @Override
    public String toString(){
        String textoADevolver;
        
        if(getCantidad() != 0 ){
            textoADevolver = getTitular() + " tiene la cantidad de  : " + getCantidad() + ".";
        }else{
            textoADevolver = getTitular() + " tiene la cuenta vacía.";
        }
     
        return textoADevolver;
    }
    /**********************************************************************************************/
                                // Métodos Personales
    // Método Ingresar
    // Descripción:
    /* Este método recibe un parámetro double, el cuál se sumará a la cantidad del titular.
     * En caso de que introduzca una cantidad negativa, no hará nada.
     */
    public void ingresarCuenta( double ingresos ){
        
        if( ingresos>=0 ){
            setCantidad( getCantidad() + ingresos );
            System.out.println("-----------------------------------------------");
            System.out.println( "El ingreso se ha efectuado." );
            System.out.println( "El titular " + getTitular() + " tiene " + getCantidad() );
            System.out.println("-----------------------------------------------");
        }else{
            System.out.println("-----------------------------------------------");
            System.out.println( "El ingreso no se ha efectuado." );
            System.out.println( "El titular " + getTitular() + " tiene " + getCantidad() );
            System.out.println("-----------------------------------------------");
        }
    }
    
    // Método Retirar
    // Descripción:
    /* Este método recibe un parámetro de cantidad , con el cuál creo una variable llamada calculo,
    para comprobar que la cantidad retirada con la cantidad del titular, no sea mayor a está y si lo fuera que su cantidad,
    es decir su saldo, sea 0.
    */
     public void retirarCuenta(double retirar){
        double calculo = (getCantidad()-retirar);
        
        if(calculo <=0){
            setCantidad(0);
            System.out.println("-----------------------------------------------");
            System.out.println( "El saldo de la cuenta está vacío." );
            System.out.println("La cuenta del titular : " + getTitular() + " tiene este saldo : " + getCantidad());
            System.out.println("-----------------------------------------------");
        }else{
            setCantidad(calculo);
            System.out.println("-----------------------------------------------");
            System.out.println( "Se ha retirado : " + retirar + "." );
            System.out.println("La cuenta del titular : " + getTitular() + " tiene este saldo : " + getCantidad());
            System.out.println("-----------------------------------------------");
        }
    }
    
    

}
