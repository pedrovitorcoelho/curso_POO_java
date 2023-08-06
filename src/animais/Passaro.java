package animais;

public class Passaro extends Animal{

    static int NumeroDePassaros;


    // Criando um método constructor compativel com a classe Pai
    public Passaro(String nome, String cor) {
        super(nome, cor);
    }

    // Usando o método override, escrevemos por cima aquilo que é herdado em outra classe;
    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
