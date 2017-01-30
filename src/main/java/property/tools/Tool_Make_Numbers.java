package property.tools;

import java.util.Random;

public class Tool_Make_Numbers {
    private int a = 0;

    public int getRandom(int i) {
        return a = new Random().nextInt(i + 1);
    }

    public String get_SIM_Card_Number(int i) {
        a = getRandom(i);
        do {
            a = getRandom(i);
        }
        while (a == 0);

        return Integer.valueOf(a).toString();
    }

    public String get_Gateway_Channel_Number(int i) {
        a = getRandom(i);
        do {
            a = getRandom(i);
        }
        while (a == 0);

        return Integer.valueOf(a).toString();
    }
}
