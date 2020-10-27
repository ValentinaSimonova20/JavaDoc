package file_6;

/**
 * Класс файл - базовый класс для объектов файлов(звуковых и видео)
 * @author Симонова В.В.
 */
public class File {

    /** Поле для хранения размера файла в мегабайтах*/
    private double size;

    /** Поле для хранения названия файла*/
    private String name;

    /**
     * Создает файл с заданными значениями размера в мегабайтах и названием
     * @param size - размер файла в мегабайтах
     * @param name - название файла
     */
    public File(double size, String name) {
        this.size = size;
        this.name = name;
    }

    /**
     * Создает файл с размером 0 мегабайт и без названия
     */
    public File() {
        this.size=0;
        this.name = "Без названия";

    }

    /**
     * Возвращает значение поля {@link File#size}
     * @return вещественное значение размера файла в мегабайтах
     */
    public double getSize() {
        return size;
    }


    /**
     * Устанавливает значение поля {@link File#size}
     * @param size - вещественное число размера файла в мегабайтах
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Возращает значение поля {@link File#name}
     * @return строку с названием файла
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link File#name}
     * @param name строка с названием файла
     */
    public void setName(String name) {
        this.name = name;
    }
}
