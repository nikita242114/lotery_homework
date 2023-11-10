public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор Lego", 10, 30);
        Toy toy2 = new Toy(2, "Трансфомер", 100, 50);
        Toy toy3 = new Toy(3, "Мяч", 150, 90);
        Toy toy4 = new Toy(4, "Синий трактор ", 60, 30);
        Toy toy5 = new Toy(5, "Кукла черепашки ниндзя ", 160, 90);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        

        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}