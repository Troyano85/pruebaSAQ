package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target INPUT_USER_NAME = Target.the("write username")
            .locatedBy("");

    public static final Target INPUT_PASSWORD= Target.the("write password")
            .locatedBy("");

    public static final Target BTN_SUBMIT= Target.the("dropdown example")
            .locatedBy("");


}

