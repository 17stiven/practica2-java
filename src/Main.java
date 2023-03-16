public class Main {
    public static void main(String[] args) {

        CuentaDeAhorros cuenta=new CuentaDeAhorros(10000F, (float) 0.8);
        cuenta.consignar(5000);
        cuenta.retirar(2000);
        cuenta.extractoMensual();
        cuenta.imprimir();
    }
}