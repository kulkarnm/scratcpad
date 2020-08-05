package puma.common.view;

import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.Id;

public class SysDateTimeView {
    @Id
    private LocalDateTime currentDateTime;

    public SysDateTimeView(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }
}
