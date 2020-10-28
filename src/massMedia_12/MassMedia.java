package massMedia_12;

import printedEdition_4.Magazine;

/**
 * Класс СМИ - базовый класс для хранения объектов телеканала и газет
 * @author Симонова В.В.
 */
public class MassMedia {

    /** После для хранения названия СМИ*/
    private String name;

    /**
     * Создает СМИ с заданным названием
     * @param name название СМИ
     */
    public MassMedia(String name) {
        this.name = name;
    }

    /**
     * Создает СМИ без названия
     */
    public MassMedia(){
        this.name = "Без названия";
    }


    /**
     * Возвращает значение поля {@link MassMedia#name}
     * @return строку с названием СМИ
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link MassMedia#name}
     * @param name название СМИ
     */
    public void setName(String name) {
        this.name = name;
    }
}
