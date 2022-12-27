import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        AgendaUI agendaUI = new AgendaUI(new Scanner(System.in));
        agendaUI.menu();
    }

}
