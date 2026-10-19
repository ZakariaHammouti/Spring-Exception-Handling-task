
        package de.neuefische.springexceptionhandlingtask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ExceptionHandlingIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllCars_shouldReturnNotFound() throws Exception {
        mockMvc.perform(get("/api/cars"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message")
                        .value("No Cars found"));
    }

    @Test
    void getCarBrand_shouldReturnBadRequestForInvalidBrand()
            throws Exception {
        mockMvc.perform(get("/api/cars/bmw"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message")
                        .value("Only 'porsche' allowed"));
    }
}
