public class Carro {
    String Marca;
    String team;
    String name;
    int potência = (int) Math.ceil(Math.random() *100);
    int pneuhealth = (int) Math.ceil(Math.random() *100);
    int arranque;
    public Carro(String Marca, String team, String name, int arranque){
        this.Marca = Marca;
        this.team = team;
        this.name = name;
        this.arranque = arranque;
    };
    void arrancada(){
        System.out.println("O carro inicia com uma estrondosa arrancada e sai com tamanha velocidade");
        this.potência += 10;
        this.pneuhealth -= 5;
    };
    void correr(){
        System.out.println("O carro corre em disparada em uma velocidade impressionaante");
        this.pneuhealth -= 2;
    };
    void freio(){
        System.out.println("O carro aciona os freios, que tamanha esperteza do piloto");
        this.pneuhealth -= 10;
    };
    void cavalindepau(){
        System.out.println("Que ignoranciaaa!!! O carro" + this.name + "aciona os  freios e manda um drift ao final desta grande corrida, mostrando sua vitóriaaa!!!");
        this.pneuhealth -= 50;
    };
}
