package Abstraction.Abstract;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
      if(type == "slow"){
          System.out.println(ExplicitType() + "tiger is walking");
      }else{
          System.out.println(ExplicitType() + "tiger is hunting .....");
      }
    }

    @Override
    public void makeNoise() {

        if(type=="tiger"){
            System.out.println(ExplicitType() + "roaring ....");
        }
        else{
            System.out.println(ExplicitType() + "tiger sleeping .......");
        }


    }
    @Override
    public void shedHair() {
        System.out.println(ExplicitType() + "shed hair in all the seasons ");
    }

}
