package wo1261931780.content;

import baseRun.model.PageParams;
import baseRun.model.PageResult;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.mapper.CourseBaseMapper;
import wo1261931780.model.dto.QueryCourseParamsDto;
import wo1261931780.model.po.CourseBase;
import wo1261931780.service.CourseBaseInfoService;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.content
 *
 * @author liujiajun_junw
 * @Date 2024-07-13-09  星期二
 * @Description
 */
@SpringBootTest
@Slf4j
public class CourseBaseInfoServiceTest {
	// 这里就是分页查询的单元测试
	@Autowired
	CourseBaseInfoService courseBaseInfoService;

	@Test
	public void test() {
		// 查询条件
		QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
		courseParamsDto.setCourseName("java");// 课程名称查询条件
		courseParamsDto.setAuditStatus("202004");
		// 分页参数对象
		PageParams pageParams = new PageParams();
		pageParams.setPageNo(1L);
		pageParams.setPageSize(2L);
		PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, courseParamsDto);
		log.info(courseBasePageResult.toString());
		Assertions.assertTrue(courseBasePageResult.getCounts() > 0);


	}
}
