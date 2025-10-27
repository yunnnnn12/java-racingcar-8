package racingcar;

import racingcar.controller.CarController;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarService carService = new CarService();
        OutputView outputView = new OutputView();

        CarController carController = new CarController(inputView, outputView, carService);
        carController.run();
    }
}
