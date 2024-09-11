package wo1261931780;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Intellij IDEA.
 * Project:Default (Template) Project
 * Package:wo1261931780
 *
 * @author liujiajun_junw
 * @Date 2024-09-21-35  星期三
 * @Description
 */
@EnableScheduling
@EnableSwagger2Doc
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
