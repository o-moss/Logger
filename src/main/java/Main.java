import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int listLength;
        int listMax;
        int filterNumber;

        logger.log("Запускаем программу.");
        logger.log("Просим пользователя ввести входные данные для списка.");
        System.out.println("Введите размер списка: ");
        listLength = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        listMax = scanner.nextInt();
        logger.log("Создаём и наполняем список.");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(listMax));
        }
        System.out.println("Вот случайный список: " + list + ".");
        logger.log("Просим пользователя ввести входные данные для фильтрации.");
        System.out.println("Введите порог для фильтра: ");
        filterNumber = scanner.nextInt();
        Filter filter = new Filter(filterNumber);
        logger.log("Запускаем фильтрацию.");
        logger.log("Выводим результат на экран.");
        System.out.println("Отфильтрованный список: " + filter.filterOut(list));
        logger.log("Завершаем программу.");


    }
}
