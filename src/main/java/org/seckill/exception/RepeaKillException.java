package org.seckill.exception;/**
 * @Author: Czz
 * @Date: 3/1/2019 10:20 PM
 */

/**
 * @program: seckill
 * @description: 重复秒杀异常(运行时异常 ， spring才能回滚)
 * @author: Czz
 * @create: 2019-01-03 22:20
 **/
public class RepeaKillException extends SeckillException {

    public RepeaKillException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepeaKillException(String message) {
        super(message);


    }
}
