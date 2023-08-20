import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExpression implements IInputExpression {

    /**
     * Класс отвечает за пользовательский ввод
     *
     * @return строку, которую ввёл юзер
     */
    @Override
    public String inputExpression() {
        Scanner scanner = new Scanner(System.in);

        String expression = null;
        while (expression == null) {
            try {
                System.out.println("Input expression: ");
                expression = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input expression in full");
            } finally {
                scanner.close();
            }
        }
        return expression;
    }
}
