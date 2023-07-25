public class Main {

    // Primeiros passos para rodar um projeto java;
    // dentro do parenteses, em vez de ser (String[] args), é possivel utilizar (String... args), ou um var args de pontos
    // dessa maneira, estamos indefinindo quantas variáveis teremos em nossos sistema!
    // nesse caso, o "args" tbm é mais como padrão, podemos utilizar outros nomes, se quisermos.
    public static void main(String[] args) {

        // Utilizando sout, o sistema já traz o System.outprintln();
        System.out.println("Hello word");

        //Em java temos dois grupos de variáveis: primitivas e não primitivos.

        //Variáveis primitivas;

        //byte vai de -128 a 127
        //char 0 a 65535
        //int -2b a 2b
        //long -9t a 9t

        byte varivaelByte = -128;

        System.out.println(varivaelByte);
    }
}