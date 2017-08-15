import java.util.HashMap;

public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        return !s.matches(".*LLL.* | .*A.*A.*");
    }
}
