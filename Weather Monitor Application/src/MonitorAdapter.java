/**
 * An interface for MonitorAdapter
 * Author: Yifei (Freya) Gao, Yun Hao (Jack) Zhang
 */
public interface MonitorAdapter {
    void displayTemperature(String temperature,String temperatureTimeStamp);

    void displayRainFall(String rainFall, String rainFallTimeStamp);

    void disposeMyself();

    void setLocationObserver(LocationObserver locationObserver);
}
