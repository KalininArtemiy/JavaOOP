package Task1;
public class Main {
    public static void main(String[] args) throws Exception {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        presenter.workButton();
    }
}
