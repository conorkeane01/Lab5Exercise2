package ie.atu.week5blocking.week5blocking;

import org.springframework.stereotype.Service;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return td;
    }
}
