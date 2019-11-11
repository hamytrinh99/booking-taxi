package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class loginFilter implements Filter {

    public static boolean flag = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if(flag) {
//            request.getRequestDispatcher("feedback.jsp").forward(request, response);
              chain.doFilter(request, response);
        }else{
            response.getWriter().print("You must login !");
        }
    }

    @Override
    public void destroy() {
    }

}
