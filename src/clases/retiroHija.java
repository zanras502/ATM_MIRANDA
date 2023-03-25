
package clases;

public class retiroHija extends atmPadre {
    
    @Override
    public void Transacciones(){
        
        System.out.println("*******************************");
        System.out.print("Cuanto dinero deseas retirar: ");
        Retiro();
        System.out.println("*******************************");
        
        if(retiro <= getSaldo ()){
            
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            
            System.out.println("*******************************");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("*******************************");   
            
        } else {
            System.out.println("*******************");
            System.out.println("Saldo insuficiente.");
            System.out.println("*******************");
        }
        
    }
    
}
