package com.cnm.platforlearn.filter;


import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//越小优先级越高
@Order(1)
@WebFilter(filterName = "DemoFilterOne", urlPatterns = "/*", initParams = {@WebInitParam(name = "exclusionUrl", value = "/bbb,/ccc")})
public class DemoFilter implements Filter {


    private Set<String> exclusionUrl;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String[] exclusionUrls = filterConfig.getInitParameter("exclusionUrl").split(",");
        exclusionUrl = new HashSet<>(Arrays.asList(exclusionUrls));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (!shouldFilter(request)) {
            chain.doFilter(request, response);
            return;
        }
        System.out.println("i'm filterone!");
        chain.doFilter(request, response);
        System.out.println("i'm back");
    }

    @Override
    public void destroy() {

    }

    private boolean shouldFilter(ServletRequest request) {
        return !exclusionUrl.contains(((HttpServletRequest) request).getRequestURI());
    }
}
