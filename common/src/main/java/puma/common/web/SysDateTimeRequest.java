package puma.common.web;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

public class SysDateTimeRequest {

    private LocalDate sysDate;
    private LocalDateTime sysDateTime;

    public LocalDate getSysDate() {
        return sysDate;
    }

    public void setSysDate(LocalDate sysDate) {
        this.sysDate = sysDate;
    }

    public LocalDateTime getSysDateTime() {
        return sysDateTime;
    }

    public void setSysDateTime(LocalDateTime sysDateTime) {
        if(null!=sysDateTime){
            this.sysDateTime = sysDateTime;
        }else{
            this.sysDateTime = sysDate.toLocalDateTime(LocalTime.now());
        }
    }
}
