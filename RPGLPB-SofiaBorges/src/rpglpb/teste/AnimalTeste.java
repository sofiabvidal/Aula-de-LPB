package rpglpb.teste;

import rpglpb.entidades.Dog;
import rpglpb.entidades.Shark;

public class AnimalTeste {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Dog dog = new Dog();

        shark.locomocao();
        shark.comer();
        
        dog.locomocao();
        dog.comer();
    }
}
