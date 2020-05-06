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
        
        try{
            textoADevolver = this.titular + " tiene " + this.cantidad;
        }catch(Exception e){
            textoADevolver = "El titular es: " + this.titular;
        }
        
        return textoADevolver;
    }
    /**********************************************************************************************/
    // Métodos Personales
    
    public void ingresarCuenta( double ingresos ){
        
        if( cantidad>=0 ){
            setCantidad( getCantidad() + ingresos );
            System.out.println( "El cambio se ha efectuado." );
            System.out.println( "El titular " + getTitular() + " tiene " + getCantidad() );
        }else{
            System.out.println( "El cambio no se ha efectuado." );
            System.out.println( "El titular " + getTitular() + " tiene " + getCantidad() );
        }
        
    }

}
