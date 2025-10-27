package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {

    public void returnResult(List<Car> cars) {
        for (Car car : cars) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < car.getMoveCount(); i++) {
                sb.append("-");
            }
            System.out.println(car.getName() + " : " + sb.toString());
        }
        System.out.println();
    }

    public void returnWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
