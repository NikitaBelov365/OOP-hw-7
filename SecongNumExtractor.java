public class SecongNumExtractor implements INumExtractor {
    /**
     * this method returns second number in String
     *
     * @param inputedExpression your inputed expression String type
     * @return second number in inputed string
     */
    @Override
    public double extractor(String inputedExpression) {
        String splitter = SignAnalyzer.signAnalyzer(inputedExpression);
        String[] splittedExpression = inputedExpression.split(splitter);
        double secondNumber = Double.parseDouble(splittedExpression[1]);
        return secondNumber;
    }
}

