package ie.atu.week5blocking.week5blocking;

import org.springframework.cglib.core.Block;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingController {
    private final BlockingService blockingService;

    public BlockingController(BlockingService blockingService) {
        this.blockingService = blockingService;
    }

    @GetMapping("/blocking")
    public String getBlockingData() {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10; i++) {
            blockingService.fetchDataBlocking();
        }
        long endTime = System.currentTimeMillis();
        return "Total execution time: " + (endTime - startTime) + " ms";
    }
}
