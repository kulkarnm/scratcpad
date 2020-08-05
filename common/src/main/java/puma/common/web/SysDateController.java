package puma.common.web;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import puma.common.sysdate.SysDate;
import puma.common.sysdate.SysDateTime;


@RestController
@RequestMapping(value = "sysdate")
public class SysDateController {


    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<Object> setCurrentDateAndTime (@RequestBody SysDateTimeRequest request){
        SysDate.setCurrentDate(request.getSysDate());
        SysDateTime.setCurrentDateTime(request.getSysDateTime());
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "reset")
    public ResponseEntity<Object> resetCurrentDateAndTime (){
        SysDate.setCurrentDate(LocalDate.now());
        SysDateTime.setCurrentDateTime(LocalDateTime.now());
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "reset/previous/days",consumes = "application/json")
    public ResponseEntity<Object> resetToPreviousCurrentDateAndTime (@RequestBody IncrementDaysRequest request){
        LocalDate currentDate = SysDate.now();
        LocalDateTime currentDateTime = SysDateTime.now();
        SysDate.setCurrentDate(currentDate.minusDays(request.getDaysToIncrement()));
        SysDateTime.setCurrentDateTime(currentDateTime.minusDays(request.getDaysToIncrement()));
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "reset/next/days",consumes = "application/json" )
    public ResponseEntity<Object> resetToNextCurrentDateAndTime (@RequestBody IncrementDaysRequest request){
        LocalDate currentDate = SysDate.now();
        LocalDateTime currentDateTime = SysDateTime.now();
        SysDate.setCurrentDate(currentDate.plusDays(request.getDaysToIncrement()));
        SysDateTime.setCurrentDateTime( currentDateTime.plusDays(request.getDaysToIncrement()));
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "increment/days",consumes = "application/json" )
    public ResponseEntity<Object> incrementDays (@RequestBody IncrementDaysRequest request){
        LocalDate currentDate = SysDate.now();
        LocalDateTime currentDateTime = SysDateTime.now();
        currentDate.plusDays(request.getDaysToIncrement());
        currentDateTime.plusDays(request.getDaysToIncrement());
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "decrement/days",consumes = "application/json" )
    public ResponseEntity<Object> decrementDays (@RequestBody IncrementDaysRequest request){
        LocalDate currentDate = SysDate.now();
        LocalDateTime currentDateTime = SysDateTime.now();
        currentDate.minusDays(request.getDaysToIncrement());
        currentDateTime.minusDays(request.getDaysToIncrement());
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
