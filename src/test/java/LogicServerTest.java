
import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.persistance.CategoryService;
import com.example.sep3rest.protobuf.Logicserver;
import org.junit.Test;
import org.junit.platform.engine.TestExecutionResult;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.*;

    public class LogicServerTest {
        RestTemplate restTemplate = new RestTemplate();
        @Test
        public void noCategoriesInDatabase() {

            // Test execution
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            CategoryService categoryService = new CategoryService();
            Category c = new Category("poop", 1);
            ResponseEntity result = categoryService.storeCategory(c);


            assertEquals(restTemplate.postForEntity("http://localhost:5285/category/uploadCategory", new HttpEntity<>(c, headers), Category.class), result);
        }

        // Add more test methods for other units of your logic server
    }

