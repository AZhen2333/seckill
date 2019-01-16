package org.seckill.dto;/**
 * @Author: Czz
 * @Date: 3/1/2019 10:15 PM
 */

import org.seckill.enmus.SeckillStatEnum;
import org.seckill.entity.SuccessKilled;

/**
 * @program: seckill
 * @description: 封装秒杀执行后的结果
 * @author: Czz
 * @create: 2019-01-03 22:15
 **/
public class SeckillExcution {

    private long seckillId;

    /**
     * 秒杀执行结果状态
     */
    private long state;

    /**
     * 状态标示
     */
    private String stateinfo;

    /**
     * 秒杀成功对象
     */
    private SuccessKilled successKilled;

    public SeckillExcution(long seckillId, SeckillStatEnum seckillStatEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateinfo = seckillStatEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    public SeckillExcution(long seckillId, SeckillStatEnum seckillStatEnum) {
        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateinfo = seckillStatEnum.getStateInfo();
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }

    public String getStateinfo() {
        return stateinfo;
    }

    public void setStateinfo(String stateinfo) {
        this.stateinfo = stateinfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }
}
