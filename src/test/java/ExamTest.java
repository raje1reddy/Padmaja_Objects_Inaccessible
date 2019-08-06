import static org.junit.Assert.*;

public class ExamTest {

    @org.junit.Test
    public void setName() {
        Exam myExam =  new Exam();
        myExam.setName("OCA Java Programmer 1");
        myExam = null;
        myExam = new Exam();
        myExam.setName("PHP");


    }
}