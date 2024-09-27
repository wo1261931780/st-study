package wo1261931780;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780
 *
 * @author liujiajun_junw
 * @Date 2024-06-01-22  星期五
 * @Description
 */
@EnableSwagger2Doc
@SpringBootApplication
public class ContentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContentApplication.class, args);
		// 放在外面，会把包和子包都扫描到，避免出现问题
	}
}
// 分类表一定有一个父节点id
