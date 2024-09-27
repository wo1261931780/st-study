package wo1261931780.model.dto;

import lombok.Data;
import wo1261931780.model.po.CourseCategory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.model.dto
 *
 * @author liujiajun_junw
 * @Date 2024-09-21-46  星期五
 * @Description
 */
@Data
public class CourseCategoryDTO extends CourseCategory implements Serializable {
	// 以后网络传输的时候实现接口从而能序列化


	List<CourseCategoryDTO> childrenTreeNodes;
}
