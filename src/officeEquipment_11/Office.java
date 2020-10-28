package officeEquipment_11;

/**
 * Класс офис - предназначен для хранения объектов принтера и сканера
 * @author Симонова В.В.
 */
public class Office {

    /** Поле для хранения списка оргтехники офиса*/
    private OfficeEquipment[] officeEquipments;

    /** Создает офис с заданным списком оргтехники*/
    public Office(OfficeEquipment[] officeEquipments) {
        this.officeEquipments = officeEquipments;
    }

    /**
     * Возвращает количество оргтехники офиса - отдельно сканеров, отдельно принтеров
     * @return строку с количеством сканеров и принтеров офиса
     */
    public String countEquipment(){
        int printers = 0;
        int scanners = 0;

        for(OfficeEquipment officeEquipment:officeEquipments){
            if(officeEquipment instanceof Printer) printers++;
            else scanners++;
        }

        return "Принтеров: "+printers+". Сканеров: "+scanners;
    }
}
