package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static final String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public String readCarNames() {
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
        return Console.readLine();
    }
}