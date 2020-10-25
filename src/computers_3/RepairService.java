package computers_3;

/**
 * Класс РемонтСервис - предназаначен для хранения ремонтируемых объектов телефона и ноутбука
 * @author Симонова В.В.
 */
public class RepairService {

    /** Поле для хранения объектов телефона и ноутбука*/
    private Computer[] computers;

    /**
     * Создает Ремонт Сервис со списком телефонов и ноутбуков
     * @param computers - список ремонтируемых компьютеров(телефоны и ноутбуки)
     */
    public RepairService(Computer[] computers) {
        this.computers = computers;
    }

    /**
     * Возвращает количество ноутбуков и телефонов на ремонте.
     * @return строка с информацией о количестве ноутбуков и телефонов на ремонте
     */
    public String countComputers(){
        int laptops = 0;
        int mobilePhones = 0;

        for(Computer computer: computers){
            if(computer instanceof Laptop) laptops++;
            else mobilePhones++;
        }

        return "Кол-во телефонов в ремонте: "+mobilePhones+". Кол-во ноутбуков в ремонте: "+laptops;
    }
}
