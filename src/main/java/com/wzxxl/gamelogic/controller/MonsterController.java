package com.wzxxl.gamelogic.controller;

import com.wzxxl.common.result.Response;
import com.wzxxl.gamelogic.dto.MonsterDTO;
import com.wzxxl.gamelogic.service.MonsterService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author libaowen
 * @Date 2023/11/8 15:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/monster")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;

    @PostMapping("/saveMonster")
    @ApiModelProperty(value = "保存怪物信息")
    public Response<Long> saveMonster(@RequestBody MonsterDTO monsterDTO) {
        return monsterService.saveMonster(monsterDTO);
    }
}
