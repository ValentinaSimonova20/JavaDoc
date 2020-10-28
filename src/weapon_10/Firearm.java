package weapon_10;

/**
 * Класс огнестрельное оружие - производный класс класса оружие
 * @author Симонова В.В.
 */
public class Firearm extends Weapon{

    /** Поле для хранения количества пуль */
    private int bulletsAmount;

    /**
     * Создает огнестрельное оружие с заданными ценой, названием, количеством пуль
     * @param price цена оружия
     * @param name название оружия
     * @param bulletsAmount количество пуль в оружии
     */
    public Firearm(double price, String name, int bulletsAmount) {
        super(price, name);
        this.bulletsAmount = bulletsAmount;
    }

    /**
     * Создает огнестрельное оружие без названия, с ценой равной 0 и заданным количеством пуль
     * @param bulletsAmount - количество пуль в огнестрельном оружии
     */
    public Firearm(int bulletsAmount) {
        super();
        this.bulletsAmount = bulletsAmount;
    }

    /**
     * Создает огнестрельное оружие без названия, с ценой равной 0 и количеством пуль раным 0
     */
    public Firearm(){
        super();
        this.bulletsAmount = 0;
    }

    /**
     * Возвращает значение поля {@link Firearm#bulletsAmount}
     * @return целое число количества пуль в огнестрельном оружии
     */
    public int getBulletsAmount() {
        return bulletsAmount;
    }

    /**
     * Устанавливает значение поля {@link Firearm#bulletsAmount}
     * @param bulletsAmount количество пуль огнестрельного оружия
     */
    public void setBulletsAmount(int bulletsAmount) {
        this.bulletsAmount = bulletsAmount;
    }
}
