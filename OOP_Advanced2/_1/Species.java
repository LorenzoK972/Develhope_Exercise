package Develhope_Exercise.OOP_Advanced2._1;

public enum Species {
    SALMON("Salmon"),
    STURGEON("Sturgeon"),
    WHITEFISH("Whitefish"),
    LAMPREY("Lamrpey"),
    TROUT("Trout");
    private String fishSpecies;

    Species(String fishNames) {
        this.fishSpecies = fishNames;
    }
    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

}
