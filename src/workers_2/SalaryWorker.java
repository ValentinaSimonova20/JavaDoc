package workers_2;


/**
 * Класс работник на окладе - производный класс от класса работника
 */
public class SalaryWorker extends Worker{
    /** Поле для хранения оклада работника*/
    private double salary;

    /**
     * Создает работника на окладе с заданными именем, фамилией, ИНН и окладом
     * @param name - имя работника на окладе
     * @param surname - фамилия работника на окладе
     * @param ITN - ИНН работника на окладе
     * @param salary - оклад работника
     */
    public SalaryWorker(String name, String surname, String ITN, int salary) {
        super(name, surname, ITN);
        this.salary = salary;
    }

    /**
     * Создает работника на окладе, у которого задан только оклад
     * @param salary
     */
    public SalaryWorker(int salary) {
        super();
        this.salary = salary;
    }

    /**
     * Создает работника, у которого не заданы имя, фамилия, ИНН, с окладом равным 0
     */
    public SalaryWorker(){
        super();
        this.salary = 0.0;
    }

    /**
     * Возвращает значение поля {@link SalaryWorker#salary}
     * @return вещественное значение зарплаты работника
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Устанавливает значение поля {@link SalaryWorker#salary}
     * @param salary - вещественное значение зарплаты работника
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
