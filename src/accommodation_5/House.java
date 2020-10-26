package accommodation_5;

/**
 * Класс Дом - предназначен для хранения объектов офиса и квартиры
 * @author Симонова В.В.
 */
public class House {

    /** Поле для хранения списка помещений (офисов и квартир)*/
    private Accommodation[] accommodations;

    /**
     * Создает дом с заданным списком офисов и квартир
     * @param accommodations - список помещений
     */
    public House(Accommodation[] accommodations) {
        this.accommodations = accommodations;
    }

    /**
     * Возвращает количество помещений - отдельно кол-во офисов и отдельно кол-во квартир
     * @return строку с информацией о количестве офисов и квартир в доме
     */
    public String countAccommodations(){
        int flats = 0;
        int offices = 0;
        for(Accommodation accommodation: accommodations){
            if(accommodation instanceof Office) offices++;
            else flats++;
        }

        return "В доме "+flats+" квартир. И "+offices+" офисов.";
    }
}
