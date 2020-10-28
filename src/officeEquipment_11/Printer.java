package officeEquipment_11;

import printedEdition_4.PrintedEdition;

/**
 * Класс принтер - производный класс класса оргтехника
 */
public class Printer extends OfficeEquipment{

    /** Поле для хранения отметки того, черно-белый ли принтер*/
    private boolean isWhiteBlack;

    /**
     * Создает принтер с заданными значениями цены, фирмы и отметкой того, черно-белый ли он
     * @param price цена принтера
     * @param firm фирма производитель принтера
     * @param isWhiteBlack отметка того,черно-белый ли принтер
     */
    public Printer(double price, String firm, boolean isWhiteBlack) {
        super(price, firm);
        this.isWhiteBlack = isWhiteBlack;
    }

    /**
     * Создает принтер ценой равной 0, неизвной фирмой и заданной отметкой черно-белый ли принтер
     * @param isWhiteBlack - отметка того, черно-белый ли принтер
     */
    public Printer(boolean isWhiteBlack) {
        super();
        this.isWhiteBlack = isWhiteBlack;
    }

    /**
     * Создает принтер ценой равной 0, неизвной фирмой и черно-белый
     */
    public Printer(){
        super();
        this.isWhiteBlack = true;
    }

    /**
     * Возвращает значение поля {@link Printer#isWhiteBlack}
     * @return логическое значение того, является ли принтер черно-еблым
     */
    public boolean isWhiteBlack() {
        return isWhiteBlack;
    }

    /**
     * Устанавливает значение поля {@link Printer#isWhiteBlack}
     * @param whiteBlack отметка того черно-белый ли принтер
     */
    public void setWhiteBlack(boolean whiteBlack) {
        isWhiteBlack = whiteBlack;
    }
}
