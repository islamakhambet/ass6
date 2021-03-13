package task3;

public class Application {
  public static void main(String[] args) {
        BuildApplication buildApp = new BuildApplication();
        build build1 = buildApp.getbuild("Appartment");
        build1.buildDoes();
         build2 = buildApp.getbuild("Cottedge");
         build2.buildDoes();
    }
}
