package printedEdition_4;

import javax.xml.namespace.QName;

/**
 * Класс журнал - производный класс от класса печатное издание
 * @author Симонова В.В.
 */
public class Magazine extends PrintedEdition{

    /** Поле для хранения номера выпуска журнала*/
    private int number;

    /**
     * Создает журнал с заданными ценой, количеством страниц, именем автора и номером выпуска
     * @param price - цена журнала
     * @param pages - количество страниц журнала
     * @param author - имя автора журнала
     * @param number - номер выпуска журнала
     * @param name - название журнала
     */
    public Magazine(double price, int pages, String author, int number, String name) {
        super(price, pages, author, name);
        this.number = number;
    }

    /**
     * Создает журнал, в котором задан только номер выпуска журнала
     * @param number - номер выпуска журнала
     */
    public Magazine(int number) {
        super();
        this.number = number;
    }

    /**
     * Возвращает значение поля {@link Magazine#number}
     * @return целое число номера выпуска журнала
     */
    public int getNumber() {
        return number;
    }

    /**
     * Устанавливает значение поля{@link Magazine#number}
     * @param number - целое число номера выпуска журнала
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
