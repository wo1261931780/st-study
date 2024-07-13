package wo1261931780.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:st-study
 * Package:wo1261931780.model.po
 *
 * @author liujiajun_junw
 * @Date 2024-07-17-50  星期六
 * @Description
 */

/**
 * 课程-教师关系表
 */
@ApiModel(description = "课程-教师关系表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "course_teacher")
public class CourseTeacher implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 课程标识
	 */
	@TableField(value = "course_id")
	@ApiModelProperty(value = "课程标识")
	private Long courseId;
	/**
	 * 教师标识
	 */
	@TableField(value = "teacher_name")
	@ApiModelProperty(value = "教师标识")
	private String teacherName;
	/**
	 * 教师职位
	 */
	@TableField(value = "`position`")
	@ApiModelProperty(value = "教师职位")
	private String position;
	/**
	 * 教师简介
	 */
	@TableField(value = "introduction")
	@ApiModelProperty(value = "教师简介")
	private String introduction;
	/**
	 * 照片
	 */
	@TableField(value = "photograph")
	@ApiModelProperty(value = "照片")
	private String photograph;
	/**
	 * 创建时间
	 */
	@TableField(value = "create_date")
	@ApiModelProperty(value = "创建时间")
	private Date createDate;
}
