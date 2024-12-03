import java.util.List;

public class App {

    public static void main(String[] args) {
        List<MountainHare> hares = List.of( new MountainHare(1, 1, 1));
        hares.add(new MountainHare(1, 1, 1));
        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
       
        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        // напечатайте список всех зайцев
    }

}