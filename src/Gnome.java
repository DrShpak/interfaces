public class Gnome extends Unit implements Paladin{
    //дефолтные значения
    private static Weapon gun = new Weapon(25, "Gun");
    private static final int DEFAULT_DAMAGE = 20;
    private static final int DEFAULT_HILL_POINTS = 50;
    private static final int DEFAULT_POWER_POINTS = 50;
    private static final int DEFAULT_ARMOR_POINTS = 55;



    public Gnome(int hillPoints, int powerPoints, int armorPoints, int damage) {
        super(hillPoints, powerPoints, armorPoints, damage);
    }

    public Gnome() {
        super(DEFAULT_HILL_POINTS, DEFAULT_POWER_POINTS, DEFAULT_ARMOR_POINTS, DEFAULT_DAMAGE);
        weapon = gun;
        arsenal.add(gun);
    }

    @Override
    public int hit(Weapon weapon) {
        return DEFAULT_DAMAGE + weapon.getDamage();
    }

    @Override
    public void speak() {
        System.out.println("I am gnome!");
    }

    @Override
    public int getTotalDamage(Weapon weapon) {
        return DEFAULT_DAMAGE + weapon.getDamage();
    }

    @Override
    public void revival() {
        if (hillPoints <= 0) {
            hillPoints = DEFAULT_HILL_POINTS;
        }
    }

    @Override
    public void addIceBall() {
        arsenal.add(new Weapon(50, "IceBall"));
    }

    @Override
    public void plusArmorPoints() {
        armorPoints += BONUS;
    }
}
