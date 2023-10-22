package ie.atu.week5blocking.week5blocking;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingController {
    private final BlockingService blockingService;
}
