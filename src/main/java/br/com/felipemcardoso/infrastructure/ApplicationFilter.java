package br.com.felipemcardoso.infrastructure;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


public class ApplicationFilter implements Filter {

    public void init(FilterConfig filterConfig) {
        System.out.println("ApplicationFilter.init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ApplicationFilter.doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("ApplicationFilter.destroy");
    }
}
