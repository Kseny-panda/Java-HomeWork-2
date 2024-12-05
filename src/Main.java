//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15_000;
        boolean ticket = true;

        int miles;
        if (ticket) {
            miles = ticketPrice / 20;
        } else {
            miles = 0;
        }

        System.out.println(miles);

    }
}