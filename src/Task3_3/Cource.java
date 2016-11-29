package Task3_3;

/**
 * Created by Me Mkvia on 27.11.2016.
 */
import java.util.Date;

    public class Cource {
        private Date startDate;
        private String name;
        private int hoursDuration;
        private String teacherName;


        public Cource(Date startDate, String name) {
            this.startDate = startDate;
            this.name = name;
        }

        public Cource(String name, int hoursDuration, String teacherName) {
            this.name = name;
            this.hoursDuration = hoursDuration;
            this.teacherName = teacherName;
        }

        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHoursDuration() {
            return hoursDuration;
        }

        public void setHoursDuration(int hoursDuration) {
            this.hoursDuration = hoursDuration;
        }

        public String getTeacherName() {
            return teacherName;
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }
    }

