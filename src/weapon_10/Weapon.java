package weapon_10;

/**
 * Класс оружие - базовый класс для огнестрельного и холодного оружия
 * @author Симонова В.В.
 */
public class Weapon {

    /** Поле для хранения цены на оружие*/
    private double price;

    /** Поле для хранения названия оружия*/
    private String name;

    /**
     * Создает оружие с заданными нуой и названием
     * @param price - на оружия
     * @param name - название оружия
     */
    public Weapon(double price, String name) {
        this.price = price;
        this.name = name;
    }

    /**
     * Создает оружие без названия и с ценой равной 0
     */
    public Weapon() {
        this.price = 0;
        this.name = "Без названия";
    }

    /**
     * Возвращает значение поля {@link Weapon#price}
     * @return вещественное значение цены оружия
     */
    public double getPrice() {
        return price;
    }

    /**
     * Установить значение поля {@link Weapon#price}
     * @param price вещественное значение цены оружия
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Возвращает значение поля {@link Weapon#name}
     * @return строку с названием оружия
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link Weapon#name}
     * @param name название оружия
     */
    public void setName(String name) {
        this.name = name;
    }
}
