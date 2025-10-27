package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.service.Validator;

import java.util.ArrayList;

public class InputView {

    public ArrayList<String> returnCarname() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();

        ArrayList<String> names = new ArrayList<>();
        String[] tokens = carNames.split(",", -1);
        for (String token : tokens) {
            names.add(token.trim());
        }

        Validator.validateCarNames(names);
        return names;
    }

    public int returnTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String strInput = Console.readLine();
        return Validator.parseAndValidateTryCount(strInput);
    }
}
