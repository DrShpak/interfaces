public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf();
        Elf elf2 = new Elf();

        Orc orc1 = new Orc();
        Orc orc2 = new Orc();

        Gnome gnome1 = new Gnome();
        Gnome gnome2 = new Gnome();



        /*
        Демонстрация работы методов для Эльфа
         */

        /*System.out.println("default hillPoints = " + elf1.getHillPoints());
        System.out.println("default armorPoints = " + elf1.getArmorPoints());
        System.out.println("armorPoints after upgrade = " + elf1.plusArmorPoints());
        System.out.println("default damagePoints = " + elf1.getTotalDamage(elf1.arsenal.get(0)));

        elf1.addSword();
        elf1.changeWeapon(elf1.arsenal.get(1));
//        elf1.ch
        System.out.println("damage after upgrade = " + elf1.plusDamage(elf1.getWeapon()));
        System.out.println("total damage = " + elf1.getTotalDamage(elf1.arsenal.get(1)));

        System.out.println();
        elf1.addSword(); //не будет добавлен в арсенал, потому что он там уже есть
        elf1.addKnife();
        elf1.showArsenal();
        System.out.println();
        elf1.showWeapon();
        System.out.println();

        System.out.print("Равен ли эльф1 эльфу2? - ");
        if (elf1.equals(elf2)) System.out.println("Да.");
        else System.out.println("Нет."); */


        //демонстрация работы для Орков
        /*System.out.println("default hillPoints = " + orc1.getHillPoints());
        orc1.hillPoints = 20;
        System.out.println("hillPoints now = " + orc1.hillPoints);
        orc1.recoveryHill();
        System.out.println("hillPoints after revival = " + orc1.hillPoints);

        System.out.println("default armorPoints = " + orc1.getArmorPoints());
        System.out.println("total damagePoints with default weapon axe = " + orc1.getTotalDamage(orc1.arsenal.get(0)));

        orc1.addFireBall();
        orc1.addIceScepter();
        orc1.addFireBall(); //не добавится
        orc1.changeWeapon(orc1.arsenal.get(2));
        System.out.println("damage with Ice Scepter = " + orc1.getTotalDamage(orc1.getWeapon()));
        orc1.changeWeapon(orc1.arsenal.get(1));
        System.out.println("damage with Fire Ball = " + orc1.getTotalDamage(orc1.getWeapon()));

        System.out.println();
        orc1.showWeapon();
        System.out.println();
        orc1.showArsenal();
        System.out.println();

        System.out.print("Равен ли орк2 орку3? - ");
        Orc orc3 = new Orc();
        if (orc2.equals(orc3)) System.out.println("Да.");
        else System.out.println("Нет.");*/



        //деомнстарция работы методов для Гнома
        System.out.println("default armor points = " + gnome1.getArmorPoints());
        gnome1.plusArmorPoints();
        System.out.println("armor points after upgrade = " + gnome1.getArmorPoints() + "\n");

//        gnome1. = 0;
        System.out.println("гнома убили, hill points = " + gnome1.getHillPoints());
        gnome1.revival();
        System.out.println("Гном воскрес, hill points = " + gnome1.getHillPoints());
        System.out.println();
        gnome1.changeWeapon(new Weapon(18, "kskkd"));

        System.out.println("Текущее оружие: " + gnome1.getWeapon());
        gnome1.addIceBall();
        gnome1.changeWeapon(gnome1.getArsenal().get(1));
        System.out.println("Оружие было изменено. Текущее оружие: " + gnome1.getWeapon());
        System.out.println();
        gnome1.showArsenal();
    }
}
