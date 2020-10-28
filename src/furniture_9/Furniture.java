package furniture_9;

/**
 * Класс мебель - базовый класс для объектов дивана и шкафа
 * @author Симонова В.В.
 */
public class Furniture {

    /** Поле для хранения названия медели*/
    private String name;

    /** Поле для хранения цены мебели*/
    private double price;

    /**
     * Создает мебель с заданными значениями названия и цены
     * @param name - название мебели
     * @param price - цена мебели
     */
    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Создает мебель без названия и с ценой 0
     */
    public Furniture(){
        this.name = "Без названия";
        this.price = 0.0;
    }

    /**
     * Возвращает значение поля {@link Furniture#name}
     * @return строку с названием мебели
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link Furniture#name}
     * @param name - название мебели
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает значение поля {@link Furniture#price}
     * @return вещественное число цены мебели
     */
    public double getPrice() {
        return price;
    }

    /**
     * Устанавливает значение поля {@link Furniture#price}
     * @param price - цена мебели
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
