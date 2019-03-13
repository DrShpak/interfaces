public class Elf extends Unit implements Warrior{
    //дефолтные значения
    private static Weapon bow = new Weapon(20, "Bow");
    private static final int DEFAULT_DAMAGE = 20;
    private static final int DEFAULT_HILL_POINTS = 25;
    private static final int DEFAULT_POWER_POINTS = 30;
    private static final int DEFAULT_ARMOR_POINTS = 45;

    /*
    в чем смысл полей из суперкласса если все равно приходится в каждом классе создавать свои поля, чобы не нарушать инкапсуляцию??
     */
//    private int hillPointsElf = hillPoints;
//    private int powerPointsElf = powerPoints;
//    private int armorPointsElf = armorPoints;


    public Elf(int hillPoints, int powerPoints, int armorPoints, int damage) {
        super(hillPoints, powerPoints, armorPoints, damage);
    }

    public Elf() {
        super(DEFAULT_HILL_POINTS, DEFAULT_POWER_POINTS, DEFAULT_ARMOR_POINTS, DEFAULT_DAMAGE);
        weapon = bow;
        arsenal.add(bow);
    }

    //вопрос про int и void
    @Override
    public int plusDamage(Weapon weapon) {
        damage = DEFAULT_DAMAGE + weapon.getDamage() + BONUS;
        return damage;
    }

    //вопрос про int и void
    @Override
    public int plusArmorPoints() {
        return armorPoints += BONUS;
    }

    @Override
    public int getTotalDamage(Weapon weapon) {
        damage = DEFAULT_DAMAGE + weapon.getDamage();
        return damage;
    }

    @Override
    public int hit(Weapon weapon) {
        return getTotalDamage(weapon);
    }

    //представление
    @Override
    public void speak() {
        System.out.println("I am Elf!");
    }

    //добавить меч в арсенал
    @Override
    public void addSword() {
        Weapon sword = new Weapon(40, "Sword");
        if (!arsenal.contains(sword)) arsenal.add(sword);
    }

    //добавить нож в арсенал
    @Override
    public void addKnife() {
        Weapon knife = new Weapon(12, "Knife");
        if (!arsenal.contains(knife)) arsenal.add(knife);
    }

    //супер удар, у врага отнимется такое кол-во хп
    @Override
    public int superHit() {
        return damage * 2;
    }
}
