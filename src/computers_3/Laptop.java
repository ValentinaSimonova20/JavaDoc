package computers_3;

/**
 * Класс ноутбук - производный классс от класса компьютера
 * @author Симонова В.В.
 */
public class Laptop extends Computer{
    /** Поле для хранения типа usb порта ноутбука*/
    String usb;

    /**
     * Создает ноутбук с заданным расширением экрана ноутбука, объемом памяти, количеством ядер,
     * фирмой-производителем и типом usb порта
     * @param screen
     * @param memory
     * @param core
     * @param manufacturer
     * @param usb
     */
    public Laptop(String screen, String memory, int core, String manufacturer, String usb) {
        super(screen, memory, core, manufacturer);
        this.usb = usb;
    }

    /**
     * Создает ноутбук у которого задан только тип usb порта
     * @param usb строковое значение типа usb порта
     */
    public Laptop(String usb) {
        super();
        this.usb = usb;
    }

    /**
     * Создает ноутбук у которого не заданы расширение экрана, объем памяти, количество ядер, фирма-производитель
     * и тип usb-порта.
     */
    public Laptop(){
        super();
        this.usb = "0";
    }

    /**
     * Возвращает значение поля {@link Laptop#usb}
     * @return строковое значение типа usb порта
     */
    public String getUsb() {
        return usb;
    }

    /**
     * Устанавливает значение поля {@link Laptop#usb}
     * @param usb строковое значение типа usb порта
     */
    public void setUsb(String usb) {
        this.usb = usb;
    }
}
