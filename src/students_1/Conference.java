package students_1;

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
     * Возвращает количество школьников и студентов на конференции
     * @return строка с информацей о количестве школьников и студентов на конференции
     */
    public String countLearns(){
        int studentUn = 0;
        int schoolboys = 0;

        for(Student student: students){
            if(student instanceof Schoolboy) schoolboys++;
            else studentUn++;
        }

        return "Школьников "+schoolboys+". Студентов "+studentUn+".";

    }



}
