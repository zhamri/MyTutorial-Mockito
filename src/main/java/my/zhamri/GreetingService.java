package my.zhamri;

public class GreetingService {

    private final GreetingRepository repo;

    public GreetingService(GreetingRepository repo) {
        this.repo = repo;
    }

    public String sayHello() {
        return repo.getGreeting();
    }
}

