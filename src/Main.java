import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String User = "Stanislav Molchanov";

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.printf("This task done by: " + User + " | " + dateTime.toString());
    }
}