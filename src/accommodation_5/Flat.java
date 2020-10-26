package accommodation_5;

/**
 * Класс квартира, производный от класса помещение
 * @author Симонова В.В.
 */
public class Flat extends Accommodation{
    /** Поле для хранение информации о том, является ли санузел квартиры раздельным*/
    private boolean isSeparateBath;

    /**
     * Создает квартиру с заданной площадью, ценой, названием и указателем на то, является санузел квартиры раздельным
     * @param area - площадь квартиры
     * @param price - цена квартиры
     * @param name - название квартиры
     * @param isSeparateBath - наличие раздельного санузла квартиры
     */
    public Flat(double area, double price, String name, boolean isSeparateBath) {
        super(area, price, name);
        this.isSeparateBath = isSeparateBath;
    }

    /**
     * Создает квартиру с площадью равной 0, ценой равной 0, без название и с указателем на наличие раздельного санузла в квартире
     * @param isSeparateBath
     */
    public Flat(boolean isSeparateBath) {
        super();
        this.isSeparateBath = isSeparateBath;
    }

    /**
     * Создает квартиру с площадью равной 0, ценой равной 0, без название и с совмещенным санузлом
     */
    public Flat(){
        super();
        this.isSeparateBath = false;
    }

    /**
     * Возвращает значение поля {@link Flat#isSeparateBath}
     * @return логическое значение наличия разделенного санузла
     */
    public boolean isSeparateBath() {
        return isSeparateBath;
    }

    /**
     * Возвращает значение поля {@link Flat#isSeparateBath}
     * @param separateBath логическое значение наличия разделенного санузла
     */
    public void setSeparateBath(boolean separateBath) {
        isSeparateBath = separateBath;
    }
}
