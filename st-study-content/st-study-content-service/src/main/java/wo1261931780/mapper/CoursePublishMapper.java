package wo1261931780.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import wo1261931780.model.po.CoursePublish;

/**
*Created by Intellij IDEA.
*Project:st-study
*Package:wo1261931780.model.dto
*@author liujiajun_junw
*@Date 2024-07-12-50  星期二
*@Description 
*/

@Mapper
public interface CoursePublishMapper extends BaseMapper<CoursePublish> {
    int insertOrUpdate(CoursePublish record);

    int insertOrUpdateSelective(CoursePublish record);
}
