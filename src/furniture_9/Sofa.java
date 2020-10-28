package furniture_9;

/**
 * Класс диван - производный класс класа мебели
 * @author Симонова В.В.
 */
public class Sofa extends Furniture{

    /** Поле для хранения количества мест на диване*/
    double numberOfSeats;

    /**
     * Создает диван с заданными названием, ценой и количеством сидений
     * @param name - название дивана
     * @param price - цена дивана
     * @param numberOfSeats - количество мест на диване
     */
    public Sofa(String name, double price, double numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Создает диван без названия,с ценой равной 0 и заданным количеством сидений
     * @param numberOfSeats - количество мест на дивне
     */
    public Sofa(double numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Создает диван без названия,с ценой равной 0 и с количеством сидений равным 0
     */
    public Sofa(){
        super();
        this.numberOfSeats = 0;
    }

    /**
     * Возвращает значение поля {@link Sofa#numberOfSeats}
     * @return вещественное число количества мест на диване
     */
    public double getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Устанавливает значение поля {@link Sofa#numberOfSeats}
     * @param numberOfSeats - вещественное значение количества мест на диване
     */
    public void setNumberOfSeats(double numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
