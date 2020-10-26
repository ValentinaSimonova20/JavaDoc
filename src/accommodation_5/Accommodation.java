package accommodation_5;

/**
 * Класс помещение - базовый класс для объектов квартиры и офиса.
 * @author Симонова В.В.
 */
public class Accommodation {

    /** Поле для хранения площади помещения*/
    private double area;

    /** Поле для хранения цена помещения*/
    private double price;

    /** Поле для хранения названия помещения*/
    private String name;

    /**
     * Создает помещение с заданнымизначениями площади, цены и названием
     * @param area - площадь помещения
     * @param price - цена помещения
     * @param name - название помещения
     */
    public Accommodation(double area, double price, String name) {
        this.area = area;
        this.price = price;
        this.name = name;
    }

    /**
     * Создает помещение с площадью равной 0, ценой равной 0 и без названия
     */
    public Accommodation(){
        this.area = 0;
        this.price = 0;
        this.name = "Без названия";
    }

    /**
     * Возвращает значение поля {@link Accommodation#area}
     * @return вещественное число с площадью помещения
     */
    public double getArea() {
        return area;
    }

    /**
     * Устанавливает значение поля {@link Accommodation#area}
     * @param area вещественное число - площадь помещения
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Возвращает значение поля {@link Accommodation#price}
     * @return вещественное значение с ценой помещения
     */
    public double getPrice() {
        return price;
    }

    /**
     * Устанавливает значение поля {@link Accommodation#price}
     * @param price вещественное значение с ценой помещения
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Возвращает значение поля {@link Accommodation#name}
     * @return строку с названием помещения
     */
    public String getName() {
        return name;
    }

    /**
     * Устаналивает значение поля {@link Accommodation#name}
     * @param name - строка с названием помещения
     */
    public void setName(String name) {
        this.name = name;
    }
}
