package com.wzxxl.gamelogic.mapper;

import com.wzxxl.gamelogic.domain.Monster;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author libaowen
* @description 针对表【monster】的数据库操作Mapper
* @createDate 2023-11-08 15:11:40
* @Entity generator.domain.Monster
*/
@Mapper
public interface MonsterMapper {

    /**
     * 新增方法
     * @param monster
     */
    void insert(@Param("monster") Monster monster);
}




