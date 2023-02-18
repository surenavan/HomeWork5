package HomeWork5;

public class Wizard extends Character {

    int mana;

    Wizard(int mana){
        this.mana = mana;
    }

    @Override
    public void printHello() {
        System.out.println("Привет, я волшебник и я тебя заколдую!");
    }

    @Override
    public void damage(int mana){
        this.mana = mana;
        if (mana > 20) {
            System.out.println("Тебе хватило маны для нанесения урона");
        }else {
            System.out.println("У вас недостаточно маны");
        }
    }

}
