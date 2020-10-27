package competition_8;

/**
 * Класс личные соревнования - производный класс от класса соренования
 * @author Симонова В.В.
 */
public class PersonalCompetition extends Competition{

    /** Поле для хранения ФИО участников соревнования*/
    private String[] participants;

    /**
     * Создает личное соревнование с заданным названием, призом и списком ФИО участников
     * @param name - название личных соревнований
     * @param prize - приз за победу в личных соревнования
     * @param participants - список ФИО участников в личных соревнованиях
     */
    public PersonalCompetition(String name, String prize, String[] participants) {
        super(name, prize);
        this.participants = participants;
    }

    /**
     * Создает личное соревнование с названием "Без названия", с отсутствующим призом и со списком ФИО участников
     * @param participants
     */
    public PersonalCompetition(String[] participants) {
        super();
        this.participants = participants;
    }

    /**
     * Создает личное соревнование с названием "Без названия", с отсутствующим призом и с незаданным списком ФИО участников
     */
    public PersonalCompetition(){
        super();
        this.participants = null;
    }

    /**
     * Возвращает значение поля {@link PersonalCompetition#participants}
     * @return список ФИО участников
     */
    public String[] getParticipants() {
        return participants;
    }

    /**
     * Устанавливает значение поля {@link PersonalCompetition#participants}
     * @param participants - список ФИО участников
     */
    public void setParticipants(String[] participants) {
        this.participants = participants;
    }
}
