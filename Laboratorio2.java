package laboratorio2;

import java.util.Scanner;
import java.util.Arrays;
public class Laboratorio2 {
CuentaCorriente Cuentas [] = new CuentaCorriente [10];
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int k=1;
        int aux=0;
        CuentaCorriente Cuentas [] = new CuentaCorriente [10];
        do{
            System.out.println("--------------------------Menú--------------------------");
            System.out.println("Ingrese 1 para crear una cuenta corriente");
            System.out.println("Ingrese 2 para eliminar una cuenta  corriente");
            System.out.println("Ingrese 3 para girar en alguna cuenta corriente");
            System.out.println("Ingrese 4 para depositar en alguna cuenta corriente");
            System.out.println("Ingrese 5 para emitir un listado con todas las cuentas");
            System.out.println("Ingrese 6 para salir");
            System.out.println("--------------------------------------------------------");
            System.out.println("Ingrese un numero: ");
            int num=input.nextInt();
            while(num<1 || num>6){
                System.out.println("numero invalido, porfavor escoga del 1 al 5");
                System.out.println("Ingrese un numero: ");
                num=input.nextInt();
            }
            if(num==1){
                System.out.println("CREACION DE CUENTAS CORRIENTES");
                System.out.println("Ingrese Rut: ");
                String rut=input.next();
                for (int i = 0; i <aux; i++){
                    if(Cuentas[i]!=null){
                        while(rut.equals(Cuentas[i].getRut())){
                            System.out.println("Error, ese rut ya está registrado, ingrese un nuevo rut para continuar el proceso: ");
                            rut=input.next();
                        
                        }

                    }
        
                }
          
                System.out.println("Ingrese nombre: ");
                String nom= input.next();
                
                System.out.println("Ingrese su primer apellido: ");
                String last1= input.next();
                
                System.out.println("Ingrese su segundo apellido: ");
                String last2= input.next();
                
                Cuentas[aux]= new CuentaCorriente(rut,nom,last1,last2);
                aux++;    
                
            }
            else if(num==2){
                System.out.println("Eliminacion de cuenta corriente");
                if(aux==0){
                    System.out.println("No se han creado cuentas");
                }
                else{
                    for (int i = 0; i <aux; i++){
                        if(Cuentas[i]!=null){
                            System.out.println("Cuenta "+(i+1));
                            System.out.println("----------------------------------------------------");
                            System.out.println("Rut: "+ Cuentas[i].getRut());
                            System.out.println("Nombre: "+ Cuentas[i].getNombre());
                            System.out.println("Primer apellido: "+ Cuentas[i].getApellido1());
                            System.out.println("Segundo Apellido: "+ Cuentas[i].getApellido2());
                            System.out.println("Fecha de creacion: "+ Cuentas[i].getFecha());
                            System.out.println("----------------------------------------------------");
                   }
                 }
                    System.out.println("Ingrese el numero de la cuenta a eliminar: ");
                    int dcuenta= input.nextInt();
                    Cuentas[dcuenta-1]=null;
                 
                }
            
            }
            else if(num==3){
                System.out.println("GIRO");
                System.out.println("----------------------------------------------------");
                System.out.println("Ingrese el rut de la cuenta a girar");
                String rut=input.next();
                int c=0;
                for (int i = 0; i <aux; i++){
                    if(Cuentas[i]!=null){
                        if(rut.equals(Cuentas[i].getRut())){
                            System.out.println("Cuanto desea girar: ");
                            int dinero=input.nextInt();
                            if(Cuentas[i].getSaldo()-dinero>0){
                                Cuentas[i].giro(dinero);
                                System.out.println("Retiro a Cuenta "+(i+1));
                                System.out.println("---------------------BOLETA-------------------------");
                                System.out.println("Rut: "+ Cuentas[i].getRut());
                                System.out.println("Nombre: "+ Cuentas[i].getNombre());
                                System.out.println("Primer apellido: "+ Cuentas[i].getApellido1());
                                System.out.println("Segundo Apellido: "+ Cuentas[i].getApellido2());
                                System.out.println("Fecha de creacion: "+ Cuentas[i].getFecha());
                                System.out.println("Monto de giro: "+dinero+",Saldo actualizado: "+ Cuentas[i].getSaldo());
                                System.out.println("----------------------------------------------------");
                            }
                            else
                                System.out.println("Error, Lo sentimos, el monto que desea girar supera el saldo de la cuenta");
                                
                            
                            c=1;
                    }
                }
                }
                if(c==0)
                    System.out.println("No se ha encontrado ninguna cuenta con ese rut");    
            }
            else if(num==4){
                System.out.println("DEPOSITO");
                System.out.println("----------------------------------------------------");
                System.out.println("Ingrese el rut de la cuenta a depositar");
                String rut=input.next();
                int z=0;
                for (int i = 0; i <aux; i++){
                    if(Cuentas[i]!=null){
                        if(rut.equals(Cuentas[i].getRut())){
                            System.out.println("Cuanto desea depositar: ");
                            int dinero=input.nextInt();
                            Cuentas[i].deposito(dinero);
                            System.out.println("Deposito a Cuenta "+(i+1));
                            System.out.println("---------------------BOLETA-------------------------");
                            System.out.println("Rut: "+ Cuentas[i].getRut());
                            System.out.println("Nombre: "+ Cuentas[i].getNombre());
                            System.out.println("Primer apellido: "+ Cuentas[i].getApellido1());
                            System.out.println("Segundo Apellido: "+ Cuentas[i].getApellido2());
                            System.out.println("Fecha de creacion: "+ Cuentas[i].getFecha());
                            System.out.println("Monto depositado: "+dinero+",Saldo actualizado: "+ Cuentas[i].getSaldo());
                            System.out.println("----------------------------------------------------");
                            z=1;
                        }
                    }                        
                }
                if(z==0)
                        System.out.println("No se ha encontrado ninguna cuenta con ese rut");
            
            }
            else if(num==5){
                int n=0;
                System.out.println("Listado de cuentas");
                for (int i = 0; i <aux; i++){
                        if(Cuentas[i]!=null){
                            System.out.println("Cuenta "+(i+1));
                            System.out.println("----------------------------------------------------");
                            System.out.println("Rut: "+ Cuentas[i].getRut());
                            System.out.println("Nombre: "+ Cuentas[i].getNombre());
                            System.out.println("Primer apellido: "+ Cuentas[i].getApellido1());
                            System.out.println("Segundo Apellido: "+ Cuentas[i].getApellido2());
                            System.out.println("Fecha de creacion: "+ Cuentas[i].getFecha());
                            System.out.println("----------------------------------------------------");
                            n=1;
                   }
                 }
                if(n==0)
                    System.out.println("No hay ninguna cuenta por el momento");
                    
            
            }
            else
                k=0;

        }
        while(k==1);

    }
    
}
