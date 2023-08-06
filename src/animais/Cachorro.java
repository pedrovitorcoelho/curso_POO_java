package animais;

public class Cachorro {

    // VARIÁVEIS / ATRIBUTOS

// nessa situação, estamos pondo como "public", pois poderá ser acessado em todo lugar
// é importante falar que não estamos atribuindo valor as variáveis, pois uma vez atribuidas nesse espaço, esse valor será global
//    public String nome;
//    public String cor;
//    public int altura;
//    public double peso;
//    public String sentimento;

    // VAMOS AGORA FALAR SOBRE MÉTODOS DE ACESSO:

    //public; protected; deafault; private;
    //É através desse métodos de acesso que teremos como pegamos variáveis

    static int numeroDeCachorro;
    // Com a variável static, estamos atribuindo ela a todos os objetos da classe, dessa forma conseguindo sabe quantos objetos estamos trabalhando
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String sentimento;

    // CONSTRUTORES

    //Todo objeto possui um construtor padrão, default, quando criado, dessa forma
    //Construtor padrão
    public Cachorro(){}

    //Gerando uns construtor adicional
    public Cachorro(String nome, String cor, int altura, double peso, String sentimento) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.sentimento = sentimento;

        //Contando toda vez que um objeto é criando com esse construtor em especifico;
        numeroDeCachorro++;
    }


    // MÉTODOS

    // Com o private, só conseguimos acessar variáveis na mesma classe. Então, para que possamos acessar em outra classe, devemos fazer o seguinte:

    // GET, é que é pegar


    // Obtendo o valor
    public static int getNumeroDeCachorro() {
        return numeroDeCachorro;
    }

    public String getNome() {
        // Mas porque assim ?
        // Dessa forma conseguimos limitar quem pode ou não retornar esse valor,
        return nome;
    }

    // set, no caso DAR um valor
    public void setNome(String nome) {
        //Nessa situação, estamos atribuindo o valor de um parametro, a variável privada da classe
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

    public String getSentimento() {
        return sentimento;
    }


    // Vamos agora gerar um método PUBLICO (public) e que não retorna NADA, ou seja, não traz nenhuma informação quando é ativado (VOID)
    public void soar() {
        // aqui estamos apenas imprimindo em tela, é diferente de retornar, que pode vir várias vezes
        System.out.println("AU AU");
    }

    // Agora vamos trabalhar com um método que tem um retorno, ou seja, ele irá retornar uma STRING.
    // Então em vez de ser um VOID, será uma String
    public String pegar() {
        return "bolinha";
    }

    // vamos fazer mais um método, onde dessa vez iremos introduzi um parametro, e dependendo do resultado, retornara algo diferente

    public String interagir (String acao) {
        // Trabalhando com SWITCH/CASE

        // Switch em JAVA funciona com int, string e enum(pesquisar melhor depois)
        switch (acao) {
            // Utilizando o this, nós conseguimos trazer mais evidência a qual variável estamos falando.
            case "carinho": this.sentimento = "feliz";break;
            case "bronca": this.sentimento = "assustado";break;
            default: this.sentimento = "tedio";break;
        }

        return sentimento;

//        // Nesse caso, podemos usar o equals quando desejamos fazer uma comparação também!
//        if (acao.equals("carinho")){
//            return sentimento = "feliz";
//        } else if (acao == "bronca") {
//            return sentimento = "assustado";
//        } else {
//            return sentimento = "tedio";
//        }
    }

    // Método Override...

    // Dessa foram, conseguimos reconhecer e imprimir objetos, em vez de exibir na memória...
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
