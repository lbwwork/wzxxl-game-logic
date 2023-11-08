package com.wzxxl.gamelogic.controller;

import com.wzxxl.common.result.Response;
import com.wzxxl.gamelogic.dto.PlayerAttributesDTO;
import com.wzxxl.gamelogic.service.PlayerAttributesService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author libaowen
 * @Date 2023/11/8 14:59
 * @Version 1.0
 */
@RestController
@RequestMapping("/playerAttributes")
public class PlayerAttributesController {

    @Autowired
    private PlayerAttributesService playerAttributesService;

    @PostMapping("/savePlayer")
    @ApiModelProperty("保存玩家属性")
    public Response<Long> savePlayer(@RequestBody PlayerAttributesDTO playerAttributesDTO) {
        return playerAttributesService.savePlayer(playerAttributesDTO);
    }
}
