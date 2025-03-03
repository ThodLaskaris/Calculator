package Calculator;

public enum Message {
    WELCOME_MSG("Simple Calculator 1.0\n"),
    FIRST_NUM("Enter the first number"),
    SECOND_NUM("Enter the second number"),
    OPERATOR("Enter an operator (+, - , *, /):"),
    ERROR_MSG("Error: Division by zero is not allowed"),
    INVALID_MSG("Error: Invalid operator."),
    RESULT_MSG("Result: "),
    EXIT_MSG("Type 'exit' to quit or press Enter to continue.");

    private final String text;

    Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
