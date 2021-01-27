package com.conor.SojernCode;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.math.BigDecimal;

@RestController
public class MathController {

    @Inject
    private MathService mathService;

    @PostMapping("/min")
    public ResponseEntity<BigDecimal> min(@RequestBody MathInputModel numbers) {
        BigDecimal result = mathService.min(numbers.getNumbers());

        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/max")
    public ResponseEntity<BigDecimal> max(@RequestBody MathInputModel numbers) {
        BigDecimal result = mathService.max(numbers.getNumbers());

        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/avg")
    public ResponseEntity<BigDecimal> avg(@RequestBody MathInputModel numbers) {
        BigDecimal result = mathService.avg(numbers.getNumbers());

        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/median")
    public ResponseEntity<BigDecimal> median(@RequestBody MathInputModel numbers) {
        BigDecimal result = mathService.median(numbers.getNumbers());

        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/percentile")
    public ResponseEntity<BigDecimal> percentile(@RequestBody MathInputModel numbers) {
        BigDecimal result = mathService.percentile(numbers.getNumbers(), numbers.getQ());

        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


}
