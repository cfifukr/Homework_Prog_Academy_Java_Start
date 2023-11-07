import static javax.swing.JOptionPane.*;

public class TaskOne {
    public static void main(String[] args) {

        int now = 2023, age, year;

        String res, txt = "Ваш возраст - ";
        res = showInputDialog(null,
                "Введите год вашего рождения?",
                "Определяем возраст",
                QUESTION_MESSAGE);
        year = Integer.parseInt(res);
        age = now - year;

        showMessageDialog(null,
                txt + age,
                "Возраст определен",
                ERROR_MESSAGE);

    }
}