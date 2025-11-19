package my.zhamri;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GreetingServiceAnnotationTest {

    @Mock
    private GreetingRepository repo;    // auto-mocked

    @InjectMocks
    private GreetingService service;    // repo injected automatically

    @Test
    void testSayHello() {
        when(repo.getGreeting()).thenReturn("Hello Mockito!");

        String result = service.sayHello();

        assertEquals("Hello Mockito!", result);
        verify(repo).getGreeting();
    }
}

