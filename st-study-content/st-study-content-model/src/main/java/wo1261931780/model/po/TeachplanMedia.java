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

@ApiModel(description = "teachplan_media")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "teachplan_media")
public class TeachplanMedia implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 媒资文件id
	 */
	@TableField(value = "media_id")
	@ApiModelProperty(value = "媒资文件id")
	private String mediaId;
	/**
	 * 课程计划标识
	 */
	@TableField(value = "teachplan_id")
	private Long teachplanId;
	/**
	 * 课程标识
	 */
	@TableField(value = "course_id")
	@ApiModelProperty(value = "课程标识")
	private Long courseId;
	/**
	 * 媒资文件原始名称
	 */
	@TableField(value = "media_fileName")
	@ApiModelProperty(value = "媒资文件原始名称")
	private String mediaFilename;

	@TableField(value = "create_date")
	@ApiModelProperty(value = "")
	private Date createDate;
	/**
	 * 创建人
	 */
	@TableField(value = "create_people")
	@ApiModelProperty(value = "创建人")
	private String createPeople;
	/**
	 * 修改人
	 */
	@TableField(value = "change_people")
	@ApiModelProperty(value = "修改人")
	private String changePeople;
}
