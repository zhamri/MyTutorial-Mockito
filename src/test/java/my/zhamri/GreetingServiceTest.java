package my.zhamri;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class GreetingServiceTest {

    @Test
    void testSayHello() {

        // 1️⃣ Create a mock object
        GreetingRepository repo = Mockito.mock(GreetingRepository.class);

        // 2️⃣ Define behavior (stub)
        when(repo.getGreeting()).thenReturn("Hello World!");

        // 3️⃣ Inject mock into the service
        GreetingService service = new GreetingService(repo);

        // 4️⃣ Call the method to test
        String result = service.sayHello();

        // 5️⃣ Verify result
        assertEquals("Hello World!", result);

        // 6️⃣ Verify mock interaction
        verify(repo, times(1)).getGreeting();
    }
}

