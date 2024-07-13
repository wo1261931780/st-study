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
 * 课程发布
 */
@ApiModel(description = "课程发布")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "course_publish_pre")
public class CoursePublishPre implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 机构ID
	 */
	@TableField(value = "company_id")
	@ApiModelProperty(value = "机构ID")
	private Long companyId;
	/**
	 * 公司名称
	 */
	@TableField(value = "company_name")
	@ApiModelProperty(value = "公司名称")
	private String companyName;
	/**
	 * 课程名称
	 */
	@TableField(value = "`name`")
	@ApiModelProperty(value = "课程名称")
	private String name;
	/**
	 * 适用人群
	 */
	@TableField(value = "users")
	@ApiModelProperty(value = "适用人群")
	private String users;
	/**
	 * 标签
	 */
	@TableField(value = "tags")
	@ApiModelProperty(value = "标签")
	private String tags;
	/**
	 * 创建人
	 */
	@TableField(value = "username")
	@ApiModelProperty(value = "创建人")
	private String username;
	/**
	 * 大分类
	 */
	@TableField(value = "mt")
	@ApiModelProperty(value = "大分类")
	private String mt;
	/**
	 * 大分类名称
	 */
	@TableField(value = "mt_name")
	@ApiModelProperty(value = "大分类名称")
	private String mtName;
	/**
	 * 小分类
	 */
	@TableField(value = "st")
	@ApiModelProperty(value = "小分类")
	private String st;
	/**
	 * 小分类名称
	 */
	@TableField(value = "st_name")
	@ApiModelProperty(value = "小分类名称")
	private String stName;
	/**
	 * 课程等级
	 */
	@TableField(value = "grade")
	@ApiModelProperty(value = "课程等级")
	private String grade;
	/**
	 * 教育模式
	 */
	@TableField(value = "teachmode")
	@ApiModelProperty(value = "教育模式")
	private String teachmode;
	/**
	 * 课程图片
	 */
	@TableField(value = "pic")
	@ApiModelProperty(value = "课程图片")
	private String pic;
	/**
	 * 课程介绍
	 */
	@TableField(value = "description")
	@ApiModelProperty(value = "课程介绍")
	private String description;
	/**
	 * 课程营销信息，json格式
	 */
	@TableField(value = "market")
	@ApiModelProperty(value = "课程营销信息，json格式")
	private String market;
	/**
	 * 所有课程计划，json格式
	 */
	@TableField(value = "teachplan")
	@ApiModelProperty(value = "所有课程计划，json格式")
	private String teachplan;
	/**
	 * 教师信息，json格式
	 */
	@TableField(value = "teachers")
	@ApiModelProperty(value = "教师信息，json格式")
	private String teachers;
	/**
	 * 提交时间
	 */
	@TableField(value = "create_date")
	@ApiModelProperty(value = "提交时间")
	private Date createDate;
	/**
	 * 审核时间
	 */
	@TableField(value = "audit_date")
	@ApiModelProperty(value = "审核时间")
	private Date auditDate;
	/**
	 * 状态
	 */
	@TableField(value = "`status`")
	@ApiModelProperty(value = "状态")
	private String status;
	/**
	 * 备注
	 */
	@TableField(value = "remark")
	@ApiModelProperty(value = "备注")
	private String remark;
	/**
	 * 收费规则，对应数据字典--203
	 */
	@TableField(value = "charge")
	@ApiModelProperty(value = "收费规则，对应数据字典--203")
	private String charge;
	/**
	 * 现价
	 */
	@TableField(value = "price")
	@ApiModelProperty(value = "现价")
	private Double price;
	/**
	 * 原价
	 */
	@TableField(value = "original_price")
	@ApiModelProperty(value = "原价")
	private Double originalPrice;
	/**
	 * 课程有效期天数
	 */
	@TableField(value = "valid_days")
	@ApiModelProperty(value = "课程有效期天数")
	private Integer validDays;
}
