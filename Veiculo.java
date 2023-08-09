public class Veiculo extends Carro {
    Veiculo(String name, String Marca , String team, int potencia,int pneuhealth) {
        super(Marca, team, name, pneuhealth);
}
    int motor = (int) Math.ceil(Math.random() *100);
    int healthycar = (int) Math.ceil(Math.random() *100);
    Boolean status = true;
    // true - movimento
    // false - parado

    void capotar(){
        System.out.println("O carro capotaaa");
        this.healthycar -= 50;
    }
    void conserto(){
        System.out.println("O carro passa rapidamente pela parada para receber alguns reparos");
    }
}
