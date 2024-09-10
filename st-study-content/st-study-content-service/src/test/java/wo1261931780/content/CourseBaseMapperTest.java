package wo1261931780.content;

import baseRun.model.PageParams;
import baseRun.model.PageResult;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.mapper.CourseBaseMapper;
import wo1261931780.model.dto.QueryCourseParamsDto;
import wo1261931780.model.po.CourseBase;

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
public class CourseBaseMapperTest {
	@Autowired
	CourseBaseMapper courseBaseMapper;

	@Test
	public void test() {
		CourseBase courseBase = courseBaseMapper.selectById(18);
		Assertions.assertNotNull(courseBase);

		//详细进行分页查询的单元测试
		//查询条件
		QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
		courseParamsDto.setCourseName("java");//课程名称查询条件

		//拼装查询条件
		LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
		//根据名称模糊查询,在sql中拼接 course_base.name like '%值%'
		queryWrapper.like(StringUtils.isNotEmpty(courseParamsDto.getCourseName()),CourseBase::getName,courseParamsDto.getCourseName());
		//根据课程审核状态查询 course_base.audit_status = ?
		queryWrapper.eq(StringUtils.isNotEmpty(courseParamsDto.getAuditStatus()), CourseBase::getAuditStatus,courseParamsDto.getAuditStatus());
		//todo:按课程发布状态查询
		//分页参数对象
		PageParams pageParams = new PageParams();
		pageParams.setPageNo(1L);
		pageParams.setPageSize(2L);

		//创建page分页参数对象，参数：当前页码，每页记录数
		Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
		//开始进行分页查询
		Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
		//数据列表
		List<CourseBase> items = pageResult.getRecords();
		//总记录数
		long total = pageResult.getTotal();

		//List<T> items, long counts, long page, long pageSize
		PageResult<CourseBase> courseBasePageResult = new PageResult<CourseBase>(items,total,pageParams.getPageNo(), pageParams.getPageSize());
		System.out.println(courseBasePageResult);
	}
}
