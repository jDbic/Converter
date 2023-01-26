package at.fh.converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
    @GetMapping("/test")
    public int return1() {
        return 1;
    }
}
