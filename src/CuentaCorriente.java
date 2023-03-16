public class CuentaCorriente extends Cuenta{
private float sobreGiro=0;


    public CuentaCorriente(float saldo, float tasaAnualPorcentaje) {
        super(saldo, tasaAnualPorcentaje);
    }

    @Override
    public void retirar(float saldo) {
        super.saldo=super.saldo-saldo;
        if (super.saldo<0){
            this.sobreGiro=super.saldo*(-1);
            super.saldo=0;
        }
    }

    @Override
    public void consignar(float saldo) {
        if (this.sobreGiro>0){
            saldo=saldo-this.sobreGiro;
            if (saldo<0){
                this.sobreGiro=saldo*(-1);
saldo=0;
            }

        }
        super.consignar(saldo);
    }


    @Override
    public void imprimir() {
        System.out.println("Saldo: "+super.saldo+"\n" +
                "Número de transacciones: "+(super.numeroConsignaciones+super.numeroRetiros)+"\n" +
                "Sobregiro: "+this.sobreGiro);
    }
}
