package laboratorio2;
import java.time.LocalDate;

public class CuentaCorriente {
    //Atributos
    private String rut;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int saldo;
    private LocalDate fechaCreacion= LocalDate.now(); 
    
//Métodos

    //Método Constructor
    public CuentaCorriente(String _rut, String _nombre, String _primerApellido, String _segundoApellido){
        rut=_rut;
        nombre=_nombre;
        primerApellido=_primerApellido;
        segundoApellido=_segundoApellido;
        saldo=0;
    }
    // Métodos de acceso
    public String getRut(){ //obtener rut
        return rut;
    }
    public String getNombre(){ //obtener nombre
        return nombre;
    }
    public String getApellido1(){ //obtener 1°Apellido
        return primerApellido;    
    }
    public String getApellido2(){ //obtener 2°Apellido
        return segundoApellido;
    }
    public LocalDate getFecha(){ //obtener fecha de cracion
        return fechaCreacion;
    }
    public int getSaldo(){
        return saldo;
    }
    //Mutadores
    public void setSaldo(int saldoNuevo){ //Cambiar el saldo
        saldo=saldoNuevo;
    }
    
    public void giro(int retiro){
            saldo-=retiro;
    }
    public void deposito(int depositar){
        saldo+=depositar;
    }
    
    
}
