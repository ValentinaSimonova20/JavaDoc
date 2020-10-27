package flyingVehicle_7;

/**
 * Класс Летательный аппарат - базовый класс для объектов самолета и вертолета
 * @author Симонова В.В.
 */
public class FlyingVehicle {

    /** Поле для хранения названия фирмы летательного аппарата*/
    private String  firm;

    /** Поле для хранения скорости летательного аппарата*/
    private double speed;

    /**
     * Создает летательный аппарат с заданными значениями фирмы и скоростью
     * @param firm
     * @param speed
     */
    public FlyingVehicle(String firm, double speed) {
        this.firm = firm;
        this.speed = speed;
    }

    /**
     * СОздает летательный аппарат с фирмой без названия и скоростью равно 0
     */
    public FlyingVehicle(){
        this.firm = "Без названия";
        this.speed = 0;
    }

    /**
     * Возвращает значение поля {@link FlyingVehicle#firm}
     * @return строку с названием фирмы летательного аппарата
     */
    public String getFirm() {
        return firm;
    }

    /**
     * Устанавливает значение поля {@link FlyingVehicle#firm}
     * @param firm - фирма летательного аппарата
     */
    public void setFirm(String firm) {
        this.firm = firm;
    }

    /**
     * Возвращает значение поля {@link FlyingVehicle#speed}
     * @return вещественное значение скорости летательного аппарата
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Устанавливает значение поля {@link FlyingVehicle#speed}
     * @param speed - ещественное значение скорости летательного аппарата
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
