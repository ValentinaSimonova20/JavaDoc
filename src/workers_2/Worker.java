package workers_2;

/**
 * Класс работник - базовый класс для объектов работника(работник на почасовой оплате и работнк на окладе)
 * @author Симонова В.В.
 */
public class Worker {
    /** Поле для хранения имени работника*/
    private String name;

    /** Поле для хранения фамилии работник*/
    private String surname;

    /** Поле для хранения ИНН работника*/
    private String ITN;

    /**
     * Создает работника с заданными значениями имени, фамилии и ИНН
     * @param name - имя работника
     * @param surname - фамилия работника
     * @param ITN - ИНН работника
     */
    public Worker(String name, String surname, String ITN) {
        this.name = name;
        this.surname = surname;
        this.ITN = ITN;
    }

    /**
     * Создает работника без имени, фамилии и ИНН
     */
    public Worker(){
        this.name = "Не задано";
        this.surname = "Не задано";
        this.ITN = "Не задано";
    }

    /**
     * Возвращает значение поля {@link Worker#name}
     * @return строку с именем работника
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link Worker#name}
     * @param name - имя работника
     */
    public void setName(String name) {
        name = name;
    }

    /**
     * Возвращает значение поля {@link Worker#surname}
     * @return строку с фамилией работника
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Устанавливает значение поля {@link Worker#surname}
     * @param surname - фамилия работника
     */
    public void setSurname(String surname) {
        surname = surname;
    }

    /**
     * Возвращает значение поля {@link Worker#ITN}
     * @return строку с ИНН работника
     */
    public String getITN() {
        return ITN;
    }

    /**
     * Устанавливает значение поля {@link Worker#ITN}
     * @param ITN - ИНН работника
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }
}
