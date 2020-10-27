package file_6;

/**
 * Класс Каталог - предназначен для хранения звуковых и видеофайлов
 * @author Симонова В.В.
 */
public class Catalog {

    /** Поле для хрпанения списка файлов*/
    private File[] files;

    /**
     * Создает каталог со списком файлов
     * @param files
     */
    public Catalog(File[] files) {
        this.files = files;
    }

    public String countFiles(){
        int audioFile = 0;
        int videofile = 0;

        for(File file: files){
            if(file instanceof AudioFile) audioFile++;
            else videofile++;
        }

        return "Аудиофайлов: "+audioFile+". Видеофайлов: "+videofile;
    }
}
