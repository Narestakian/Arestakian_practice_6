public class Dog extends Mammal{
    private String breed;
    public Dog(String species, String diet,  String breed){
        super(diet, species);
        this.breed = breed;

    }
    void DogBreed(){
       super.MammalDiet();
        System.out.println(breed);
    }


}
