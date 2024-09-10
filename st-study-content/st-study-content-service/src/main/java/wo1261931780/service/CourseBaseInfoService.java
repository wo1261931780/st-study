package wo1261931780.service;

import baseRun.model.PageParams;
import baseRun.model.PageResult;
import org.springframework.stereotype.Service;
import wo1261931780.model.dto.QueryCourseParamsDto;
import wo1261931780.model.po.CourseBase;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.service
 *
 * @author liujiajun_junw
 * @Date 2024-09-22-52  星期二
 * @Description
 */
public interface CourseBaseInfoService {
	public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
