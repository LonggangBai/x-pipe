package com.ctrip.xpipe.redis.console.healthcheck.action;

import com.ctrip.xpipe.redis.console.healthcheck.RedisHealthCheckInstance;

/**
 * @author chen.zhu
 * <p>
 * Sep 06, 2018
 */
public class InstanceUp extends AbstractInstanceEvent {
    public InstanceUp(RedisHealthCheckInstance instance) {
        super(instance);
    }
}
