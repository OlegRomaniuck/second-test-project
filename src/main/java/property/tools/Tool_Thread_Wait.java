package property.tools;



public class Tool_Thread_Wait {
    /*
    * if run = 0, class Tool_Thread_Wait switch off
	* if run = 1, class Tool_Thread_Wait switch on
	*
	* */

    private int run = 1;

    public void Thread_Wait(int number, long milsec) {
        if (run == number) {
            try {
                Thread.sleep(milsec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
