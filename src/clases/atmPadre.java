
package clases;
import java.util.Scanner;


public abstract class atmPadre {
    
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do{
            do{
                System.out.println("Selecciona una opcion");
                System.out.println("    1.  Consulta de saldo.");
                System.out.println("    2.  Retiro de efectivo");
                System.out.println("    3.  Deposito de efectivo");
                System.out.println("    4.  Salir.");
                seleccion = entrada.nextInt();

                if(seleccion >= 1 && seleccion <= 4){
                    bandera = 1;
                } else{
                    System.out.println("**************************************************");
                    System.out.println("Opción no disponible, vuelta a intentar por favor");
                    System.out.println("**************************************************");
                } 
            }while(bandera == 0);    

            if(seleccion == 1){
                atmPadre mensajero = new consultaHija();
                mensajero.Transacciones();
                
            }else if(seleccion == 2){
                atmPadre mensajero = new retiroHija();
                mensajero.Transacciones();
                
            }else if(seleccion == 3){
                atmPadre mensajero = new depositoHija();
                mensajero.Transacciones();
                
            }else if(seleccion == 4){
                System.out.println("*************************");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("*************************");
                bandera = 2;
            }

        }while(bandera != 2);
    } 
    
    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();    
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //Metodo Abstracto
    public abstract void Transacciones();
    
    //Metodos Setter y Getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
