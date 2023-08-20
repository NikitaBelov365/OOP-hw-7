public class FirstNumExtractor implements INumExtractor {
    /**
     * this method returns first number in String
     * @param inputedExpression your inputed expression String type
     * @return first number in inputed string
     */
    @Override
    public double extractor(String inputedExpression) {
        String splitter = SignAnalyzer.signAnalyzer(inputedExpression);
        String[] splittedExpression = inputedExpression.split(splitter);
        double firstNumber = Double.parseDouble(splittedExpression[0]);
        return firstNumber;
    }




}
