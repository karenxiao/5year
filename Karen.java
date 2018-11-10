import com.sun.deploy.util.StringUtils;
import java.util.Arrays;
import java.util.List;

/**
 * @author Karen Xiao
 * @see 5th Anniversary Class Report
 * @since 11/9/18
 */

public class Karen
{
    private static final List<String> FREE_TIME = Arrays.asList("Travel", "Dance", "Eat Hot Pot", "Paint", "Run", "Climb");
    private static final int GRADUATION_YEAR = 2014;
    private static final int BIRTH_YEAR = 1992;

    private int age;
    private String currentCity;
    private String job;
    private String company;

    private Karen(int age, String currentCity, String job, String company)
    {
        this.age = age;
        this.currentCity = currentCity;
        this.job = job;
        this.company = company;
    }

    public static void main(String[] args)
    {
        Karen karen = new Karen(21, "Cambridge, MA", "Student", "Harvard");

        yearInTheLifeOf(karen, FREE_TIME.get(0));

        for (int year = 2014; year < 2015; year++)
        {
            karen.age = year - BIRTH_YEAR;
            karen.currentCity = "New York, NY";
            karen.job = "Consultant";
            karen.company = "PwC";

            yearInTheLifeOf(karen, FREE_TIME.get(year - GRADUATION_YEAR + 1));
        }

        for (int year = 2015; year < 2019; year++)
        {
            karen.age = year - BIRTH_YEAR;
            karen.job = "Engineer";
            karen.company = "Mark43";

            if (year >= 2018)
            {
                karen.job = "Engineering Manager";
            }

            yearInTheLifeOf(karen, FREE_TIME.get(year - GRADUATION_YEAR + 1));
        }
    }

    private static void yearInTheLifeOf(Karen k, String hobby)
    {
        System.out.println(StringUtils.join(Arrays.asList(
                Integer.toString(k.age), k.currentCity, k.job + " @ " + k.company, hobby), " | "));
    }
}