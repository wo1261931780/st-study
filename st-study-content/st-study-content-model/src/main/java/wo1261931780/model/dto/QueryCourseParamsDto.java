package wo1261931780.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.model.dto
 *
 * @author liujiajun_junw
 * @Date 2024-06-01-17  星期五
 * @Description
 */
@Data
@ToString
public class QueryCourseParamsDto {

	//审核状态
	private String auditStatus;
	//课程名称
	private String courseName;
	//发布状态
	private String publishStatus;

}
