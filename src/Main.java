// Importando o package de animais;

import animais.Cachorro;

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

        // criando um objeto

        //classe-> variável que vai ficar na memoria e será o objeto -> instanciando;
        Cachorro cachorro1 = new Cachorro();

        // Inserindo valores das variáveis, com método SET, ou seja QUE PEGA
        cachorro1.setNome("Luna");
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(5);
        cachorro1.setPeso(5.2);



//        cachorro1.nome="peter";
//        cachorro1.cor="amarelo";
//        cachorro1.altura=25;
//        cachorro1.peso=13.4;

        // imprimindo isso, será exibido o endereço na memória criado com esse objeto!
        // System.out.println(cachorro1);

        // veja que aqui retornará apenas o que está escrito lá dentro
        cachorro1.latir();

        // Vamos exibir um método que irá retornar algo, porém como não temos nenhuma exibição em tela, vamos por dentro de um sount
        System.out.println(cachorro1.pegar());

        // Trazendo um método com condições e parametro

        System.out.println(cachorro1.interagir("carinho"));


    }
}