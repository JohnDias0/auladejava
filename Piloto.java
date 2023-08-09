public class Piloto extends Pessoa {
    String team;
    int hability = (int) Math.ceil(Math.random() * 100);
    int stamina = (int) Math.ceil(Math.random() * 100);

    Piloto(String name, int year, int height, int weight, String direcao, String Bebida, String Ref, int energy, String team) {
        super(Ref, height, weight, energy);
        this.team = team;
}
    void corrida(){
        System.out.println(super.name + " da a partida no carro e inicia a corrida com uma arrancada magnifica digna de um filme do Velozes e Furiosos.");
        this.stamina -= 1; 
    }
    void acelerar(){
        if(this.stamina < 4 && this.hability <= 10){
            System.out.println("O piloto " + super.name + " inicia uma investida arriscada e tenta conquistar o seu lugar na corrida");
            System.out.println("Mas acaba perdendo o controle do carro  e perde a corrida");
        };
        if(this.stamina >= 4 && this.hability > 10){
            System.out.println("O piloto " + super.name + " inicia uma investida  arriscada e tenta conquistar o seu lugar na corrida");
            System.out.println("Inacreditável!!! Ele ascende com maestria ao primeiro lugar. É o  graaanddeee, é o maior dos maiores, é o extraordinário " + super.name + "!!!!!!!!!!");
        };
    }
}
