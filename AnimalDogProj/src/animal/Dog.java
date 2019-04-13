package animal;

import animal.Animal;

public class Dog extends Animal {
    String race;
    
    public void bark(){
        
    }
    
    @Override
    public void move(){
        Animal a = new Animal();
        super.say(this);
        System.out.println("Dog is moving.");        
    }
    
    //oute pio geniko oyte pio eidiko type metavlitis
    @Override
    public Animal say(Animal a){
        //return can be new Animal or more specific like new Dog/Cat
        return new Dog();
    }

    @Override
    public String toString() {
        String details = super.toString() +" Dog{" + "race=" + race + '}';
        return details;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
