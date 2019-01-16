package org.seckill.dao;/**
 * @Author: Czz
 * @Date: 30/12/2018 2:31 PM
 */

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * @program: seckill
 * @description: 秒杀库存DAO
 * @author: Czz
 * @create: 2018-12-30 14:31
 **/
public interface SeckillDao {

    /**
     * 减少库存
     *
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据id查询
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 分页查询列表
     *
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param(value = "offet") int offet, @Param(value = "limit") int limit);

}
