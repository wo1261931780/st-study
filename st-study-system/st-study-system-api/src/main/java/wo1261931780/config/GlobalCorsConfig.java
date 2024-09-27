package wo1261931780.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 使用spring web mvc的方案来解决跨域问题
 */
@Configuration
public class GlobalCorsConfig {

	@Bean
	public CorsFilter corsFilter() {

		CorsConfiguration config = new CorsConfiguration();
		// 允许白名单域名进行跨域调用
		config.addAllowedOrigin("*");
		// 允许跨越发送cookie
		config.setAllowCredentials(true);
		// 放行全部原始头信息
		config.addAllowedHeader("*");
		// 允许所有请求方法跨域调用
		config.addAllowedMethod("*");
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);// 所有的请求地址都要走过滤器
		return new CorsFilter(source);

	}
}
