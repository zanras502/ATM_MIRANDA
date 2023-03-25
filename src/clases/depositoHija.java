
package clases;


public class depositoHija extends atmPadre{
    
    @Override
    public void Transacciones(){
        
        System.out.println("*******************************");
        System.out.println("Cual es el monto para depositar: ");
        System.out.println("*******************************");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        
        System.out.println("************************************");
        System.out.println("Realizaste un deposito de: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("************************************");
    }
    
}
