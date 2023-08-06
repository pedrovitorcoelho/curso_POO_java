package animais;

public class Gato extends Animal{

    static int NumeroDeGatos;


    // Criando um constructor super, compativel com a classe Pai "Animal"
    public Gato(String nome, String cor) {
        super(nome, cor);
    }


    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Usando o método override, escrevemos por cima aquilo que é herdado em outra classe;
    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

}
