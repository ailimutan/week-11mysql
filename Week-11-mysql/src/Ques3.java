import java.util.NoSuchElementException;
import java.util.Optional;

public class Ques3 {

    public static void main(String[] args) {        
        
        System.out.println("==== EXAMPLE 1 - Empty Optional====");
        Optional<Animal> animalEmpty = Optional.empty();
        animalMethodB(animalEmpty);  //Method b should also call method a with an empty Optional
        
        
        System.out.println("\n==== EXAMPLE 2 - with Value ===");
        Animal a1 = new Animal("Dog", 22);
        Optional<Animal> animalOptional = Optional.of(a1);
        animalMethodB(animalOptional);
        
    }
    
    
    public static Animal animalMethodA(Optional<Animal> optionalAnimal) {
        
        optionalAnimal.orElseThrow(() -> new NoSuchElementException("No value present."));
        return optionalAnimal.get();    
    }
    
    
    public static void animalMethodB(Optional<Animal> optionalAnimal) {
           try {
                System.out.println(animalMethodA(optionalAnimal));
            }
            catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
           
    }
    
}
