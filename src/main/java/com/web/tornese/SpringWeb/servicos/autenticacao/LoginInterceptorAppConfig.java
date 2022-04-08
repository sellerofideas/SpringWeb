package com.web.tornese.SpringWeb.servicos.autenticacao;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class LoginInterceptorAppConfig  extends WebMvcConfigurerAdapter{
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
        .excludePathPatterns(
            "/login", 
            "/error",
            "/logar",
            "/vendor/**",
            "/img/**",
            "/js/**",
            "/favicon.ico",
            "/css/**"
        );
    }
}


// package com.web.tornese.SpringWeb.Servicos.Login;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

// @Configuration
// public class LoginInterceptorAppConfig extends WebMvcConfigurationSupport {

//   @Override
//   public void addInterceptors(InterceptorRegistry registry) {
//     registry.addInterceptor(new LoginInterceptor())
//         .excludePathPatterns(
//           "/login",
//           "/error",
//           "/logar",
//           "/vendor/**",
//           "/js/**",
//           "/favicon.ico",
//           "/css/**"
//         );
//   }
// }