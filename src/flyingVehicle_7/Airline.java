package flyingVehicle_7;

/**
 * Класс авиакомпания для хранения объектов самолета и вертолета
 * @author Симонова В.В.
 */
public class Airline {

    /** Поле для хранения списка летатльных аппаратов*/
    private FlyingVehicle[] flyingVehicles;

    /**
     * Создает авиакомпанию со списком летательных аппаратов
     * @param flyingVehicles - список летательных аппаратов
     */
    public Airline(FlyingVehicle[] flyingVehicles) {
        this.flyingVehicles = flyingVehicles;
    }

    /**
     * Возвращает количество летательных аппаратов - отдельно самолетов, отдельно вертолетов
     * @return строку с информацией о количестве самолетов и вертолетов
     */
    public String countVehicles(){
        int planes = 0;
        int helicopters = 0;
        for(FlyingVehicle flyingVehicle: flyingVehicles){
            if(flyingVehicle instanceof Plane) planes++;
            else helicopters++;
        }

        return "Самолетов: "+planes+". Вертолетов: "+helicopters;

    }
}
