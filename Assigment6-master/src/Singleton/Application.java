package Singleton;

public class Application {
        public static void main(String[] args) {
            Database foo=Database.getInstance();
            foo.query("SELECT...");
            Database bar=Database.getInstance();
            bar.query("SELECT...");

        }
    }

