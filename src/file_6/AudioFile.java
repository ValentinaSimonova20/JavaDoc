package file_6;

/**
 * Класс аудиофайл - производный от класса файл для объектов звуковых файлов
 * @author Симонова В.В.
 */
public class AudioFile extends File{
    String audioFormat;

    /**
     * Создает айдиофайл с заданным размером, названием и аудиоформатом
     * @param size - размер аудиофайла
     * @param name - название аудиофайла
     * @param audioFormat - формат аудиофайла
     */
    public AudioFile(double size, String name, String audioFormat) {
        super(size, name);
        this.audioFormat = audioFormat;
    }

    /**
     * Создает аудиофайл с размером 0 мб, без названия и с заданным форматом
     * @param audioFormat
     */
    public AudioFile(String audioFormat) {
        super();
        this.audioFormat = audioFormat;
    }

    /**
     * Создает аудиофайл с размером 0 мб, без названия и без формата
     */
    public AudioFile(){
        super();
        this.audioFormat = "без формата";
    }

    /**
     * Возвращает значение поля {@link AudioFile#audioFormat}
     * @return строку с форматом аудиофайла
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    /**
     * Устанавливает значение поля {@link AudioFile#audioFormat}
     * @param audioFormat - значение формата аудиофайла
     */
    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }
}
