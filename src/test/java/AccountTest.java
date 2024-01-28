import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean isNameAppropriate;

    public AccountTest(String name, boolean isNameAppropriate){
        this.name = name;
        this.isNameAppropriate = isNameAppropriate;
    }
    @Parameterized.Parameters(name = "name: {0}, isNameAppropriate: {1}")
    public static Object[][] data() {
        return new Object[][] {
                {"Тимоти Шаламе", true},
                {"Ти", false},
                {"Тимоти Шаламешаламешаламе", false},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"ТимотиШаламе", false},
                {"Тимоти Шала ме", false},
        };
    }

    @Test
    public void doesCheckNameToEmbossWorks(){
        Account account = new Account(name);
        Boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(isNameAppropriate, actual);
    }
}
