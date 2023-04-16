package Develhope_Exercise.OOP_Advanced2._1;

public enum DogBreed {
    GERMAN_SHEPARD("German Shepard"),
    BULLDOG ("Bulldog"),
    LABRADOR_RETRIEVER ("Labrador Retriever"),
    GOLDEN_RETRIEVER ("Golden Retriever"),
    BORDER_COLLIE ("Border Collie");
    private String breedName;

    DogBreed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

}
