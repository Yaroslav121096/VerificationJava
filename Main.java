package toys;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ToyCollection toyCollection = new ToyCollection();
        toyCollection.add(new Toy(1, "Робот", 2, 0.5));
        toyCollection.add(new Toy(2, "Покемон", 4, 0.3));
        toyCollection.add(new Toy(3, "Мягкая игрушка", 1, 0.2));

        ArrayList<Toy> prizes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Toy toy = toyCollection.getRandom();
            if (toy == null){
                System.out.println("Призов больше нет");
                break;
            }

            System.out.println("Приз: " + toy.getName());
            prizes.add(toy);
        }

        ToyWriter.writePrizesToFile(prizes);
    }
}