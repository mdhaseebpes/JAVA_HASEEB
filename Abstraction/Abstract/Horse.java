package Abstraction.Abstract;

public class Horse extends  mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(ExplicitType() + "shed hair in Spring season ");
    }

    @Override
    public void makeNoise() {

    }
}
