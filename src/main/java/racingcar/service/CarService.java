package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name, 0));
        }
        return cars;
    }

    public void race(List<Car> cars, int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            moveCars(cars);
        }
    }

    private void moveCars(List<Car> cars) {
        for (Car car : cars) {
            if (getRandomNum() >= 4) {
                car.move();
            }
        }
    }

    public int getRandomNum() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public List<String> selectWinners(List<Car> cars) {
        int max = cars.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElse(0);

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMoveCount() == max) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
}
