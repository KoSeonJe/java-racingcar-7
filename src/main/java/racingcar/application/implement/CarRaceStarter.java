package racingcar.application.implement;

import static racingcar.common.constant.RacingCarConstant.MAX_RANDOM_BOUND;
import static racingcar.common.constant.RacingCarConstant.MIN_RANDOM_BOUND;
import static racingcar.common.constant.RacingCarConstant.MOVE_THRESHOLD;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.domain.CarRacer;

public class CarRaceStarter implements RaceStarter<CarRacer> {

    @Override
    public void start(List<CarRacer> carRacers) {
        carRacers.forEach(racingCar -> {
            if (isMovable()) {
                racingCar.forward();
            }
        });
    }

    private boolean isMovable() {
        int randomValue = Randoms.pickNumberInRange(MIN_RANDOM_BOUND, MAX_RANDOM_BOUND);
        return randomValue >= MOVE_THRESHOLD;
    }
}
