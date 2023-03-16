public class CuentaDeAhorros extends Cuenta{
private boolean activa;

    public CuentaDeAhorros(float saldo, float tasaAnualPorcentaje) {
        super(saldo, tasaAnualPorcentaje);
        if (saldo<10000){
            this.activa=false;
        }else {
            this.activa=true;
        }
    }

    @Override
    public void consignar(float saldo) {
        if (this.activa){
            super.consignar(saldo);

        }else {
            System.out.println("La cuenta no está activa para poder consignar");
        }
    }

    @Override
    public void retirar(float saldo) {
        if (this.activa){
            super.retirar(saldo);

        }else {
            System.out.println("No se puede retirar porque la cuenta está inactiva");
        }

    }

    @Override
    public void imprimir() {
        System.out.println("Saldo: "+super.saldo+"\n" +
                "Número de transacciones: "+(super.numeroConsignaciones+super.numeroRetiros)+"\n" +
                "Comisión mensual: "+super.comisionMensual);
    }
}
