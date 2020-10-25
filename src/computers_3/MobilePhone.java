package computers_3;

/**
 * Класс смартфон - производный класс от класса компьютера
 * @author СИмонова В.В.
 */
public class MobilePhone extends Computer{

    /** Поле для хранения разрешения основной камеры смартфона*/
    String rearCamera;

    /** Поле для хранения количества симкарт в смартфоне*/
    int simCardsAmount;


    /**
     * Создает смартфон с заданным разрешением экрана, объемом памяти, количеством ядер, фирмой-производителем и количеством симкарт
     * @param screen - разрешение экрана смартфона
     * @param memory - объем памяти смартфона
     * @param core - количество ядер смартфона
     * @param manufacturer - фирма-производитель смартфона
     * @param rearCamera - разрешение основной камеры смартфона
     * @param simCardsAmount - количество симкарт, поддерживаемых смартфоном
     */
    public MobilePhone(String screen, String memory, int core, String manufacturer, String rearCamera, int simCardsAmount) {
        super(screen, memory, core, manufacturer);
        this.rearCamera = rearCamera;
        this.simCardsAmount = simCardsAmount;
    }

    /**
     * Создает смартфон у которого заданы только разрешение основной камеры и  количество симкарт, которое он поддерживает
     * @param rearCamera - разрешение основной камеры смартфона
     * @param simCardsAmount - количество симкарт, поддерживаемых смартфоном
     */
    public MobilePhone(String rearCamera, int simCardsAmount) {
        super();
        this.rearCamera = rearCamera;
        this.simCardsAmount = simCardsAmount;
    }

    /**
     * Создает смартфон у которого не заданы разрешение экрана, объем памяти, кол-во ядер, фирма-производитель, разрешение основной камеры равно 0mp и количество симкарт равно 0
     */
    public MobilePhone(){
        super();
        this.rearCamera = "0mp";
        this.simCardsAmount = 0;
    }

    /**
     * Возвращает значение поля {@link MobilePhone#rearCamera}
     * @return строка со значением разрешения основной камеры
     */
    public String getRearCamera() {
        return rearCamera;
    }

    /**
     * Устанавливает значение поля {@link MobilePhone#rearCamera}
     * @param rearCamera - строка со значением разрещения основной камеры
     */
    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    /**
     * Возвращает значение поля {@link MobilePhone#simCardsAmount}
     * @return целое число количества симкарт, поддерживаемых смартфоном
     */
    public int getSimCardsAmount() {
        return simCardsAmount;
    }

    /**
     * Устанавливает значение поля {@link MobilePhone#simCardsAmount}
     * @param simCardsAmount целое число количества карт, поддерживаемых смартфоном
     */
    public void setSimCardsAmount(int simCardsAmount) {
        this.simCardsAmount = simCardsAmount;
    }
}
