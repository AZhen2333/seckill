package org.seckill.exception;/**
 * @Author: Czz
 * @Date: 3/1/2019 10:22 PM
 */

/**
 * @program: seckill
 * @description: 秒杀关闭异常
 * @author: Czz
 * @create: 2019-01-03 22:22
 **/
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
