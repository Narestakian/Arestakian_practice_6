
    class Mammal extends Animal{
        private String diet;
        public Mammal(String species, String diet){
            super(species);
            this.diet = diet;

        }
        void MammalDiet(){
            super.AnimalSpecies();
            System.out.println(diet);
        }
}
