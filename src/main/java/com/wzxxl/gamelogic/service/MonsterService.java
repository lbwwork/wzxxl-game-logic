package com.wzxxl.gamelogic.service;

import com.wzxxl.common.result.Response;
import com.wzxxl.gamelogic.dto.MonsterDTO;

/**
 * @Author libaowen
 * @Date 2023/11/8 15:23
 * @Version 1.0
 */
public interface MonsterService {

    /**
     * 保存怪物信息
     * @param monsterDTO
     * @return
     */
    Response<Long> saveMonster(MonsterDTO monsterDTO);
}
