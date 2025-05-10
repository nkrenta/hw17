package pro.sky.hw17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Optional<Integer> num1, @RequestParam(required = false) Optional<Integer> num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) Optional<Integer> num1, @RequestParam(required = false) Optional<Integer> num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) Optional<Integer> num1, @RequestParam(required = false) Optional<Integer> num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) Optional<Integer> num1, @RequestParam(required = false) Optional<Integer> num2) {
        return calculatorService.divide(num1, num2);
    }
}
