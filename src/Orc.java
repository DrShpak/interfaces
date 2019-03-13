public class Orc extends Unit implements Wizard{

    //значения по умолчанию
    private static Weapon axe = new Weapon(45, "Axe");
    private static final int DEFAULT_DAMAGE = 40;
    private static final int DEFAULT_HILL_POINTS = 50;
    private static final int DEFAULT_POWER_POINTS = 35;
    private static final int DEFAULT_ARMOR_POINTS = 30;

    public Orc(int hillPoints, int powerPoints, int armorPoints, int damage) {
        super(hillPoints, powerPoints, armorPoints, damage);
    }

    public Orc() {
        super(DEFAULT_HILL_POINTS, DEFAULT_POWER_POINTS, DEFAULT_ARMOR_POINTS, DEFAULT_DAMAGE);
        weapon = axe;
        arsenal.add(axe);
    }

    @Override
    public int hit(Weapon weapon) {
        return weapon.getDamage() + DEFAULT_DAMAGE;
    }

    //представление
    @Override
    public void speak() {
        System.out.println("I am an Orc!");
    }

    @Override
    public int getTotalDamage(Weapon weapon) {
        return DEFAULT_DAMAGE + weapon.getDamage();
    }

    @Override
    public void recoveryHill() {
        hillPoints += BONUS_HILL;
    }

    //суперудар
    @Override
    public int superHit() {
        return DEFAULT_DAMAGE + (new Weapon(25, "FireBall").getDamage()) * 2;
    }

    //добавить фаер бол
    @Override
    public void addFireBall() {
        Weapon fireBall = new Weapon(25, "Fireball");
        if (!arsenal.contains(fireBall)) arsenal.add(fireBall);
    }

    @Override
    public void addIceScepter() {
        Weapon iceScepter = new Weapon(30, "Ice scepter");
        if (!arsenal.add(iceScepter)) arsenal.add(iceScepter);
    }
}
