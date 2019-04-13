package animal;

public class Animal {
    String name;
    int size;
    
    public void play(){
        
    }

    public void move(){
       System.out.println("Animal is moving."); 
    }
    
    protected Animal say(Animal aa){
        return new Animal();
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", size=" + size + '}';
    }
    
    
}
