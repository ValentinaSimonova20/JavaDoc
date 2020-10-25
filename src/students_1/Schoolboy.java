package students_1;

/**
 * Класс Школьник - производный класс от класса учащихся
 * @author Симонова В.В.
 */
public class Schoolboy extends Student{
    /** Поле для хранения номера школы*/
    int schoolNumber;

    /**
     * Создает школьника с заданным значением номера школы, без имени и фамилии
     * @param schoolNumber
     */
    public Schoolboy(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * Создает школьника с фамилией, именем, возрастом и номером школы
     * @param surname
     * @param name
     * @param age
     * @param schoolNumber
     */
    public Schoolboy(String surname, String name, int age, int schoolNumber) {
        super(surname, name, age);
        this.schoolNumber = schoolNumber;
    }

    /**
     * Возвращает значение поля {@link Schoolboy#schoolNumber}
     * @return целое значение номера школы
     */
    public int getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * Устанавливает значение поля {@link Schoolboy#schoolNumber}
     * @param schoolNumber - значение номера школы
     */
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
}
