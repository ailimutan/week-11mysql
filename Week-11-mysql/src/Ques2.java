import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ques2 {

    
    public static ArrayList<Animal> animals = new ArrayList<Animal>();  

    public static void main(String[] args) {
        
        //adding at least 4 objects to the list
        animals.add(new Animal("Dog",22));
        animals.add(new Animal("Crocodile",45));
        animals.add(new Animal("Deer",35));
        animals.add(new Animal("Cat",25));
        
        //Turn the Stream of object to a Stream of String (use the map method for this)
        String listOfStrings = animals.stream() // //Create a Stream from the list of object
                .map(String::valueOf) //Turn the Stream of object to a Stream of String (use the map method for this)
                .sorted() //Sort the Stream in the natural order
                .collect(Collectors.joining(",")); //Collect the Stream and return a comma-separated list of names as a single String
        
        System.out.println(listOfStrings); //Print the resulting String.
        
    }
    
}
