package animais;

public class Cachorro {

// nessa situação, estamos pondo como "public", pois poderá ser acessado em todo lugar
// é importante falar que não estamos atribuindo valor as variáveis, pois uma vez atribuidas nesse espaço, esse valor será global
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public String sentimento;

    // Vamos agora gerar um método PUBLICO (public) e que não retorna NADA, ou seja, não traz nenhuma informação quando é ativado (VOID)
    public void latir() {
        // aqui estamos apenas imprimindo em tela, é diferente de retornar, que pode vir várias vezes
        System.out.println("Wouf Wouf");
    }

    // Agora vamos trabalhar com um método que tem um retorno, ou seja, ele irá retornar uma STRING.
    // Então em vez de ser um VOID, será uma String
    public String pegar() {
        return "bolinha";
    }

    // vamos fazer mais um método, onde dessa vez iremos introduzi um parametro, e dependendo do resultado, retornara algo diferente

    public String interagir (String acao) {
        // Nesse caso, podemos usar o equals quando desejamos fazer uma comparação também!
        if (acao.equals("carinho")){
            return sentimento = "feliz";
        } else if (acao == "bronca") {
            return sentimento = "assustado";
        } else {
            return sentimento = "tedio";
        }
    }
}
