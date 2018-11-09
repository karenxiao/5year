import com.sun.deploy.util.StringUtils;
import java.util.Arrays;
import java.util.List;

/**
 * @author karenxiao240@gmail.com
 * @see 5th Anniversary Class Report
 * @since 11/9/18
 */

public class Karen
{
    private Integer age;
    private String currentCity;
    private String job;
    private String company;
    private static List<String> freeTime = Arrays.asList("Travel", "Dance", "Eat Hot Pot", "Paint", "Run", "Climb");

    private Karen(Integer age, String currentCity, String job, String company)
    {
        this.age = age;
        this.currentCity = currentCity;
        this.job = job;
        this.company = company;
    }

    private static void yearInTheLifeOf(Karen k, String hobby)
    {
        System.out.println(StringUtils.join(Arrays.asList(
                k.age.toString(), k.currentCity, k.job + " @ " + k.company, hobby), " | "));
    }

    public static void main(String[] args)
    {
        Karen karen = new Karen(20, "Cambridge, MA", "Student", "Harvard");

        yearInTheLifeOf(karen, freeTime.get(0));

        for (int year = 1; year < 2; year++)
        {
            karen.age++;
            karen.currentCity = "New York, NY";
            karen.job = "Consultant";
            karen.company = "PwC";

            yearInTheLifeOf(karen, freeTime.get(year));
        }

        for (int year = 2; year <= 5; year++)
        {
            karen.age++;
            karen.job = "Engineer";
            karen.company = "Mark43";

            yearInTheLifeOf(karen, freeTime.get(year));
        }
    }
}
