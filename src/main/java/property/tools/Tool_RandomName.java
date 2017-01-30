package property.tools;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Tool_RandomName {
    private String name = "";
    private int i = 0;

    private StringBuffer randomSymbols() {
        Random random = new Random();
        Set<Integer> intset = new HashSet<Integer>();
        while (intset.size() < 7) {
            intset.add(random.nextInt(29));
        }

        Iterator<Integer> iterator = intset.iterator();
        StringBuffer sb = new StringBuffer();
        while (iterator.hasNext() && (i < 6)) {
            i++;
            sb.append(iterator.next());
        }
        return sb;
    }


    // Form_Login, Form_Registration
    public String makeUserName() {
        return name + randomSymbols();
    }

    public String makeUserEmail() {
        return name + randomSymbols() + "@FGFGFGF";
    }

    public String makeUserPass() {
        return randomSymbols().toString();
    }

    public String makeUserPhone() {
        return randomSymbols().toString();
    }

    // FORM Location
    public String makeLocationName() {
        return name + randomSymbols();
    }

    // FORM Road Map
    public String makeRoadMapName() {
        return name + randomSymbols();
    }

    // FORM Gateway
    public String makeGatewayName() {
        return name + randomSymbols();
    }

    // FORM SimBank
    public String makeSimBankName() {
        return name + randomSymbols();
    }

    // FORM Tariff
    public String makeTariffName() {
        return name + randomSymbols();
    }

    // FORM Tariff Limit
    public String makeTariffLimitName() {
        return name + randomSymbols();
    }

    // FORM Carriers
    public String makeCarrierName() {
        return name + randomSymbols();
    }

    // FORM Color
    public String makeColorName() {
        return name + randomSymbols();
    }

}
