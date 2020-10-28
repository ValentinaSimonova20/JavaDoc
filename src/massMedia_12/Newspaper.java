package massMedia_12;

/**
 * Класс газета - производный класс класса СМИ
 * @author Симонова В.В.
 */
public class Newspaper extends MassMedia{

    /** Поле для хранения тиража газеты*/
    private int edition;

    /**
     * Создает газету с заданными значениями названия и тиража
     * @param name название газеты
     * @param edition тираж газеты
     */
    public Newspaper(String name, int edition) {
        super(name);
        this.edition = edition;
    }

    /**
     * Создает газету без названия и с заданным тиражем
     * @param edition
     */
    public Newspaper(int edition) {
        super();
        this.edition = edition;
    }

    /**
     * Создает газету без названия и с тиражем 0
     */
    public Newspaper(){
        super();
        this.edition = 0;
    }

    /**
     * Возвращает значение поля {@link Newspaper#edition}
     * @return целое число тиража газеты
     */
    public int getEdition() {
        return edition;
    }

    /**
     * Устанавливает значение поля {@link Newspaper#edition}
     * @param edition тираж газеты
     */
    public void setEdition(int edition) {
        this.edition = edition;
    }
}
