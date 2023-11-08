package com.wzxxl.gamelogic.utils;

import com.wzxxl.common.utils.SnowFlakeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author libaowen
 * @Date 2023/11/8 15:30
 * @Version 1.0
 */
@Slf4j
@Component
public class IdUtil {

    private static Long workerId;

    private static Long datacenterId;

    private static Long sequence;

    private static SnowFlakeUtil snowFlakeUtil;
    public static Long getNextId() {
        if (snowFlakeUtil != null) {
            return snowFlakeUtil.nextId();
        }
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            if (snowFlakeUtil != null) {
                return snowFlakeUtil.nextId();
            }
            snowFlakeUtil = new SnowFlakeUtil(workerId, datacenterId, sequence);
            return snowFlakeUtil.nextId();
        } catch (Exception e) {
            log.error("id生成失败", e);
        } finally {
            lock.unlock();
        }
        return null;
    }

    @Value("${workerId}")
    private void setWorkerId(Long workerId) {
        IdUtil.workerId = workerId;
    }

    @Value("${datacenterId}")
    private void setDatacenterId(Long datacenterId) {
        IdUtil.datacenterId = datacenterId;
    }

    @Value("${sequence}")
    private void setSequence(Long sequence) {
        IdUtil.sequence = sequence;
    }
}
