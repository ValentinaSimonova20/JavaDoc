package students_1;

public class ConferenceDemo {
    public static void main(String[] args) {
        Schoolboy John = new Schoolboy("Black","John",15,5);
        Schoolboy Sam = new Schoolboy("Black","Sam",12,6);
        Schoolboy Ann = new Schoolboy("White","Ann",17,8);
        Schoolboy Ben = new Schoolboy("White","Ben",17,8);

        Undergrad Tim = new Undergrad("Black","Tim",19,1212);
        Undergrad Alex = new Undergrad("Black","Alex",17,1213);
        Undergrad Jim = new Undergrad("White","jim",20,1216);

        Student[] conferenceMembers = {John, Sam, Ann, Tim, Alex, Jim, Ben};

        Conference conference = new Conference(conferenceMembers);

        System.out.println(conference.countLearns());

    }
}
