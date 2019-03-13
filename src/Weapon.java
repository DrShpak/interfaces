import java.util.Objects;

//класс, описывающий оружие
public class Weapon {

    private int damage;
    private String name;

    public Weapon(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }

    //для удобного вывода
    @Override
    public String toString() {
        return "Weapon: " + name +
                ", damage = " + damage;
    }

    //переорпделеие иквэлс для того, что не добавлять одно и то же оружие больше 1 раза
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weapon)) return false;
        Weapon weapon = (Weapon) o;
        return damage == weapon.damage &&
                Objects.equals(name, weapon.name);
    }
}
