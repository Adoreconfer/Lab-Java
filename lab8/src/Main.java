import RunInput.Run;
import Task.BlednaWartoscDlaSilniException;
import Task.NieprawidlowyAdresException;

public class Main {
    public static void main(String[] args) throws BlednaWartoscDlaSilniException, NieprawidlowyAdresException {
        Run run = new Run();
        run.RunTask();
    }
}