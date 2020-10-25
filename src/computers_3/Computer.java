package computers_3;

import workers_2.Company;

/**
 * Класс компьютер - базовый класс для объектов ноутбуков и смартфонов
 * @author Симонова В.В.
 */
public class Computer {
    /** Поле для хранения размера экрана компьюетра*/
    private String screen;

    /** Поле для хранения памяти компьютера*/
    private String memory;

    /** Поле для хранения количества ядер еомпьюетра */
    private int core;

    /** Поле для хранения фирмы компьюетра*/
    private String manufacturer;

    /**
     * Создает компьютер с заданными значениями размера экрана, количества памяти, количества ядер и производителя
     * @param screen - размер экрана компьютера
     * @param memory - объем памяти компьюетра
     * @param core - количество ядер компьюетра
     * @param manufacturer - фирма-производитель компьюетра
     */
    public Computer(String screen, String memory, int core, String manufacturer) {
        this.screen = screen;
        this.memory = memory;
        this.core = core;
        this.manufacturer = manufacturer;
    }

    /**
     * Создает компьютер с нулевыми параметрами и с фирмой без названия
     */
    public Computer(){
        this.screen = "0x0";
        this.memory = "0mb";
        this.core = 0;
        this.manufacturer = "Без названия";
    }

    /**
     * Возвращает значение поля {@link Computer#screen}
     * @return строку с размером экрана компьютера
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Устанавливает значение поля {@link Computer#screen}
     * @param screen - размер экрана компьютера
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * Возвращает значение поля {@link Computer#memory}
     * @return строку с объемом памяти компьютера
     */
    public String getMemory() {
        return memory;
    }

    /**
     * Устанавливает значение поля {@link Computer#memory}
     * @param memory - объем памяти компьютера
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * Возвращает значение поля {@link Computer#core}
     * @return целое число ядер компьютера
     */
    public int getCore() {
        return core;
    }

    /**
     * Устанавливает значение поля {@link Computer#core}
     * @param core - количество ядер компьютера
     */
    public void setCore(int core) {
        this.core = core;
    }

    /**
     * Возвращает значение поля {@link Computer#manufacturer}
     * @return строку с названием фирмы-производителя компьютера
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Устанавливает значение поля {@link Computer#manufacturer}
     * @param manufacturer - фирма-производитель компьютера
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
