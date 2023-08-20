
public class Main {
    public static void main(String[] args) {
        Greeting.sayHello();

        InputExpression inputExpression = new InputExpression();
        String inputedExpression = inputExpression.inputExpression();

        String noSpacesExpression = SpaceDeleter.spaceDeleter(inputedExpression);

        FirstNumExtractor firstNumExtractor = new FirstNumExtractor();
        SecongNumExtractor secongNumExtractor = new SecongNumExtractor();
        double firstNum = firstNumExtractor.extractor(noSpacesExpression);
        double secondNum = secongNumExtractor.extractor(noSpacesExpression);
        String sign = SignAnalyzer.signAnalyzer(noSpacesExpression);

        Calculate calculate = new Calculate(firstNum, secondNum, sign);
        calculate.calculateResult();


    }


}