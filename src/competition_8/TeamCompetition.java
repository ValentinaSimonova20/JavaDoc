package competition_8;

/**
 * Класс командные соревнования - производный класс от класса Соревнования
 * @author Симонова В.В.
 */
public class TeamCompetition extends Competition{

    /** Поле для хранения названия команд участников*/
    private String[] teams;

    /**
     * Создает командное соревнование с заданными названием, призом и списком команд
     * @param name - название командного соревнования
     * @param prize - приз за победу в командном соревновании
     * @param teams - список команд соревнования
     */
    public TeamCompetition(String name, String prize, String[] teams) {
        super(name, prize);
        this.teams = teams;
    }

    /**
     * Создает командное соревнование с заданным списком команд участников, без названия и без приза
     * @param teams - список команд участников
     */
    public TeamCompetition(String[] teams) {
        super();
        this.teams = teams;
    }

    /**
     * Создает командное соревнование без названия, без приза и без списка участников
     */
    public TeamCompetition(){
        super();
        this.teams = null;
    }

    /**
     * Возвращает значение поля {@link TeamCompetition#teams}
     * @return список команд участников соревнования
     */
    public String[] getTeams() {
        return teams;
    }

    /**
     * Устанавливает значение поля {@link TeamCompetition#teams}
     * @param teams список команд  участников соревнования
     */
    public void setTeams(String[] teams) {
        this.teams = teams;
    }
}
