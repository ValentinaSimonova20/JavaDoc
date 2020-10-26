package accommodation_5;

/**
 * Класс Офис - производный класс от класса помещение, предназначен для хранения объектов офиса
 * @author Симонова В.В.
 */
public class Office extends Accommodation{

    /** Поле для хранения количества работников в офисе*/
    private int workersAmount;

    /**
     * Создает офис с указанными площадью, ценой, названием и количеством работников
     * @param area - площадь офиса
     * @param price - цена офиса
     * @param name - название офиса
     * @param workersAmount - количество работников офиса
     */
    public Office(double area, double price, String name, int workersAmount) {
        super(area, price, name);
        this.workersAmount = workersAmount;
    }

    /**
     * Создает офис с площадью равной 0, ценой равной 0, без названия и заданным количеством работников
     * @param workersAmount - целое число количества работников офиса
     */
    public Office(int workersAmount) {
        super();
        this.workersAmount = workersAmount;
    }

    /**
     * Создает офис с площадью равной 0, ценой равной 0, без названия и заданным количеством работников 0
     */
    public Office(){
        super();
        this.workersAmount = 0;
    }

    /**
     * Возвращает значение поля {@link Office#workersAmount}
     * @return целое число количества работников офиса
     */
    public int getWorkersAmount() {
        return workersAmount;
    }

    /**
     * Устанавливает значение поля {@link Office#workersAmount}
     * @param workersAmount - целое число количества работников офиса
     */
    public void setWorkersAmount(int workersAmount) {
        this.workersAmount = workersAmount;
    }
}
