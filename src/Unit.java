import java.util.ArrayList;
import java.util.Objects;

public abstract class Unit {

    /*
    в чем смысл этих полей, если при protected они доступны по прямому доступу
    приходится в каждом классе наследнике делать поля хранящие значения этих полей
     */
    protected int hillPoints;
    protected int powerPoints;
    protected int armorPoints;
    protected int damage;
    protected Weapon weapon; //текущее оружие
    protected ArrayList<Weapon> arsenal = new ArrayList<>(); //хранится весь арсенал

    public Unit(int hillPoints, int powerPoints, int armorPoints, int damage) {
        this.hillPoints = hillPoints;
        this.powerPoints = powerPoints;
        this.armorPoints = armorPoints;
        this.damage = damage;
    }

    //показать весь арсенал
    public void showArsenal() {
        System.out.println("Весь арсенал: ");
        for (int i = 0; i < arsenal.size(); i++) {
            System.out.println((i + 1) + ". " + arsenal.get(i));
        }
    }

    //метод "удар"
    public abstract int hit(Weapon weapon);

    //метод для представления
    public abstract void speak();


    //смена оружия
    //такие методы лучше делать int или void? не нарушается ли инкапсулция при void?
    //я сделаю пометки на тех методах где я сомневался насчет int/void (помтека будет такая: "вопрос про int и void)
    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    //показать текущее оружие
    public void showWeapon() {
        System.out.println("Текущее оружие: " + this.weapon);
    }

    //далее геттеры
    public int getHillPoints() {
        return hillPoints;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public int getArmorPoints() {
        return armorPoints;
    }

    // вернуть весь урон
    //вопрос тот же про void или int
    public abstract int getTotalDamage(Weapon weapon);

    public Weapon getWeapon() {
        return weapon;
    }

    public ArrayList<Weapon> getArsenal() {
        return arsenal;
    }

    //переопределение метода equals для сравнения двух юнитов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        return hillPoints == unit.hillPoints &&
                powerPoints == unit.powerPoints &&
                armorPoints == unit.armorPoints &&
                damage == unit.damage;
    }

    //не нашёл практического применения ему в своей реализации:((
    //ну разве что на экран вывести
    @Override
    public int hashCode() {
        return Objects.hash(hillPoints, powerPoints, armorPoints, damage);
    }
}
