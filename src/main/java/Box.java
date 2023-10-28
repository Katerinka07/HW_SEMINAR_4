import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double sumWeightBox = 0.0f;
        for(T fruit: fruits) {
            sumWeightBox += fruit.getWeight();
        }
        return sumWeightBox;
    }

    public boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void pourBox (Box <T> box) {
        if (fruits.isEmpty()) {
            System.out.println("Коробка пустая, пересыпать нечего\n");
        } else {
            for (T fruit: fruits) {
                box.add(fruit);
            }
            System.out.printf("В коробке, в которую пересыпали, стало: %d фруктов, общий вес: %.1f усл.ед.\n", box.fruits.size(),box.getWeight());
        }
    }
    @Override
    public String toString() {
        if (fruits.isEmpty()) {
            return String.format("В коробке нет фруктов");
        } else {
            return String.format("В коробке %s %d шт, вес %.1f усл.ед.\n", fruits.getFirst(), fruits.size(), getWeight());
        }
    }

}
