package competition_8;

/**
 * Класс Чемпионат - предназанчен для хранения объектов командных соревнований и личных соревнований
 * @author Симонова В.В.
 */
public class Championship {

    /** Поле для хранения списка соревнований*/
    private Competition[] competitions;

    /**
     * Создает чемпионат со списком соревнований
     * @param competitions - список соревнований
     */
    public Championship(Competition[] competitions) {
        this.competitions = competitions;
    }

    /**
     * Возвращает количество соревнований отдельно личных и отдельно командных
     * @return строку с информацией о количестве соревнований
     */
    public String countCompetitions(){
        int personalComp = 0;
        int teamComp = 0;
        for(Competition competition: competitions){
            if(competition instanceof TeamCompetition) teamComp++;
            else personalComp++;
        }

        return "Командных соревнований: "+teamComp+". Личных соревнований: "+personalComp;
    }
}
