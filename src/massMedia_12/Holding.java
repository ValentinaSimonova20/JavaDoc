package massMedia_12;

/**
 * Класс холдинг - предназанчен для хранения объектов телеканалов и газет
 * @author Симонова В.В.
 */
public class Holding {

    /** Поле для хранения списка телеканалов и газет*/
    private MassMedia[] massMedia;

    /**
     * Создает холдинг со списком СМИ(гезатами и телеканалами)
     * @param massMedia список СМИ
     */
    public Holding(MassMedia[] massMedia) {
        this.massMedia = massMedia;
    }

    /**
     * Возвращает количество СМИ отдельно газеты и отдельно телеканалы
     * @return строку с количеством газет и телеканалов
     */
    public String countMassMedia(){
        int newspapers = 0;
        int tvchannels = 0;

        for(MassMedia massMedia1: massMedia){
            if(massMedia1 instanceof Newspaper) newspapers++;
            else tvchannels++;
        }

        return "Кол-во газет: "+newspapers+". Кол-во телеканалов: "+tvchannels;
    }
}
