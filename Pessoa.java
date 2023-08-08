public class Pessoa {
    String name;
    int year;
    int height;
    int weight;
    int energy;

    public Pessoa(String name, int year, int height, int weight) {
        this.name = name;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

     void andar(String direcao) {
        System.out.println(this.name + " dá alguns passos a " + direcao);
    }

     void pular() {
        System.out.println(this.name + "dá um pulo");
    }

    void correr() {
        System.out.println("corre 10km");
    }
    void beber(String Bebida){
        System.out.println(this.name + " toma uma " + Bebida + " para recuperar suas energias.");
        this.energy += 3;
    }
    void comer(String Ref){
        System.out.println(this.name + "come um(a)" + Ref + "para recuperar suas energias.");
        this.energy += 9;
    }

}
