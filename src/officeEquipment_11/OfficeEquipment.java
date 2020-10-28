package officeEquipment_11;

/**
 * Класс оргтехника - базовый класс для объектов принтера и сканера
 * @author Симонова В.В.
 */
public class OfficeEquipment {

    /** Поле для хранения цены оргтехники*/
    private double price;

    /** Поле для хранения фирмы производителя оргтехники*/
    private String firm;

    /**
     * Создает оргтехнику с заданными ценой и фирмой
     * @param price цена оргтехники
     * @param firm фирма оргтехники
     */
    public OfficeEquipment(double price, String firm) {
        this.price = price;
        this.firm = firm;
    }

    /**
     * Создает оргтехнику с ценой 0 и фирмой производителем Без названия
     */
    public OfficeEquipment(){
        this.price = 0;
        this.firm = "Без названия";
    }

    /**
     * Возвращает значение поля {@link OfficeEquipment#price}
     * @return вещественное число с ценой оргтехники
     */
    public double getPrice() {
        return price;
    }

    /**
     * Устанавливает значение поля {@link OfficeEquipment#price}
     * @param price вещественное число с ценой оргтехники
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Возвращает значение поля {@link OfficeEquipment#firm}
     * @return строку с названием фирмы оргтехники
     */
    public String getFirm() {
        return firm;
    }

    /**
     * Устанавливает значение поля {@link OfficeEquipment#firm}
     * @param firm строка с названием фирмы оргтехники
     */
    public void setFirm(String firm) {
        this.firm = firm;
    }
}
