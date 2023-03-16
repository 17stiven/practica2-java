public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnualPorcentaje=0;
    protected float comisionMensual=0;

    public Cuenta(float saldo, float tasaAnualPorcentaje) {
        this.saldo = saldo;
        this.tasaAnualPorcentaje = tasaAnualPorcentaje;
    }

    public void consignar(float saldo){
        this.saldo=this.saldo+saldo;
        this.numeroConsignaciones++;
    }

    public void retirar(float saldo) {
        if (this.saldo >= saldo) {
            this.saldo = this.saldo - saldo;
            this.numeroRetiros++;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

   public void extractoMensual(){
        this.saldo=this.saldo*(1-this.comisionMensual);
   }

   public void imprimir(){
       System.out.println("Saldo: "+this.saldo+"\n" +
               "Numero de consignaciones: "+this.numeroConsignaciones+"\n" +
               "Numero de retiros: "+this.numeroRetiros+"\n" +
               "tasa anual de porcentaje: "+this.tasaAnualPorcentaje+"\n" +
               "Comisión mensual: "+this.comisionMensual);
   }
}
