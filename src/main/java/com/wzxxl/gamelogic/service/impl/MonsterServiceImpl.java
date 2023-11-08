package com.wzxxl.gamelogic.service.impl;

import com.wzxxl.common.result.Response;
import com.wzxxl.gamelogic.domain.Monster;
import com.wzxxl.gamelogic.dto.MonsterDTO;
import com.wzxxl.gamelogic.mapper.MonsterMapper;
import com.wzxxl.gamelogic.service.MonsterService;
import com.wzxxl.gamelogic.utils.IdUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author libaowen
 * @Date 2023/11/8 15:23
 * @Version 1.0
 */

@Service
public class MonsterServiceImpl implements MonsterService {

    @Autowired
    private MonsterMapper monsterMapper;

    @Override
    public Response<Long> saveMonster(MonsterDTO monsterDTO) {
        Monster monster = new Monster();
        BeanUtils.copyProperties(monsterDTO, monster);
        Long nextId = IdUtil.getNextId();
        monster.setId(nextId);
        monsterMapper.insert(monster);
        return Response.success(nextId);
    }
}
