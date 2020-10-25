package workers_2;

/**
 * Класс Предприятие - предназначен для хранения работников двух видов
 * @author Симонова В.В.
 */
public class Company {

    /** Поле для хранения списка работников предприятия */
    private Worker[] workers;

    /**
     * Создает предприятие со списком работников
     * @param workers - список работников
     */
    public Company(Worker[] workers) {
        this.workers = workers;
    }

    public String countWorkers(){
        int hourlyWorkers = 0;
        int salaryWorkers = 0;

        for(Worker worker: workers) {
            if (worker instanceof HourlyWorker) hourlyWorkers++;
            else salaryWorkers++;
        }

        return "Кол-во работников на почасовой оплате: "+hourlyWorkers+". "+
                "Кол-во работников на окладе: "+salaryWorkers;

    }
}
