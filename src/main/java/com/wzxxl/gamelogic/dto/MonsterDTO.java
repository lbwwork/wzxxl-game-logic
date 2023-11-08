package com.wzxxl.gamelogic.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName monster
 */
@Data
public class MonsterDTO implements Serializable {
    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 怪物名称
     */
    @ApiModelProperty("怪物名称")
    private String monsterName;

    /**
     * 种族
     */
    @ApiModelProperty("种族")
    private String race;

    /**
     * 等级code
     */
    @ApiModelProperty("等级code")
    private String gradeCode;

    /**
     * 等级中文
     */
    @ApiModelProperty("等级中文")
    private String gradeName;

    /**
     * 生命值
     */
    @ApiModelProperty("生命值")
    private Long hp;

    /**
     * 魔法值
     */
    @ApiModelProperty("魔法值")
    private Long mp;

    /**
     * 攻击力
     */
    @ApiModelProperty("攻击力")
    private Long attack;

    /**
     * 防御力
     */
    @ApiModelProperty("防御力")
    private Long defense;

    /**
     * 暴击
     */
    @ApiModelProperty("暴击")
    private BigDecimal criticalHit;

    /**
     * 魔法攻击力
     */
    @ApiModelProperty("魔法攻击力")
    private Long magicAttack;

    /**
     * 职业码
     */
    @ApiModelProperty("职业码")
    private String jobCode;

    /**
     * 职业名称
     */
    @ApiModelProperty("职业名称")
    private String jobName;

    private static final long serialVersionUID = 1L;
}