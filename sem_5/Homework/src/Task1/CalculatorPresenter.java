package Task1;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;


    public CalculatorPresenter(CalculatorModel model, CalculatorView view){
        this.model = model;
        this.view = view;
    }

    public void workButton(){
        view.greeting();
        String operation = view.getOperator();
        if (!operation.matches("[+\\-*/]")) {
            view.showError("Неправильный оператор");
            return;
        }
        double number1 = view.getNumber("первое");
        double number2 = view.getNumber("второе");
        try {
            switch (operation) {
                case "+":
                    view.getResult(model.add(number1, number2));
                    break;
                case "-":
                    view.getResult(model.substract(number1, number2));
                    break;
                case "*":
                    view.getResult(model.multiply(number1, number2));
                    break;
                case "/":
                    view.getResult(model.devide(number1, number2));
                    break;
            }
        } catch (IllegalArgumentException e) {
            view.showError(e.getMessage());
        }
        
    }
    
}
