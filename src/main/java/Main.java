
public class Main {
    public static void main(String[] args) {
      University university = new University("МГУ", "Московский Государственный Университет имени Михаила Васильевича Ломоносова", "МГУ им.М.В.Ломоносова",1755, StudyProfile.PHILOSOPHY);
      Student student = new Student("Иванов Иван Иванович", "МГУ",1,5);
        System.out.println(university);
        System.out.println(student);

    }
}