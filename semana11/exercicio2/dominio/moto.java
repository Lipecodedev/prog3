public class Moto extends veiculo {
    protected int cilindradas;
    public Moto(String marca , String modelo,int ano ,int cilindradas){
super(marca,modelo,ano);
this.cilindradas = cilindradas;


   }
   public int getCilindradas(){
    return cilindradas;
}
}
