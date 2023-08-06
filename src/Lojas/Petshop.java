// Trabalhando com polimorfismo

// Com o polimorfismo conseguimos referenciar objetos de outras formas. Por exemplo: referenciar o objeto gato, a partir da classe gato.

// Dessa forma, ele consegue passar por métodos que só tem na classe animal!!!!
package Lojas;

import animais.Animal;

public class Petshop {

   public void darBanho(Animal animal){
       animal.setEstadoDeEspirito("Limpo");
   }

   public void escovarGato(Animal gato) {
       gato.setEstadoDeEspirito("Brilhoso");
   }

   public void deixarNoHotel (Animal animal) {
       animal.setEstadoDeEspirito("Solitário");
   }
}
