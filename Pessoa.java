public class Pessoa {
    String name;
    int year;
    int height;
    int weight;
    String direcao;
    String Bebida;
    String Ref;
    int energy;

    public Pessoa(String nome, int idade, int altura, int peso) {
        this.name = nome;
        this.year = idade;
        this.height = altura;
        this.weight = peso;
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
