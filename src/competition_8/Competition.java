package competition_8;

import workers_2.Company;

/**
 * Класс соревнование. Базовый класс для объектов командные соревнования и личные соревнования
 */
public class Competition {

    /** Поле для хранения названия соревнования*/
    private String name;

    /** Поле для хранения названия приза сореванования*/
    private String prize;

    /**
     * Создает соревнование с заданными названия соревнований и призом за победу в соревновании
     * @param name - название соревнования
     * @param prize - название приза за победу в соревновании
     */
    public Competition(String name, String prize) {
        this.name = name;
        this.prize = prize;
    }

    /**
     * Создает соревнование без названия и без приза
     */
    public Competition(){
        this.name = "Без названия";
        this.prize = "Приз отсутствует";
    }

    /**
     * Возвращает значение поля {@link Competition#name}
     * @return строку с названием соревнования
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link Competition#name}
     * @param name - строка с названием соревнования
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает значение поля {@link Competition#prize}
     * @return строку с названием приза
     */
    public String getPrize() {
        return prize;
    }

    /**
     * Устанавливает значение поля {@link Competition#prize}
     * @param prize - строка с названием приза
     */
    public void setPrize(String prize) {
        this.prize = prize;
    }
}
