package flyingVehicle_7;

/**
 * Класс вертолет - производный класс от класса летательный аппарат
 * @author Симонова В.В.
 */
public class Helicopter extends FlyingVehicle{

    /** Поле для хранения длины лопасти вертолета*/
    double lengthOfTheBlade;

    /**
     * Создает вертолет с заданными значениями фирмы, скоростью и длиной лопасти
     * @param firm
     * @param speed
     * @param lengthOfTheBlade
     */
    public Helicopter(String firm, double speed, double lengthOfTheBlade) {
        super(firm, speed);
        this.lengthOfTheBlade = lengthOfTheBlade;
    }

    /**
     * Создает вертолет с фирмой без названия, максимальной скоростью 0 и заданной длиной лопасти
     * @param lengthOfTheBlade
     */
    public Helicopter(double lengthOfTheBlade) {
        super();
        this.lengthOfTheBlade = lengthOfTheBlade;
    }

    /**
     * Создает вертолет с фирмой без названия, максимальной скоростью 0 и длиной лопасти 0
     */
    public Helicopter(){
        super();
        this.lengthOfTheBlade = 0;
    }

    /**
     * Возвращает значение поля {@link Helicopter#lengthOfTheBlade}
     * @return - вещественное значение длины лопасти вертолета
     */
    public double getLengthOfTheBlade() {
        return lengthOfTheBlade;
    }

    /**
     * Устанавливает значение поля {@link Helicopter#lengthOfTheBlade}
     * @param lengthOfTheBlade - вещественное значение длины лопасти вертолета
     */
    public void setLengthOfTheBlade(double lengthOfTheBlade) {
        this.lengthOfTheBlade = lengthOfTheBlade;
    }
}
