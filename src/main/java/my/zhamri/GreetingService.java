package my.zhamri;

public class GreetingService {

    private final GreetingInterface repo;

    public GreetingService(GreetingInterface repo) {
        this.repo = repo;
    }

    public String sayHello() {
        return repo.getGreeting();
    }
}

