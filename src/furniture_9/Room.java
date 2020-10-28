package furniture_9;

/**
 * Класс комната - предназанчен для хранения объектов мебели(дивана и шкафа)
 * @author Симонова В.В.
 */
public class Room {

    /** Поле для хранения списка мебели комнаты*/
    private Furniture[] furnitures;

    /**
     * Создает комнату со списком мебели
     * @param furnitures - список мебели
     */
    public Room(Furniture[] furnitures) {
        this.furnitures = furnitures;
    }

    /**
     * Возвращает количество мебели отдельно количество шкафов и отдельно количество диванов
     * @return строку с количеством шкафов и диванов
     */
    public String countFurniture(){
        int sofa = 0;
        int cupboard = 0;

        for(Furniture furniture: furnitures){
            if(furniture instanceof Cupboard) cupboard++;
            else sofa++;
        }

        return "Кол-во диванов: "+sofa+". Кол-во шкафов: "+cupboard;
    }

}
