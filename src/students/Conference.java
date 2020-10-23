package students;

/**
 * Класс Конференция - предназначен для создании конференции
 * с участием студентов и школьников
 * @author Симонова В.В.
 */
public class Conference {
    /** Поле для хранения списка участников конференции */
    private Student[] students;

    /**
     * Создает конференция со списком учащихся
     * @param students - список учащихся
     */
    public Conference(Student[] students) {
        this.students = students;
    }

    /**
     * Возвращает количество школьников на конференции
     * @return целое значение количества школьников на конференции
     */
    public int countSchoolboys(){
        int res = 0;
        for(Student student: students)
            if(student instanceof Schoolboy) res++;

        return res;
    }

    /**
     * Возвращает количество студентов на конференции
     * @return целое значение количества студентов на конференции
     */
    public int countUndergrad(){
        int res = 0;
        for(Student student: students)
            if(student instanceof Undergrad) res++;

        return res;
    }


}
