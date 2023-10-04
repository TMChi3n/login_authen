# File Config
> FilterRegistrationBean : using register 'javax.servlet.Filter' and it's provide a convenient way to register and config Filter in Spring Boot and Spring MVC

> UrlBasedCorsConfigurationSource : a part of Spring Security, used to config Cross-Origin Resource Sharing (CORS) for web application.
> CORS : a mechanism in browser for control loading resources from another domain source
> UrlBasedCorsConfigurationSource : allow determination config CORS based URL.

> CorsConfiguration: config address web 'http://localhost:3000' is React port

> setAllowCredentials : allow web send request CORS by including authentication information like Cookie, HTTP Authentication when send request to source
> addAllowedOrigin : identify new http request 
> setAllowedHeaders : config list headers 
> Arrays.asList : create list from Array or elements are provided
> AUTHORIZATION, CONTENT_TYPE, ACCEPT constants provided by SB to represent for headers popular in HTTP.

> setAllowedMethods : assign methods HTTP "GET, POST, PUT, DELETE"

> setMaxAge : config max time that information about CORS storage in browser
> registerCorsConfiguration : register config CORS for one or more route
> setOrder : Determine the priority order of a component in processing and configuration in Spring.


