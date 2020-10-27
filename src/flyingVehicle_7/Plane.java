package flyingVehicle_7;

/**
 * Производный класс Самолет от класса летательный аппарат
 */
public class Plane extends FlyingVehicle{
    /** Поле для хранения размаха крыла самолета*/
    double wingWingSpan;

    /**
     * Создает самолет с заданными значениями фирмы, скоростью и размахом крыльев
     * @param firm
     * @param speed
     * @param wingWingSpan
     */
    public Plane(String firm, double speed, double wingWingSpan) {
        super(firm, speed);
        this.wingWingSpan = wingWingSpan;
    }

    /**
     * Создает самолет с фирмой без названия, скоростью равно 0 и заданным размахом крыла
     * @param wingWingSpan - размах крыла самолета
     */
    public Plane(double wingWingSpan) {
        super();
        this.wingWingSpan = wingWingSpan;
    }

    /**
     * Создает самолет  с фирмой без названия, скоростью равно 0 и размахом крыла равным 0
     */
    public Plane(){
        super();
        this.wingWingSpan = 0;
    }

    /**
     * Возвращает значение поля {@link Plane#wingWingSpan}
     * @return вещественное значение размаха крыла самолета
     */
    public double getWingWingSpan() {
        return wingWingSpan;
    }

    /**
     * Устанавливает значение поля {@link Plane#wingWingSpan}
     * @param wingWingSpan - вещественное значение размаха крыла самолета
     */
    public void setWingWingSpan(double wingWingSpan) {
        this.wingWingSpan = wingWingSpan;
    }
}
