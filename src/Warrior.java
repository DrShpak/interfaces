public interface Warrior {

    public final int BONUS = 20;

    public int plusDamage(Weapon weapon); //плюс к урону

    public int plusArmorPoints(); //плюс к броне

    public void addSword(); //добавить меч

    public void addKnife(); //добавить нож

    public int superHit(); //суперудар
}
