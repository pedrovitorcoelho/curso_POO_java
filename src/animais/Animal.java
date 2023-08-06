package animais;

// Estamos agora trabalhando com heranças, ou seja, em vez de ficarmos repetindo código por diversas vezes,
// vamos agora fazer outras classes, herdaram de uma classe pai os seus métodos, atributos, etc


// Com classes abstract nós utilizamos apenas como guia, ou seja, nele tudo é abstrato E NADA DEFINIDO!!!
public abstract class Animal {

    // Utilizando o método protected, para que outras classes possam acessar esses atributos
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    protected void comer(){}

    protected void dormir(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    // Nesse caso o método deve ser public, para que possa ser usado na main...
    // obs: caso queria ser exibido um som especifico para determinada classe, usamos o override (veja nas classe gato e passaro)
    public void soar() {}

    // Acima é um resultado com o que podemos fazer com abstract
}
