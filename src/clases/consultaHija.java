
package clases;


public class consultaHija extends atmPadre{
    
    @Override
    public void Transacciones(){
        System.out.println("*******************************");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("*******************************");
    }
    
}
