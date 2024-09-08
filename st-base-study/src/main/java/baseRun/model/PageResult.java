package baseRun.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author junw
 */
@Data
@ApiModel("返回结果")
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> implements Serializable {

	@ApiModelProperty("记录数")
	private long counts;

	@ApiModelProperty("页码")
	private long page;

	@ApiModelProperty("每页记录数")
	private long pageSize;

	@ApiModelProperty("数据体")
	private List<T> items;

	/**
	 * 返回结果
	 *
	 * @param items    数据体
	 * @param counts   记录数
	 * @param page     页码
	 * @param pageSize 每页记录数
	 */
	public PageResult(List<T> items, long counts, long page, long pageSize) {
		this.items = items;
		this.counts = counts;
		this.page = page;
		this.pageSize = pageSize;
	}
}
