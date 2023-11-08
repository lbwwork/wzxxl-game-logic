package com.wzxxl.gamelogic.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName monster
 */
@Data
public class Monster implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 怪物名称
     */
    private String monsterName;

    /**
     * 种族
     */
    private String race;

    /**
     * 等级code
     */
    private String gradeCode;

    /**
     * 等级中文
     */
    private String gradeName;

    /**
     * 生命值
     */
    private Long hp;

    /**
     * 魔法值
     */
    private Long mp;

    /**
     * 攻击力
     */
    private Long attack;

    /**
     * 防御力
     */
    private Long defense;

    /**
     * 暴击
     */
    private BigDecimal criticalHit;

    /**
     * 魔法攻击力
     */
    private Long magicAttack;

    /**
     * 职业码
     */
    private String jobCode;

    /**
     * 职业名称
     */
    private String jobName;

    private static final long serialVersionUID = 1L;
}