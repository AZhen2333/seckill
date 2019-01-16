package org.seckill.service;
/**
 * @program: seckill
 * @description: 秒杀业务逻辑层
 * @author: Czz
 * @create: 2019-01-03 15:25
 **/

        import org.seckill.dto.Exposer;
        import org.seckill.dto.SeckillExcution;
        import org.seckill.entity.Seckill;
        import org.seckill.exception.RepeaKillException;
        import org.seckill.exception.SeckillCloseException;
        import org.seckill.exception.SeckillException;

        import java.util.List;

/**
 * 站在"使用者"角度设计接口
 * 方法定义力度，参数，返回类型
 */
public interface SeckillService {

    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);

    /**
     * 秒杀开启时输出秒杀接口地址，
     * 否则输出系统时间和秒杀时间
     *
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExcution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeaKillException, SeckillCloseException;
}
