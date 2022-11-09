public class WeatherChannel {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Display[] displays = ws(
                new CurrentConditions(ws),
                new ForecastDisplay(ws),
                new StatisticsDisplay(ws),
                );
        Display 0 :displays
    }
}