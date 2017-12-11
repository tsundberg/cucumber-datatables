package se.thinkcode;

import cucumber.api.java.en.Given;

import java.util.List;

public class DatatableSteps {
    @Given("^the following day values$")
    public void the_following_day_values(List<DayValue> dayValues) {
        for (DayValue dayValue : dayValues) {
            System.out.println(dayValue);
        }
    }
}
