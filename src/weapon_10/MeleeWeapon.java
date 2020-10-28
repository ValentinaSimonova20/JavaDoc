package weapon_10;

/**
 * Класс холодное оружие. Производный класс класса оружие
 * @author Симонова В.В.
 */
public class MeleeWeapon extends Weapon{

    /** Поле для хранения длины клинка холодного оружия*/
    private double bladeLength;

    /**
     * Создает холодное оружие с заданными ценой, названием и длиной клинка
     * @param price цена холодного оружия
     * @param name название холодного оружия
     * @param bladeLength длина клиенка холодного оружия
     */
    public MeleeWeapon(double price, String name, double bladeLength) {
        super(price, name);
        this.bladeLength = bladeLength;
    }

    /**
     * Создает холодное оружие без названия, с ценой 0 и с заданной длиной клинка
     * @param bladeLength длина клинка холодного оружия
     */
    public MeleeWeapon(double bladeLength) {
        super();
        this.bladeLength = bladeLength;
    }

    /**
     *  Создает холодное оружие без названия, с ценой 0 и с длиной клинка 0
     */
    public MeleeWeapon(){
        super();
        this.bladeLength = 0;
    }

    /**
     * Возвращает значение поля {@link MeleeWeapon#bladeLength}
     * @return вещественное значение длины клинка холодного оружия
     */
    public double getBladeLength() {
        return bladeLength;
    }

    /**
     * Устанавливает значение поля {@link MeleeWeapon#bladeLength}
     * @param bladeLength вещественное значениедлины клинка холодного оружия
     */
    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }
}
