package se.thinkcode;

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

    public String getDay() {
        return day;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getDenom() {
        return denom;
    }

    public String getKpi() {
        return kpi;
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