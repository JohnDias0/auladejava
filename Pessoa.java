public class Pessoa {
    String name;
    int year;
    String direcao;

    public Pessoa(String nome, int idade){
        name = nome;
        year = idade;
    }
    public void andar(String direcao){
        System.out.println(name + " dá alguns passos a " + direcao);
    }
    public void pular(){
        System.out.println(name + "dá um pulo");
    }

    public static void main(String[] args) {
    Pessoa Jonathan = new Pessoa("Jonathan", 17);
    Jonathan.andar("para frente"); 
    }
}
