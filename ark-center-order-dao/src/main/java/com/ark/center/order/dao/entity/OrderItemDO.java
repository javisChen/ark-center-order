package com.ark.center.order.dao.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ark.component.orm.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单明细表
 * </p>
 *
 * @author EOP
 * @since 2022-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("od_order_item")
public class OrderItemDO extends BaseEntity {


    /**
     * 订单ID
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * 订单号
     */
    @TableField("trade_no")
    private String tradeNo;

    /**
     * 商品名称
     */
    @TableField("spu_name")
    private String spuName;

    /**
     * SKU ID
     */
    @TableField("sku_id")
    private Long skuId;

    /**
     * SKU单价
     */
    @TableField("price")
    private Integer price;

    /**
     * 购买数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 应付金额
     */
    @TableField("expect_amount")
    private Integer expectAmount;

    /**
     * 实付金额
     */
    @TableField("actual_amount")
    private Integer actualAmount;

    /**
     * 图片地址
     */
    @TableField("pic_url")
    private String picUrl;

    /**
     * SKU销售参数JSON
     */
    @TableField("spec_data")
    private String specData;



}
