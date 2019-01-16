package org.seckill.exception;/**
 * @Author: Czz
 * @Date: 3/1/2019 10:28 PM
 */

/**
 * @program: seckill
 * @description: 秒杀相关业务异常
 * @author: Czz
 * @create: 2019-01-03 22:28
 **/
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
