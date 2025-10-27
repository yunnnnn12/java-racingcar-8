package racingcar.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {

    public static void validateCarNames(List<String> names) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 비어 있습니다.");
        }

        Set<String> nameSet = new HashSet<>();
        for (String name : names) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 비어있을 수 없습니다.");
            }
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
            }
            if (name.matches("\\d+")) {
                throw new IllegalArgumentException("자동차 이름은 숫자만으로 구성될 수 없습니다.");
            }
            if (!nameSet.add(name)) {
                throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
            }
        }
    }

    public static void validateTryCount(int tryCount) {
        if (tryCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }

    public static int parseAndValidateTryCount(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
        int tryCount = Integer.parseInt(input);
        validateTryCount(tryCount);
        return tryCount;
    }
}
