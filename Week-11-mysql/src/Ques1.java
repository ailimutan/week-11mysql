import java.util.ArrayList;

public class Ques1 {

    public static ArrayList<Animal> animals = new ArrayList<Animal>();  
    
    public static void main(String[] args) {
    
    //adding at least 4 objects to the list
        animals.add(new Animal("Dog",22));
        animals.add(new Animal("Crocodile",45));
        animals.add(new Animal("Deer",35));
        animals.add(new Animal("Cat",25));
    
     System.out.println("Before Sorting the Animal data:");
     
    
     animals.forEach((s)-> System.out.println(s));
     
     Animal[] animalsAsArray =  animals.toArray(new Animal[animals.size()]);
    
    //sort using lambda expression
    System.out.println("\nAfter Sorting the Animal data by LifeSpan via LAMBDA EXPRESSION:"); 
    AnimalSort.sortAnimalsByLifeSpan(animalsAsArray);

    
    //sort using method reference
    System.out.println("\nAfter Sorting the Animal data by LifeSpan via METHOD REFERENCE:"); 
    AnimalSort.sortAnimalsByLifeSpanMethodReference(animalsAsArray);
   
    
    }

}
