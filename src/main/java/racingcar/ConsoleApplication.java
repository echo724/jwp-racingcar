package racingcar;

import racingcar.controller.RacingCarController;

public class ConsoleApplication {
    
    public static void main(final String[] args) {
        final RacingCarController racingCarController = new RacingCarController();
        racingCarController.run();
    }
}
