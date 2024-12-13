package com.jjtech;

import static org.mockito.Mockito.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private App app;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private StringWriter responseWriter;

    @BeforeEach
    public void setUp() throws Exception {
        // Initialize the servlet
        app = new App();

        // Mock the HttpServletRequest and HttpServletResponse
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);

        // Prepare a StringWriter to capture the response content
        responseWriter = new StringWriter();
        when(response.getWriter()).thenReturn(new PrintWriter(responseWriter));
    }

    @Test
    public void testDoGet() throws Exception {
        // Invoke the servlet's doGet method
        app.doGet(request, response);

        // Verify the response content type
        verify(response).setContentType("text/plain");

        // Verify the response content
        assertEquals("Hello World!", responseWriter.toString());
    }
}
