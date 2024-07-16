package wo1261931780.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.mapper.CourseBaseMapper;
import wo1261931780.model.po.CourseBase;

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
		// System.out.println("test");
		CourseBase courseBase = courseBaseMapper.selectById(18L);
		LambdaQueryWrapper<CourseBase> courseBaseLambdaQueryWrapper = new LambdaQueryWrapper<>();
		courseBaseLambdaQueryWrapper.like(CourseBase::getName, "java");


		Assertions.assertNotNull(courseBase);
	}
}
