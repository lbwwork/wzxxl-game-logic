package com.wzxxl.gamelogic.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
* 玩家属性
* @TableName player_attributes
*/
@Data
public class PlayerAttributesVO implements Serializable {

    /**
    * id
    */
    @ApiModelProperty("id")
    private Long id;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long accountId;
    /**
    * 玩家角色名称
    */
    @NotBlank(message="[玩家角色名称]不能为空")
    @Size(max= 16,message="编码长度不能超过16")
    @ApiModelProperty("玩家角色名称")
    @Length(max= 16,message="编码长度不能超过16")
    private String nickname;
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
    * 暴击（百分比）
    */
    @ApiModelProperty("暴击（百分比）")
    private BigDecimal criticalHit;
    /**
    * 吸血
    */
    @ApiModelProperty("吸血")
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
    @ApiModelProperty("魔法攻击力")
    private Long magicAttack;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createTime;

}
