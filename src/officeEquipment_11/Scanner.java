package officeEquipment_11;

/**
 * Класс сканнер - производный класс от класса оргтехника
 * @author Симонова В.В.
 */
public class Scanner extends OfficeEquipment{

    /** Поле для хранения типа датчика сканера*/
    String sensorType;

    /**
     * Создает сканнер с заданными значениями цены, фирмой производителем и типом датчика
     * @param price цена сканера
     * @param firm фирма производитель сканера
     * @param sensorType тип датчика сканера
     */
    public Scanner(double price, String firm, String sensorType) {
        super(price, firm);
        this.sensorType = sensorType;
    }

    /**
     * Создает сканер с ценой 0, с фирмой без названия и с заданным типом датчика
     * @param sensorType тип датчика сканера
     */
    public Scanner(String sensorType) {
        super();
        this.sensorType = sensorType;
    }

    /**
     * Создает сканер с ценой 0, с фирмой без названия и с типом датчика без названия
     */
    public Scanner(){
        super();
        this.sensorType = "Без названия";
    }

    /**
     * Возвращает значение поля {@link Scanner#sensorType}
     * @return строка с названием типа датчика сенсора
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Устанавливает значение поля {@link Scanner#sensorType}
     * @param sensorType строка с названием типа датчика
     */
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
}
