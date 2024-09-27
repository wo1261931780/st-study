package wo1261931780.api;

import baseRun.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.model.dto.CourseCategoryDTO;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.api
 *
 * @author liujiajun_junw
 * @Date 2024-09-21-50  星期五
 * @Description
 */
@RestController
public class CourseCategoryController {
	@GetMapping("/course-category/tree-nodes")
	public CourseCategoryDTO queryTreeNodes() {
// 这里父子可以通过自连接的方式组装到一起
// 		sel * from demo1 a ，demo2 b where ……
// 	这里可以用递归的方式实现树形结构，在MySQL8中出现的sql命令
// 递归只会连接一次数据库，不会连接多次

		return null;
	}
}
