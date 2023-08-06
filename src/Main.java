// Importando o package de animais;

import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

import java.sql.SQLOutput;

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
        System.out.println(cachorro1.getNumeroDeCachorro());




        //Usando o contructor, em vez da forma feita anteriormente, para pegar as variáveis


        Cachorro cachorro2 = new Cachorro("Luna", "Marrom", 5, 5.2, "nada");
        System.out.println(cachorro2.getNumeroDeCachorro());



//        // Inserindo valores das variáveis, com método SET, ou seja QUE PEGA
//        cachorro1.setNome("Luna");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(5);
//        cachorro1.setPeso(5.2);



//        cachorro1.nome="peter";
//        cachorro1.cor="amarelo";
//        cachorro1.altura=25;
//        cachorro1.peso=13.4;

        // imprimindo isso, será exibido o endereço na memória criado com esse objeto!
        // System.out.println(cachorro1);

        // veja que aqui retornará apenas o que está escrito lá dentro
//        cachorro1.latir();

        // Vamos exibir um método que irá retornar algo, porém como não temos nenhuma exibição em tela, vamos por dentro de um sount
        System.out.println(cachorro1.pegar());

        // Trazendo um método com condições e parametro

        System.out.println(cachorro1.interagir("carinho"));


        // Criando um objeto, com a mesma característica de outro
        Cachorro cachorro3 = new Cachorro("Max", "Marrom", 5, 5.2, "nada");
        System.out.println(cachorro3.getNumeroDeCachorro());


        System.out.println("-----------------------------------------");
        //imprimindo endereço de memória
        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());

        System.out.println("________________________________________");

        // Estamos referenciando um objeto a partir do outro, dessa forma, o ednereço de memoria fica igual....
//        cachorro3 = cachorro2;

//        System.out.println(cachorro3.toString());
//        System.out.println(cachorro2.toString());

        // É importante citar que, quando referenciamos um objeto a outro, e deixamos o mesmo sem referencia, ele é perdido na memória
        // Quem faz isso é o GARBAGE COLLECTOR (pesquisar mais sobre depois)

        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());

        //Estudar mais para frente sobre o que serve o DEBUG

        System.out.println("----------------");

        // contagem do numero de cachorros
        System.out.println(cachorro3.getNumeroDeCachorro());

        System.out.println("---------------------");

        Gato gato1 = new Gato("dudu", "branco");
        Passaro passaro1 = new Passaro("Pia", "azul");

        // Usando método override... SHOWWWW
        passaro1.soar();
        gato1.soar();

    }
}