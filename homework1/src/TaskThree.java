import static javax.swing.JOptionPane.*;

public class TaskThree {

    public static void main(String[] args){
        int now = 2023;

        int age = Integer.parseInt(showInputDialog(null,
                "Введите свой возраст",
                "Считаем год вашего рождения",
                QUESTION_MESSAGE));
        showMessageDialog(null,
                "Вы родились  - " + ((now - age)),
                "Год рождения успешно высчитан",
                INFORMATION_MESSAGE);
    }
}
