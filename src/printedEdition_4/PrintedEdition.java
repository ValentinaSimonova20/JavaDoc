package printedEdition_4;

/**
 * Класс печатнве издания - базовый класс для объектов книг и журналов
 * @author Симонова В.В.
 */
public class PrintedEdition {
    /** Поле для хранения цены печатного издания*/
    private double price;

    /** Поле для хранения количества страниц печательного издания*/
    private int pages;

    /** Поле для хранения автора печатного издания*/
    private String author;

    /** Поле для хранения названия книги*/
    private String name;

    /**
     * Создает печатное издание с заданными значениями цены, страниц и автором
     * @param price - цена печатного издания
     * @param pages - количество страниц печатного издания
     * @param author - автор печатного издания
     */
    public PrintedEdition(double price, int pages, String author, String name) {
        this.price = price;
        this.pages = pages;
        this.author = author;
        this.name = name;
    }

    /**
     * Сощлает печатное издание с ценой равной 0, количеством страниц равной 0 и неизвестным автором
     */
    public PrintedEdition(){
        this.price = 0;
        this.pages = 0;
        this.author = "Неизвестен";
        this.name = "Без названия";
    }

    /**
     * Возвращает значение поля {@link PrintedEdition#price}
     * @return вещественное число с ценой печатного издания
     */
    public double getPrice() {
        return price;
    }

    /**
     * Устанавливает значение поля {@link PrintedEdition#price}
     * @param price - цена печатного издания
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Возвращает знаечение поля {@link PrintedEdition#pages}
     * @return целое число с количеством страниц печатного издания
     */
    public int getPages() {
        return pages;
    }

    /**
     * Устанавливает значение поля {@link PrintedEdition#pages}
     * @param pages - количество страниц печатного издания
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * Возвращает значение поля {@link PrintedEdition#author}
     * @return строка с именем и фамилией автора печатного издания
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Устанавливает значение поля {@link PrintedEdition#author}
     * @param author - фамилия и имя автора печатного издания
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Возвращает значение поля {@link PrintedEdition#name}
     * @return строка с названием печатного издания
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link PrintedEdition#name}
     * @param name строка с названием печатного издания
     */
    public void setName(String name) {
        this.name = name;
    }
}
