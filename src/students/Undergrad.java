package students;

/**
 * Класс Студент - производный класс от класса учащегося
 * @author Симонова В.В.
 */
public class Undergrad extends Student{
    /** Поле для хранения номера университета */
    private int universityNumber;

    /**
     * Создает студента без имени, фамилии и возраста, с номером университета
     * @param universityNumber - номер университета
     */
    public Undergrad(int universityNumber) {
        this.universityNumber = universityNumber;
    }

    /**
     * Создает студента с заданными фамилией, именем, возрастом и номером университета
     * @param surname - фамилия студента
     * @param name - имя студента
     * @param age - возраст стулента
     * @param universityNumber - номер университета
     */
    public Undergrad(String surname, String name, int age, int universityNumber) {
        super(surname, name, age);
        this.universityNumber = universityNumber;
    }

    /**
     * Возвращает значение поля {@link Undergrad#universityNumber}
     * @return целое значение номера университета студента
     */
    public int getUniversityNumber() {
        return universityNumber;
    }

    /**
     * Устанавливает значение поля {@link Undergrad#universityNumber}
     * @param universityNumber - значение номера университета студента
     */
    public void setUniversityNumber(int universityNumber) {
        this.universityNumber = universityNumber;
    }
}
