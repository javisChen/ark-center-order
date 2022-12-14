package com.ark.center.order.dao.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ark.component.orm.mybatis.base.BaseEntity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.ark.component.common.enums.BasicEnums;
import com.ark.component.common.enums.EnumUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * <p>
 * 订单收货信息
 * </p>
 *
 * @author EOP
 * @since 2022-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("od_receive")
public class ReceiveDO extends BaseEntity {


    /**
     * 订单ID
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * 收货人名称
     */
    @TableField("`name`")
    private String name;

    /**
     * 收货人电话
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 省份
     */
    @TableField("province")
    private String province;

    /**
     * 城市
     */
    @TableField("city")
    private String city;

    /**
     * 区
     */
    @TableField("district")
    private String district;

    /**
     * 详细地址
     */
    @TableField("address")
    private String address;

    /**
     * 街道
     */
    @TableField("street")
    private String street;

}
