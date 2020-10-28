package furniture_9;

import java.awt.geom.CubicCurve2D;

/**
 * Класс шкафа - производный класс класса мебель
 */
public class Cupboard extends Furniture{

    /** Поле для хранения объема шкафа*/
    double volume;

    /**
     * Создает шкаф с заданным названием, ценой и объемом
     * @param name - название шкафа
     * @param price - цена шкафа
     * @param volume - объем шкафа
     */
    public Cupboard(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    /**
     * Создает шкаф без название, с ценой 0 и с заданным объемом
     * @param volume - объем шкафа
     */
    public Cupboard(double volume) {
        super();
        this.volume = volume;
    }

    /**
     * Создает шкаф без название, с ценой 0 и с объемом 0
     */
    public Cupboard(){
        super();
        this.volume = 0;
    }

    /**
     * Возвращает значение поля {@link Cupboard#volume}
     * @return вещественное значение объема шкафа
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Устанавливает значение поля {@link Cupboard#volume}
     * @param volume - объем шкафа
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
