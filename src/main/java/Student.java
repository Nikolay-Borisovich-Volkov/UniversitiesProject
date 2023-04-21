
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Student {
    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public String getFullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUniversityId() {
        return universityId;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Student setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Студент {");
        sb.append("ФИО: ").append(getFullName());
        sb.append(", id университета: ").append(getUniversityId());
        sb.append(", Номер текущего курса: ").append(getCurrentCourseNumber());
        sb.append(", Средний балл: ").append(getAvgExamScore());
        sb.append("}");
        return sb.toString();
    }
}
