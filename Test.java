package HomeWork5;

public class Test extends Character{

    Test(String name, int luck) throws NotTestException {
        super(name, luck);
        if (name != "Test"){
            System.out.println("Проверка не тестировщиком запрещена");
            throw new NotTestException();

        } else {
            System.out.println("Вы тестировщик. Продолжайте");
        }

    }

}
