package org.seckill.entity;/**
 * @Author: Czz
 * @Date: 30/12/2018 2:25 PM
 */

import java.util.Date;

/**
 * @program: seckill
 * @description: 秒杀库存表实体类
 * @author: Czz
 * @create: 2018-12-30 14:25
 **/
public class Seckill {

    private long sesckillId;

    private int number;

    private String name;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    public long getSesckillId() {
        return sesckillId;
    }

    public void setSesckillId(long sesckillId) {
        this.sesckillId = sesckillId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
