package HomeWork5;

import java.util.Scanner;

public class Character{
    Scanner sc = new Scanner(System.in);

    public String name;
    public int luck;



    Character(){

    }
    Character(String name, int luck){
        this.name = name;
        this.luck = luck;
    }

    public void printHello() {
        System.out.println("Доброй ночи, я персонаж-родитель");
    }


    public void gameForLuck(int luck) {
        System.out.println("У тебя есть шанс повысить удачу.\n Просто отгадай число. Твой ответ: ");
        int player = sc.nextInt();
        int comp = (int) (Math.random()*11);
        if (player == comp){
            System.out.println("Отлично, твоя удача повысилась!");
            this.luck++;

        } else {
            System.out.println("Попытай удачу в следующий раз");
        }
    }

    public void damage(int luck){
        this.luck = luck;
        if (this.luck > 10) {
            System.out.println("Молодец, тебе удалось нанести урон!");
        }else {
            System.out.println("Тебе не хватает удачи. Повысь её чтобы нанести урон");
        }
    }







}
