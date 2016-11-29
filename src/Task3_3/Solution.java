package Task3_3;

/**
 * Created by Me Mkvia on 27.11.2016.
 */
import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Date startDate = new Date();
        Cource[] course = new Cource[6];
        course[0] = new Cource("Abrasive Wheels Safety", 48, "Worth");
        course[1] = new Cource("Safeguarding Awareness", 48, "Cass");
        course[2] = new Cource("Team Building and Conflict Management", 116, "Time");
        course[3] = new Cource("Textile Design", 202, "Campbell");
        course[4] = new Cource("Professional Cookery", 48, "Steve");
        course[5] = new Cource(startDate, "Performing Arts");


        Student st1 = new Student("Winston", "Washington", 10);
        Student st2 = new Student("Washington", course);



        CollegeStudent CS1 = new CollegeStudent("Helen", "Harper", 25);
        CollegeStudent CS2 = new CollegeStudent("Jones", 1, 1001);
        CollegeStudent CS3 = new CollegeStudent("Berry", course);



        SpecialStudent SS1 = new SpecialStudent("Peter", "Hunt", 7);
        SpecialStudent SS2 = new SpecialStudent("Canal", course);
        SpecialStudent SS3 = new SpecialStudent(11233);

    }
}