import java.util.Arrays;

public class AnimalSort {
    
    //lambda expression
    public static void sortAnimalsByLifeSpan(Animal[] animalsAsArray) {
        Arrays.sort(animalsAsArray, (Animal a1, Animal a2) -> Animal.compare(a1, a2));
        displaySortedList(animalsAsArray);
    }
    
    //method reference
    public static void sortAnimalsByLifeSpanMethodReference(Animal[] animalsAsArray) {
        Arrays.sort(animalsAsArray, Animal::compare);
        displaySortedList(animalsAsArray);
    }
    
    //display sorted data
    public static void displaySortedList(Animal[] animalsAsArray) {
        for (int i = 0; i < animalsAsArray.length; i++) {  
            System.out.println(animalsAsArray[i] + " ");  
        }
        
    }

}
