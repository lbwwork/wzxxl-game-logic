package com.wzxxl.gamelogic.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
* 玩家属性
* @TableName player_attributes
*/
@Data
public class PlayerAttributes implements Serializable {

    /**
    * id
    */
    private Long id;
    /**
    * 用户id
    */
    private Long accountId;
    /**
    * 玩家角色名称
    */
    private String nickname;
    /**
    * 攻击力
    */
    private Long attack;
    /**
    * 防御力
    */
    private Long defense;
    /**
    * 暴击（百分比）
    */
    private BigDecimal criticalHit;
    /**
    * 吸血
    */
    private BigDecimal vampire;
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
    * 魔法攻击力
    */
    private Long magicAttack;
    /**
    * 创建时间
    */
    private LocalDateTime createTime;

}
