public class Piloto extends Pessoa {
    String team;
    int hability = (int) Math.ceil(Math.random() * 100);
    int stamina = (int) Math.ceil(Math.random() * 100);

    Piloto(String name, int year, int height, int weight, String direcao, String Bebida, String Ref, int energy, String team) {
        super(Ref, height, weight, energy);
        this.team = team;
}
}
