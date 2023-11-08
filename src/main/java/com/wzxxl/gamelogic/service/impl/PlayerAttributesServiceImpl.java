package com.wzxxl.gamelogic.service.impl;

import com.wzxxl.common.result.Response;
import com.wzxxl.gamelogic.domain.PlayerAttributes;
import com.wzxxl.gamelogic.dto.PlayerAttributesDTO;
import com.wzxxl.gamelogic.mapper.PlayerAttributesMapper;
import com.wzxxl.gamelogic.service.PlayerAttributesService;
import com.wzxxl.gamelogic.utils.IdUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
* @author libaowen
* @description 针对表【player_attributes(玩家属性)】的数据库操作Service实现
* @createDate 2023-11-08 14:45:51
*/
@Service
public class PlayerAttributesServiceImpl implements PlayerAttributesService {

    @Autowired
    private PlayerAttributesMapper playerAttributesMapper;

    @Override
    public Response<Long> savePlayer(PlayerAttributesDTO playerAttributesDTO) {
        PlayerAttributes playerAttributes = new PlayerAttributes();
        BeanUtils.copyProperties(playerAttributesDTO, playerAttributes);
        Long nextId = IdUtil.getNextId();
        playerAttributes.setId(nextId);
        playerAttributes.setCreateTime(LocalDateTime.now());
        playerAttributesMapper.insert(playerAttributes);
        return Response.success(nextId);
    }
}




