package task3;

public class HomeBuilder {
   public Builder getBuild(String buildType){
        if(buildType.equalsIgnoreCase(" Appartment")){
            return new Appartment();
        }else if (animalType.equalsIgnoreCase("Cottedge")){
            return new Cottedge();
        }else {
            throw new RuntimeException("Unknown type of build");
        }
    }
}
