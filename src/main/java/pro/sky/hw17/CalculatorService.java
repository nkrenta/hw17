package pro.sky.hw17;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalculatorService {

    public String welcome() {
        return """
                Hi! It's a Web Calculator!\s
                Input your request like: http://localhost:8080/plus?num1=1&num2=2
                Options:
                If you want
                +; -; x; ÷
                you should use:
                plus; minus; multiply; divide""";
    }

    public String plus(Optional<Integer> num1, Optional<Integer> num2) {
        if (!num1.isPresent() || !num2.isPresent()) {
            return "Please input two numbers!";
        } else {
            int result = num1.get() + num2.get();
            return "Введенное выражение: " + num1.get() + " + " + num2.get() + " = " + result;
        }
    }


    public String minus(Optional<Integer> num1, Optional<Integer> num2) {
        if (!num1.isPresent() || !num2.isPresent()) {
            return "Please input two numbers!";
        } else {
            int result = num1.get() - num2.get();
            return "Введенное выражение: " + num1.get() + " - " + num2.get() + " = " + result;
        }
    }

    public String multiply(Optional<Integer> num1, Optional<Integer> num2) {
        if (!num1.isPresent() || !num2.isPresent()) {
            return "Please input two numbers!";
        } else {
            int result = num1.get() * num2.get();
            return "Введенное выражение: " + num1.get() + " x " + num2.get() + " = " + result;
        }
    }

    public String divide(Optional<Integer> num1, Optional<Integer> num2) {
        if (!num1.isPresent() || !num2.isPresent()) {
            return "Please input two numbers!";
        } else {
            int result = num1.get() / num2.get();
            return "Введенное выражение: " + num1.get() + " ÷ " + num2.get() + " = " + result;
        }
    }
}
