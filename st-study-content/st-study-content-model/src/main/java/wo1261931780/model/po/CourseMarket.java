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
 * 课程营销信息
 */
@ApiModel(description = "课程营销信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "course_market")
public class CourseMarket implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键，课程id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键，课程id")
	private Long id;
	/**
	 * 收费规则，对应数据字典
	 */
	@TableField(value = "charge")
	@ApiModelProperty(value = "收费规则，对应数据字典")
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
	 * 咨询qq
	 */
	@TableField(value = "qq")
	@ApiModelProperty(value = "咨询qq")
	private String qq;
	/**
	 * 微信
	 */
	@TableField(value = "wechat")
	@ApiModelProperty(value = "微信")
	private String wechat;
	/**
	 * 电话
	 */
	@TableField(value = "phone")
	@ApiModelProperty(value = "电话")
	private String phone;
	/**
	 * 有效期天数
	 */
	@TableField(value = "valid_days")
	@ApiModelProperty(value = "有效期天数")
	private Integer validDays;
}
