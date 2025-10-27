package racingcar.controller;

import racingcar.model.Car;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class CarController {

    private InputView inputView;
    private CarService carService;
    private OutputView outputView;

    public CarController(InputView inputView, OutputView outputView, CarService carService) {
        this.inputView = inputView;
        this.carService = carService;
        this.outputView = outputView;
    }

    public void run() {
        List<String> carNames = inputView.returnCarname();
        int tryCount = inputView.returnTryCount();

        List<Car> cars = carService.createCars(carNames);
        carService.race(cars, tryCount);
        outputView.returnResult(cars);

        List<String> winners = carService.selectWinners(cars);
        outputView.returnWinners(winners);
    }
}
