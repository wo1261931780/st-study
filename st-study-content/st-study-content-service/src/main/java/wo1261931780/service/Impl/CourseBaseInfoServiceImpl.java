package wo1261931780.service.Impl;

import baseRun.model.PageParams;
import baseRun.model.PageResult;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wo1261931780.mapper.CourseBaseMapper;
import wo1261931780.model.dto.QueryCourseParamsDto;
import wo1261931780.model.po.CourseBase;
import wo1261931780.service.CourseBaseInfoService;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2024-09-22-58  星期二
 * @Description
 */
@Service
@Slf4j
public class CourseBaseInfoServiceImpl implements CourseBaseInfoService {
	@Autowired
	private CourseBaseMapper courseBaseMapper;

	@Override
	public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto) {

		// 详细进行分页查询的单元测试

		// 拼装查询条件
		LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
		// 根据名称模糊查询,在sql中拼接 course_base.name like '%值%'
		queryWrapper.like(StringUtils.isNotEmpty(queryCourseParamsDto.getCourseName()), CourseBase::getName, queryCourseParamsDto.getCourseName());
		// 根据课程审核状态查询 course_base.audit_status = ?
		queryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getAuditStatus()), CourseBase::getAuditStatus, queryCourseParamsDto.getAuditStatus());

		// 创建page分页参数对象，参数：当前页码，每页记录数
		Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
		// 开始进行分页查询
		Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
		// 数据列表
		List<CourseBase> items = pageResult.getRecords();
		// 总记录数
		long total = pageResult.getTotal();

		// List<T> items, long counts, long page, long pageSize
		PageResult<CourseBase> courseBasePageResult = new PageResult<>(items, total, pageParams.getPageNo(), pageParams.getPageSize());
		log.info(courseBasePageResult.toString());
		return courseBasePageResult;
	}
}
