package wo1261931780.model.po;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*Created by Intellij IDEA.
*Project:st-study
*Package:wo1261931780.model.po
*@author liujiajun_junw
*@Date 2024-06-01-31  星期五
*@Description 
*/

/**
 * 课程基本信息
 */
@ApiModel(description="课程基本信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "course_base")
public class CourseBase implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 机构ID
     */
    @TableField(value = "company_id")
    @ApiModelProperty(value="机构ID")
    private Long companyId;

    /**
     * 机构名称
     */
    @TableField(value = "company_name")
    @ApiModelProperty(value="机构名称")
    private String companyName;

    /**
     * 课程名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="课程名称")
    private String name;

    /**
     * 适用人群
     */
    @TableField(value = "users")
    @ApiModelProperty(value="适用人群")
    private String users;

    /**
     * 课程标签
     */
    @TableField(value = "tags")
    @ApiModelProperty(value="课程标签")
    private String tags;

    /**
     * 大分类
     */
    @TableField(value = "mt")
    @ApiModelProperty(value="大分类")
    private String mt;

    /**
     * 小分类
     */
    @TableField(value = "st")
    @ApiModelProperty(value="小分类")
    private String st;

    /**
     * 课程等级
     */
    @TableField(value = "grade")
    @ApiModelProperty(value="课程等级")
    private String grade;

    /**
     * 教育模式(common普通，record 录播，live直播等）
     */
    @TableField(value = "teachmode")
    @ApiModelProperty(value="教育模式(common普通，record 录播，live直播等）")
    private String teachmode;

    /**
     * 课程介绍
     */
    @TableField(value = "description")
    @ApiModelProperty(value="课程介绍")
    private String description;

    /**
     * 课程图片
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="课程图片")
    private String pic;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    @ApiModelProperty(value="创建时间")
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField(value = "change_date",fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value="修改时间")
    private Date changeDate;

    /**
     * 创建人
     */
    @TableField(value = "create_people")
    @ApiModelProperty(value="创建人")
    private String createPeople;

    /**
     * 更新人
     */
    @TableField(value = "change_people")
    @ApiModelProperty(value="更新人")
    private String changePeople;

    /**
     * 审核状态
     */
    @TableField(value = "audit_status")
    @ApiModelProperty(value="审核状态")
    private String auditStatus;

    /**
     * 课程发布状态 未发布  已发布 下线
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="课程发布状态 未发布  已发布 下线")
    private String status;

    private static final long serialVersionUID = 1L;
}
