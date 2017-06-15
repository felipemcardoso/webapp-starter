package br.com.felipemcardoso.infrastructure;

import javax.servlet.*;
import java.io.IOException;


public class ApplicationFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
