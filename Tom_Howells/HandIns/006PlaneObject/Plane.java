class Plane{
    private String brand;
    private int wingspan;
    private int weight;

    Plane(String startingBrand, int startingWingspan, int startingWeight){
        brand = startingBrand;
        wingspan = startingWingspan;
        weight = startingWeight;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public int getWingspan(){
        return wingspan;
    }
    public void setWingspan(int newWingspan){
        wingspan = newWingspan;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int newWeight){
        weight = newWeight;
    }

    public String toString(){
        return "I am a " + weight + " pound plane with a wingspan of " + wingspan + " feet, made by "+ brand + ".";
    }
}
