package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application";
    }
}
// 브랜치 생성 확인