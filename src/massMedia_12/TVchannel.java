package massMedia_12;

/**
 * Класс телеканал - производный класс от класса СМИ
 * @author Симонова В.В.
 */
public class TVchannel extends MassMedia{

    /** Поле для хранения количества зрителей телеканала*/
    private int numberOfSpectators;

    /**
     * Создает телеканал с заданным названием и количеством зрителей
     * @param name название телеканала
     * @param numberOfSpectators количество зрителей телеканала
     */
    public TVchannel(String name, int numberOfSpectators) {
        super(name);
        this.numberOfSpectators = numberOfSpectators;
    }

    /**
     * Создает телеканал с заданным количеством зрителей и без названия
     * @param numberOfSpectators
     */
    public TVchannel(int numberOfSpectators) {
        super();
        this.numberOfSpectators = numberOfSpectators;
    }

    /**
     * Создает телеканал с количеством зрителей равным 0 и без названия
     */
    public TVchannel(){
        super();
        this.numberOfSpectators = 0;
    }

    /**
     * Возвращает значение поля {@link TVchannel#numberOfSpectators}
     * @return целое число количества зрителей телеканала
     */
    public int getNumberOfSpectators() {
        return numberOfSpectators;
    }

    /**
     * Устанавливает значение поля {@link TVchannel#numberOfSpectators}
     * @param numberOfSpectators количество зрителей телеканала
     */
    public void setNumberOfSpectators(int numberOfSpectators) {
        this.numberOfSpectators = numberOfSpectators;
    }
}
