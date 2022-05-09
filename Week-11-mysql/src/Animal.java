public class Animal {
    private String name;
    private int lifeSpan;
    
    
    //constructor
    public Animal(String name, int lifeSpan) {
        this.name = name;
        this.lifeSpan = lifeSpan;
    }

    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    
    
    //Add a toString method that returns the name and object type 
    public String toString() {
        return getName() +" "+ this.getClass().getSimpleName();
    }

     //Create a static method named compare in the class that returns an int and takes two of the objects as parameters.
    public static int compare(Animal p1, Animal p2) {
        int p1LifeSpan = p1.getLifeSpan();
        int p2LifeSpan = p2.getLifeSpan();
        
        if(p1LifeSpan < p2LifeSpan) {
            return -1;
        } else if(p1LifeSpan >p2LifeSpan) {
            return 1;
        }
        
        return 0;
    }
    
}
