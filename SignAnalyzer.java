public class SignAnalyzer {
    /**
     * this thing takes some expression to return sign
     * @param inputExpression your expression
     * @return +,-,*,/;
     */
    public static String signAnalyzer(String inputExpression) {
        String sign = "\\+";
        if (inputExpression.contains("-")) {
            sign = "\\-";
        } else if (inputExpression.contains("*")) {
            sign = "\\*";
        } else if (inputExpression.contains("/")) {
            sign = "\\/";
        }
        return sign;
    }
}
