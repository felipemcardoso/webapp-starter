package dev.felipemcardoso.service.infrastructure;

import javax.servlet.*;
import java.io.IOException;

public class ApplicationFilter implements Filter {

    public void init(FilterConfig filterConfig) {
        //No-op
    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        //No-op
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        //No-op
    }
}
