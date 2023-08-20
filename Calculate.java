public class Calculate {
    /**
     * This is the main calculating function
     */
    private double num1;
    private double num2;
    private String sign;
    public Calculate(double num1, double num2, String sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public void calculateResult() {
        double result = switch (sign) {
            case "\\+" -> num1 + num2;
            case "\\-" -> num1 - num2;
            case "\\*" -> num1 * num2;
            case "\\/" -> num1 / num2;
            default -> 0.0;
        };
        System.out.println("Result: " + result);
    }
}
