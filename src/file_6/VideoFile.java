package file_6;

/**
 * Класс видеофайл - производный класс от класса файл
 * @author Симонова В.В.
 */
public class VideoFile extends File{

    /** Поле для хранения формата видеофайла*/
    private String videoFormat;

    /** Поле для хранения количества кадров в секунду видеофайла*/
    private double framesPerSecond;

    /**
     * Создает видеофайл с заданными значениями размера файла, названием, форматом и количеством кадров в секунду
     * @param size - размер видеофайла
     * @param name - название видеофайла
     * @param videoFormat - формат видеофайла
     * @param framesPerSecond - количество кадров в секунду
     */
    public VideoFile(double size, String name, String videoFormat, double framesPerSecond) {
        super(size, name);
        this.videoFormat = videoFormat;
        this.framesPerSecond = framesPerSecond;
    }

    /**
     * Создает видеофайл с размером 0 мб , без названия, с заданными значениями формата и количеством кадров в секунду
     * @param videoFormat
     * @param framesPerSecond
     */
    public VideoFile(String videoFormat, double framesPerSecond) {
        super();
        this.videoFormat = videoFormat;
        this.framesPerSecond = framesPerSecond;
    }


    /**
     * Создает видеофайл с размером 0 мб , без названия, без видеоформата и количеством кадров в секунду 0
     */
    public VideoFile() {
        super();
        this.videoFormat = null;
        this.framesPerSecond = 0;
    }

    /**
     * Возвращает значение поля {@link VideoFile#videoFormat}
     * @return строку с значением формата файла
     */
    public String getVideoFormat() {
        return videoFormat;
    }

    /**
     * Устанавливает значение поля {@link VideoFile#videoFormat}
     * @param videoFormat - строка с значением формата видеофайла
     */
    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    /**
     * Возвращает значение поля {@link VideoFile#framesPerSecond}
     * @return вещественное значение количества кадров в секунду
     */
    public double getFramesPerSecond() {
        return framesPerSecond;
    }

    /**
     * Устанавливает значение поля {@link VideoFile#framesPerSecond}
     * @param framesPerSecond - вещественное значение количества кадров в секунду видеофайла
     */
    public void setFramesPerSecond(double framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }
}
