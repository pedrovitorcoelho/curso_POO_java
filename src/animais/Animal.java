package animais;

// Estamos agora trabalhando com heranças, ou seja, em vez de ficarmos repetindo código por diversas vezes,
// vamos agora fazer outras classes, herdaram de uma classe pai os seus métodos, atributos, etc

public class Animal {

    // Utilizando o método protected, para que outras classes possam acessar esses atributos
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    protected void comer(){}

    protected void dormir(){

    }

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    // Nesse caso o método deve ser public, para que possa ser usado na main...
    // obs: caso queria ser exibido um som especifico para determinada classe, usamos o override (veja nas classe gato e passaro)
    public void soar() {
        System.out.println(" Cri Cri ");
    }

}
