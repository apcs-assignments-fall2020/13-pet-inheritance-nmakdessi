public class Dog extends Pet {
    // Instance variable(s)
    private String breed;


    // Constructors
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog(){
        super("steve", 2);
        this.breed = "poodle";
    }
    

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof!");
    }

    // toString method
    public String toString() {
        String str = this.getName() + " " + this.getAge() + " " + this.getBreed();
        return str;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }

}