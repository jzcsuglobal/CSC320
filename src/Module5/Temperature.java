package Module5;

public class Temperature {
    private final int MAX_TEMP = 98;
    private final int MIN_TEMP = -20;

    private int _aveTemp = MIN_TEMP;
    private String _monthName = "";

    public Temperature(String monthName)
    {
        _monthName = monthName;
        _aveTemp = (int) ((Math.random() * MAX_TEMP) - (Math.abs(Math.random() * MIN_TEMP)));
    }

    public int get_aveTemp()
    {
        return _aveTemp;
    }

    public String get_monthName()
    {
        return _monthName;
    }

    public void set_aveTemp(int temp)
    {
        _aveTemp = temp;
    }
}
