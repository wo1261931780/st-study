package wo1261931780.api;

import baseRun.model.PageParams;
import baseRun.model.ShowResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.model.dto.QueryCourseParamsDto;
import wo1261931780.model.po.CourseBase;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.api
 *
 * @author liujiajun_junw
 * @Date 2024-06-01-23  星期五
 * @Description
 */
@RestController
public class CourseBaseInfoController {
	// RestController就相当于 controller 和 responseBodu
	@PostMapping("/course/list")
	public ShowResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams) {

		return null;
	}

}
