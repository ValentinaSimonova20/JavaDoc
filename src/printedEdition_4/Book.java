package printedEdition_4;

/**
 * Класс Книга - производный класс от класса печатное издание
 */
public class Book extends PrintedEdition{
    /** Поле для хранения жанра книги*/
    private String genre;

    /**
     * Создает книгу с заданными ценой, номером страниц, именем автора и жанром
     * @param price - цена книги
     * @param pages - количество страниц
     * @param author - имя автора книги
     * @param genre - жанр книги
     * @param name - название книги
     */
    public Book(double price, int pages, String author, String genre, String name) {
        super(price, pages, author, name);
        this.genre = genre;
    }

    /**
     * Создает книгу с заданным жанром
     * @param genre - жанр книги
     */
    public Book(String genre) {
        super();
        this.genre = genre;
    }

    /**
     * Создает книгу с незаданными значениями цены книги, количеством страниц, автором, жанром и именем
     */
    public Book(){
        super();
    }

    /**
     * Возвращает значение поля {@link Book#genre}
     * @return строку с названием жанра книги
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Устанавливает значение поля {@link Book#genre}
     * @param genre строка с названием жанра
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
