package Abstraction.Abstract;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
      if(type == "slow"){
          System.out.println(ExplicitType() + "lazy swimming ");
      }else{
          System.out.println(ExplicitType() + "sprint swimming .....");
      }
    }

    @Override
    public void makeNoise() {

        if(type=="GoldFish"){
            System.out.println(ExplicitType() +" swish ....");
        }
        else{
            System.out.println(ExplicitType() + " splash .......");
        }
    }

    @Override
    public void shedHair() {

    }
}
