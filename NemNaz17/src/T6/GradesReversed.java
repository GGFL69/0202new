package T6;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно":    return "5";
            case "Потрясающе":    return "4";
            case "Восхитительно": return "3";
            case "Прекрасно":     return "2";
            default:              return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> list = new ArrayList<>();
        for (String line : grades) {
            String[] parts = line.split(" ");
            // parts: [Имя, Фамилия, предмет, —, Оценка]
            String name = parts[0].toLowerCase();
            String surname = parts[1].toLowerCase();
            String subject = parts[2].toLowerCase();
            String grade = gradeStringToInt(parts[4]);
            list.add(String.join(",", name, surname, subject, grade));
        }
        return String.join(";", list);
    }
}
