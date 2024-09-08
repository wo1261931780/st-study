package wo1261931780.api;

import baseRun.model.PageParams;
import baseRun.model.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.model.dto.QueryCourseParamsDto;
import wo1261931780.model.po.CourseBase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.api
 *
 * @author liujiajun_junw
 * @Date 2024-06-01-23  星期五
 * @Description
 */
@Api(value = "课程基本信息", tags = {"课程基本信息接口"})
@RestController
public class CourseBaseInfoController {
	// RestController就相当于 controller 和 responseBody
	@ApiOperation("课程查询接口")
	@PostMapping("/course/list")
	public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams) {
		// 作为一个专业的开发，要先写持久层代码，然后再写业务层
		CourseBase courseBase = new CourseBase();
		courseBase.setName("测试名称");
		courseBase.setCreateDate(new Date());
		List<CourseBase> courseBases = new ArrayList<>();
		courseBases.add(courseBase);
		PageResult<CourseBase> courseBasePageResult = new PageResult<>();
		// courseBasePageResult.setCode(0);
		// courseBasePageResult.setMsg("success");
		// courseBasePageResult.setData(courseBase);
		return courseBasePageResult;
	}
}
