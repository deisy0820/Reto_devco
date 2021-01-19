package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ReserverHotel {

    public static final Target GOING_TO = Target.the("Fild Goind").located(By.className("uitk-faux-input"));
    public static final Target GOID_TO_DESTINATION = Target.the("Fild Goind_Destination").located(By.className("uitk-field-input uitk-typeahead-input"));
    public static final Target LIST = Target.the("Fild List").located(By.xpath("public static final Target GOING_TO = Target.the(\"Fild Goind\").located(By.className(\"uitk-faux-input\"));\n"));
    public static final Target CHECK_IN = Target.the("Fild Check_in").located(By.xpath("//*[@id=\"d1-btn\"]"));
    public static final Target CHECK_ON = Target.the("Fild Check_on").located(By.xpath("//*[@id=\"d2-btn\"]"));
    public static final Target TRAVELERS = Target.the("Fild Travelers").located(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[3]/div/div/button[1]"));
    public static final Target SEARCH = Target.the("Fild Search").located(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/button"));


}
