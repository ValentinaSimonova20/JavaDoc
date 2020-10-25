package students_1;

/**
 * Класс учащийся - базовый класс для объектов учащихся(школьник, студент)
 * @author Симонова В.В.
 */
public class Student {
    /** Поле для хранения фамилии учащегося */
    private String surname;

    /** Поле для хранения имени учащегося */
    private String name;

    /** Поле для хранения возвраста учащегося */
    private int age;


    /**
     * Создает учащегося без имени, фамилии и возраста
     */
    public Student() {
        this.surname = "Не задано";
        this.name = "Не задано";
        this.age = 0;
    }

    /**
     * Создает учащегося с заданными значениями имени, фамилии и возраста
     * @param surname - фамилия учащегося
     * @param name - имя учащегося
     * @param age - возраст учащегося
     */
    public Student(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    /**
     * Возвращает значение поля {@link Student#surname}
     * @return строку с фамилией учащегося
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Устанавливает значение поля{@link Student#surname}
     * @param surname - значение фамилии учащегося
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Возвращает значение поля {@link Student#name}
     * @return строку с именем учащегося
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@link Student#name}
     * @param name - значение имени учащегося
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает значение поля {@link Student#age}
     * @return целое значение возраста учащегося
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает значение поля {@link Student#age}
     * @param age - значение возраста учащегося
     */
    public void setAge(int age) {
        this.age = age;
    }
}
