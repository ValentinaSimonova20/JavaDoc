package weapon_10;

/**
 * Класс оружейная палата - предназначен для хранения объектов холодного оружия и огнестрельного оружия
 */
public class ArmouryChamber {

    /** Поле для хранения списка оружия в оружейной палате*/
    private Weapon[] weapons;

    /**
     * Создает оружейную палату со списком оружия
     * @param weapons список оружия
     */
    public ArmouryChamber(Weapon[] weapons) {
        this.weapons = weapons;
    }

    /**
     * Возвращает количество оружия в орижейной палате (отдельно кол-во огнестрельного, отдельно холодного)
     * @return строку с количеством огнестрельного оружия и холодного оружия
     */
    public String countWeapon(){
        int meleeWeapon = 0;
        int firearm = 0;

        for(Weapon weapon: weapons){
            if(weapon instanceof Firearm) firearm++;
            else meleeWeapon++;
        }

        return "Огнестрельного оружия: "+firearm+". Холодного оружия: "+meleeWeapon;
    }
}
