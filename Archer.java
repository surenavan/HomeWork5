package HomeWork5;

public class Archer extends Character {

    int shootingSkill;

    Archer(int shootingSkill) {
        this.shootingSkill = shootingSkill;
    }

    @Override
    public void printHello() {
        System.out.println("Здравствуй, у меня есть лук и стрелы. Шпальнуть?");
    }

    @Override
    public void damage(int shootingSkill) {
        this.shootingSkill = shootingSkill;
        if (shootingSkill < 30) {
            System.out.println("Тебе не хватает мастерства для нанесения урона");
        } else {
            System.out.println("Вы прострелили ему колено!?!");
        }
    }
}