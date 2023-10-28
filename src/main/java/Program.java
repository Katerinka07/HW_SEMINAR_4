public class Program {
    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println(appleBox);

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        System.out.println(orangeBox1);
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());
        System.out.println(orangeBox2);
        Box<Orange> orangeBox3 = new Box<>();
        System.out.println(orangeBox3);
        System.out.println("-".repeat(20));

        System.out.println("Вес коробки с апельсинами: " + orangeBox1.getWeight() + " усл.ед.\n");
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight() + " усл.ед.\n");
        System.out.println("-".repeat(20));

        System.out.println(appleBox.compare(orangeBox2));
        System.out.println("-".repeat(20));

        orangeBox3.pourBox(orangeBox1);
        orangeBox1.pourBox(orangeBox2);

    }
}
