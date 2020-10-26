package workers_2;

/**
 * Класс работник на почасовой оплате - производный класс от класса работника
 * @author Симонова В.В.
 */
public class HourlyWorker extends Worker{
    /** Поле для хранения оплаты за час работнику*/
    private double salaryPerHour;

    /**
     * Создает работника на почасовой оплате с заданными именем, фамилией, ИНН и оплатой за час
     * @param name - имя работника на почасовой оплате
     * @param surname - фамилия работника на почасовой оплате
     * @param ITN - ИНН работника на почасовой оплате
     * @param salaryPerHour - почасовая оплата работника
     */
    public HourlyWorker(String name, String surname, String ITN, double salaryPerHour) {
        super(name, surname, ITN);
        this.salaryPerHour = salaryPerHour;
    }

    /**
     * Создает работника на почасовой оплате, у которого задана только почасовая оплата
     * @param salaryPerHour - почасовая оплата
     */
    public HourlyWorker(double salaryPerHour) {
        super();
        this.salaryPerHour = salaryPerHour;
    }

    /**
     * Создает работника на почасовой оплате, у которого не заданы имя, фамилия и Инн, а почасовая оплата равна нулю
     */
    public HourlyWorker(){
        super();
        this.setSalaryPerHour(0);
    }

    /**
     * Возвращает значение поля {@link HourlyWorker#salaryPerHour}
     * @return вещественное значение почасовой оплаты
     */
    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    /**
     * Устанавливает значение поля {@link HourlyWorker#salaryPerHour}
     * @param salaryPerHour вещественное значение почасовой оплаты
     */
    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
