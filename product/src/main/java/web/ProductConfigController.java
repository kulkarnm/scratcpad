package web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.request.ProductConfigRequest;

@RestController
@RequestMapping(value = "/product")
public class ProductConfigController {

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<Object> defineProduct(@RequestBody ProductConfigRequest request) throws Exception {
        return null;
    }

} 
