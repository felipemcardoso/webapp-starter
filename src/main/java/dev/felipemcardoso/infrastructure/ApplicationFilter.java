package dev.felipemcardoso.infrastructure;

import javax.servlet.*;
import java.io.IOException;

public class ApplicationFilter implements Filter {

    public void init(FilterConfig filterConfig) {
        System.out.println("ApplicationFilter.init");
    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("ApplicationFilter.destroy");
    }
}
