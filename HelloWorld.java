import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Current date: " + LocalDate.now());
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() + " bytes");
    }
}


