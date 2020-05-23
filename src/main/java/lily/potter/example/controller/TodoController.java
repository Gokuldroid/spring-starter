package lily.potter.example.controller;

import com.github.javafaker.Faker;
import lily.potter.example.pojo.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TodoController {

    @RequestMapping(value = "/todo/one", method = RequestMethod.GET)
    public String getTodo() {
        return "hello";
    }

    @GetMapping(value = "/todo/two")
    public String getTodoTwo() {
        return "hello from two";
    }


    @GetMapping(value = "/todo/three")
    public Todo getTodoThree() {
        return getSampleTodo();
    }

    @GetMapping(value = "/todos")
    public List<Todo> getTodos() {
        ArrayList<Todo> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arrayList.add(getSampleTodo());
        }
        return arrayList;
    }

    private Todo getSampleTodo() {
        Faker faker = new Faker();
        Todo todo = new Todo();
        todo.id = (int) (Math.random() * 100);
        todo.description = faker.name().name();
        todo.title = faker.name().fullName();
        return todo;
    }
}
