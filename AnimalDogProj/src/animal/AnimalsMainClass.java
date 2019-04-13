package animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMainClass extends Dog {

    public static void main(String[] args) {
//        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal aa = null;
        aa = c;
        aa.say(aa);
        d.say(new Animal());

        //list
        List<Animal> list = new ArrayList();
        list.add(d);
        list.add(c);
        for (Animal a : list) {
            a.move();
        }
        Animal a = new Animal();
        a.name = "Animal";
        a.size = 30;
        System.out.println(a);
        Dog dd = new Dog();
        dd.name = "Jack";
        dd.size = 2;
        dd.race = "bulldog";
        System.out.println(dd);
        
        Animal a1 = new Dog();
        Dog d1 = new Dog();
        //upcasting = to d1 mporei na mpei mesa sto a1
        a1 = d1;
        //downcasting = metatrepoume to animal se dog
        d1 = (Dog)a1;
        
        
    }

}
