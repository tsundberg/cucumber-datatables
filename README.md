# Cucumber datatables
A sample using Cucumber data tables.

It converts this data table

```
And the following day values
  | day | num | denom | kpi           |
  | mon | 1   | 1     | cancellations |
  | tue | 2   | 2     | cancellations |
  | wed | 3   | 151   | cancellations |
```

to a custom type that looks like this:

```
public class DayValue {
    private String day;
    private Integer num;
    private Integer denom;
    private String kpi;

    public DayValue(String day, Integer num, Integer denom, String kpi) {
        this.day = day;
        this.num = num;
        this.denom = denom;
        this.kpi = kpi;
    }

    @Override
    public String toString() {
        return "DayValue{" +
                "day='" + day + '\'' +
                ", num=" + num +
                ", denom=" + denom +
                ", kpi='" + kpi + '\'' +
                '}';
    }
}
```

A step that can use this data table may look like this:
```
@Given("^the following day values$")
public void the_following_day_values(List<DayValue> dayValues) {
    for (DayValue dayValue : dayValues) {
        System.out.println(dayValue);
    }
}
```


More like this can be found at my blog at [Think Code AB](http://www.thinkcode.se/blog/category/Cucumber).

If you want to learn more about Behaviour-Driven Development (BDD) or Cucumber, please contact me at [thomas@thinkcode.se](mailto:thomas@thinkcode.se)
