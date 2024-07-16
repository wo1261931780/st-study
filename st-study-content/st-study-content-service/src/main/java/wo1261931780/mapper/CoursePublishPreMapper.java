package wo1261931780.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import wo1261931780.model.po.CoursePublishPre;

/**
*Created by Intellij IDEA.
*Project:st-study
*Package:wo1261931780.model.dto
*@author liujiajun_junw
*@Date 2024-07-12-50  星期二
*@Description 
*/

@Mapper
public interface CoursePublishPreMapper extends BaseMapper<CoursePublishPre> {
    int insertOrUpdate(CoursePublishPre record);

    int insertOrUpdateSelective(CoursePublishPre record);
}
