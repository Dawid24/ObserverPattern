package notifications;

import order.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
