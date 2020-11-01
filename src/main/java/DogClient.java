public class DogClient {
    public static void main(String[] args) {
        Dog p2 = new Dog("Steve", 7, "Poodle");
        System.out.println(p2);
        System.out.println(p2.getBreed());
        p2.makeNoise(); // woof
        System.out.println(new Dog());
    }
}