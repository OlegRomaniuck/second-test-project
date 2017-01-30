package property.adapter;


import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class Adapter_Error_Util extends logic.init.Initialize {
    private static Map<ITestResult, List> verificationFailuresMap = new HashMap<ITestResult, List>();

    public static void addVerificationFailure(Throwable e) {
        System.out.println("	*************	addVerificationFailure	******************	");
        List<Throwable> verificationFailures = getVerificationFailures();
        verificationFailuresMap.put(Reporter.getCurrentTestResult(), verificationFailures);
        verificationFailures.add(e);
    }

    public static List<Throwable> getVerificationFailures() {
        System.out.println("	*************	getVerificationFailures	******************	");
        List verificationFailures = verificationFailuresMap.get(Reporter.getCurrentTestResult());
        return verificationFailures == null ? new ArrayList() : verificationFailures;
    }
}

