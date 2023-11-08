package com.wzxxl.gamelogic.service;

import com.wzxxl.common.result.Response;
import com.wzxxl.gamelogic.dto.PlayerAttributesDTO;

/**
* @author libaowen
* @description 针对表【player_attributes(玩家属性)】的数据库操作Service
* @createDate 2023-11-08 14:45:51
*/
public interface PlayerAttributesService {

    /**
     * 保存玩家属性
     * @param playerAttributesDTO
     * @return
     */
    Response<Long> savePlayer(PlayerAttributesDTO playerAttributesDTO);
}
