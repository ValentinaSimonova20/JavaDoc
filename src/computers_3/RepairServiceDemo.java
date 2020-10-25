package computers_3;

public class RepairServiceDemo {
    public static void main(String[] args) {
        Laptop hp = new Laptop("1080x1060", "1тб",3,"hp","3.0");
        Laptop hp2 = new Laptop("1080x1060", "1тб",3,"hp","3.0");
        Laptop hp3 = new Laptop("1080x1060", "1тб",3,"hp","3.0");

        MobilePhone iphone = new MobilePhone("1792x828","246гб",6,"Apple","13mp",2);
        MobilePhone iphone2 = new MobilePhone("1792x828","246гб",6,"Apple","13mp",2);
        MobilePhone iphone3 = new MobilePhone("1792x828","246гб",6,"Apple","13mp",2);
        MobilePhone iphone4= new MobilePhone("1792x828","246гб",6,"Apple","13mp",2);
        MobilePhone iphone5 = new MobilePhone("1792x828","246гб",6,"Apple","13mp",2);

        RepairService repairService = new RepairService(new Computer[]{hp,iphone,hp3,iphone3,hp2,iphone2,iphone4,iphone5});

        System.out.println(repairService.countComputers());
    }
}
