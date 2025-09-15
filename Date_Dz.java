import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class Date_Dz {
    public static void main(String[] args) {

        Date nowDate = new Date();
        System.out.println("сейчас: " + nowDate);

        Calendar calendar = Calendar.getInstance();

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // январь = 0
        int day = calendar.get(Calendar.DATE);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1 = Sunday

        System.out.println("год: " + year);
        System.out.println("десяц: " + months[month]);
        System.out.println("день месяца: " + day);
        System.out.println("день недели: " + days[dayOfWeek - 1]);

        calendar.add(Calendar.DATE, 10);
        System.out.println("дата через 10 дней:" + calendar.getTime());

        LocalDate now = LocalDate.now();
        System.out.println("Сегодняшняя дата:" + now);
        System.out.println("Номер дня в году:" + now.getDayOfYear());

        LocalDate plus100 = now.plusDays(100);
        System.out.println("дата через 100 дней:" + plus100);
        System.out.println("день недели через 100 дней:" + plus100.getDayOfWeek());

        LocalDate date2025 = LocalDate.of(2025, 12, 31);
        System.out.println("31 декабря 2025" + date2025.getDayOfWeek());
        System.out.println("31 декабря 2025" + date2025.getDayOfYear());

    }
}
