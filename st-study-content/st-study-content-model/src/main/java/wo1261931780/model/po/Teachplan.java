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
 * 课程计划
 */
@ApiModel(description = "课程计划")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "teachplan")
public class Teachplan implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "")
	private Long id;
	/**
	 * 课程计划名称
	 */
	@TableField(value = "pname")
	@ApiModelProperty(value = "课程计划名称")
	private String pname;
	/**
	 * 课程计划父级Id
	 */
	@TableField(value = "parentid")
	@ApiModelProperty(value = "课程计划父级Id")
	private Long parentid;
	/**
	 * 层级，分为1、2、3级
	 */
	@TableField(value = "grade")
	@ApiModelProperty(value = "层级，分为1、2、3级")
	private Short grade;
	/**
	 * 课程类型:1视频、2文档
	 */
	@TableField(value = "media_type")
	@ApiModelProperty(value = "课程类型:1视频、2文档")
	private String mediaType;
	/**
	 * 开始直播时间
	 */
	@TableField(value = "start_time")
	@ApiModelProperty(value = "开始直播时间")
	private Date startTime;
	/**
	 * 直播结束时间
	 */
	@TableField(value = "end_time")
	@ApiModelProperty(value = "直播结束时间")
	private Date endTime;
	/**
	 * 章节及课程时介绍
	 */
	@TableField(value = "description")
	@ApiModelProperty(value = "章节及课程时介绍")
	private String description;
	/**
	 * 时长，单位时:分:秒
	 */
	@TableField(value = "timelength")
	@ApiModelProperty(value = "时长，单位时:分:秒")
	private String timelength;
	/**
	 * 排序字段
	 */
	@TableField(value = "orderby")
	@ApiModelProperty(value = "排序字段")
	private Integer orderby;
	/**
	 * 课程标识
	 */
	@TableField(value = "course_id")
	@ApiModelProperty(value = "课程标识")
	private Long courseId;
	/**
	 * 课程发布标识
	 */
	@TableField(value = "course_pub_id")
	@ApiModelProperty(value = "课程发布标识")
	private Long coursePubId;
	/**
	 * 状态（1正常  0删除）
	 */
	@TableField(value = "`status`")
	@ApiModelProperty(value = "状态（1正常  0删除）")
	private Integer status;
	/**
	 * 是否支持试学或预览（试看）
	 */
	@TableField(value = "is_preview")
	@ApiModelProperty(value = "是否支持试学或预览（试看）")
	private String isPreview;
	/**
	 * 创建时间
	 */
	@TableField(value = "create_date")
	@ApiModelProperty(value = "创建时间")
	private Date createDate;
	/**
	 * 修改时间
	 */
	@TableField(value = "change_date")
	@ApiModelProperty(value = "修改时间")
	private Date changeDate;
}
