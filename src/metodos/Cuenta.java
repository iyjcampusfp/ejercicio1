package metodos;

public class Cuenta {
    // Creación de Atributos
    private String titular;
    private double cantidad;
    
    // Constructores
    public Cuenta( String titular ){
        this.titular = titular;
    }
    
    public Cuenta( String titular,double cantidad ){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters
    private String getTitular(){
        return this.titular;
    }
    
    private double getCantidad(){
        return this.cantidad;
    }
    
    private void setTitular( String titular ){
        this.titular = titular;
    }
    
    private void setCantidad( double cantidad ){
        this.cantidad = cantidad;
    }
    
    // Método toString
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
}
