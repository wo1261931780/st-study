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
 * 课程分类
 */
@ApiModel(description = "课程分类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "course_category")
public class CourseCategory implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键")
	private String id;
	/**
	 * 分类名称
	 */
	@TableField(value = "`name`")
	@ApiModelProperty(value = "分类名称")
	private String name;
	/**
	 * 分类标签默认和名称一样
	 */
	@TableField(value = "`label`")
	@ApiModelProperty(value = "分类标签默认和名称一样")
	private String label;
	/**
	 * 父结点id（第一级的父节点是0，自关联字段id）
	 */
	@TableField(value = "parentid")
	@ApiModelProperty(value = "父结点id（第一级的父节点是0，自关联字段id）")
	private String parentid;
	/**
	 * 是否显示
	 */
	@TableField(value = "is_show")
	@ApiModelProperty(value = "是否显示")
	private Byte isShow;
	/**
	 * 排序字段
	 */
	@TableField(value = "orderby")
	@ApiModelProperty(value = "排序字段")
	private Integer orderby;
	/**
	 * 是否叶子
	 */
	@TableField(value = "is_leaf")
	@ApiModelProperty(value = "是否叶子")
	private Byte isLeaf;
}
