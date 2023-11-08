package com.wzxxl.gamelogic.mapper;

import com.wzxxl.gamelogic.domain.PlayerAttributes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author libaowen
* @description 针对表【player_attributes(玩家属性)】的数据库操作Mapper
* @createDate 2023-11-08 14:45:51
* @Entity generator.domain.PlayerAttributes
*/
@Mapper
public interface PlayerAttributesMapper {

    /**
     * 新增玩家属性
     * @param playerAttributes
     */
    void insert(@Param("playerAttributes") PlayerAttributes playerAttributes);
}




